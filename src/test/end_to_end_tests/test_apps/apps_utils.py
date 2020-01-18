import os
import sys
import pika
import timeit
from core.conversation_interceptor import ConversationInterceptor
from conversation.conversation_types import Invitation, ConversationMessage, LocalType
from common.configuration import Configuration
from core.message_adapter import AMQPConversationMessageAdapter
from threading import Thread

#---------------------------------Conversation Utils functions----------------------------------
def create_conv_msg(cid, self_role, local_type, label_, role_, msg_content = None):
    if (local_type == LocalType.SEND):
        to_role = role_
        from_role = self_role
    elif(local_type == LocalType.RESV):
        from_role = role_
        to_role = self_role
    else: raise Exception('Unknown Local Type')
    if msg_content: msg_content = msg_content[-1] 
    else: msg_content = 'I am a test conversation message'
    test_conv_msg = ConversationMessage(cid=cid, label=label_,
                                        content=msg_content,
                                        sender_role=from_role, receiver_role=to_role)
    return test_conv_msg      
        
def create_invitation(cid, role, participant, lt_file):
        return Invitation(cid = cid,
                          role = role,
                          local_capability = lt_file, 
                          participant = participant)

def get_lt_full_name(file_name):
    return os.path.join(Configuration.get_specs_directory(), 
                        file_name)
#----------------------------------------------------------------------------------

class BaseConversation(object):
    """ participant_description contains lists with elements of the form:
        [participant, role, lt_file]
    """
    def __init__(self, cid, particpants_description):
        self.cid = cid
        self.participants_description = particpants_description
        self.invitations = self.create_invitations()
        
    def create_invitations(self):
        invitations = {}
        [invitations.setdefault(create_invitation(self.cid, node[1], node[0], node[2])) 
         for node in self.participants_description]
        return invitations

# TODO: wrap participants in a class participant
""" Interactions are represented as list -> [local_type, label, role] """
class BaseApp(object):
    def __init__(self, cid, role, 
                 participant, 
                 interactions, 
                 lt_file,
                 start_conversation= None):
        # Participant attributes
        self.role = str.lower(role)
        self.participant = str.lower(participant)
        self.cid = cid
        self.lt_file = lt_file
        
        # Communication related 
        self.adapter = AMQPConversationMessageAdapter()
        #self.queue_name = str.lower("%s_%s" %(self.participant,self.role))
        self.invitation_queue =  self.participant 
        self.interactions = interactions
        self.messages = self.create_messages_from_interactions(interactions)
        self.next_interaction = 0
        
        #If this is the conversation initiator
        self.start_conversation = start_conversation
        self.conversation = None
        
    def set_monitor_off(self):       
        self.exchange_name = str(self.cid)
        self.invitation_exchange = ''
    
    def set_monitor_on(self):
        self.exchange_name = str.lower(self.participant)
        self.invitation_exchange = self.participant
    
    def create_messages_from_interactions(self, interactions):
        return [create_conv_msg(self.cid, self.role, node[0], node[1], node[2], node[3:]) 
                for node in interactions]
        
    def start(self):
        print 'start client'
        self.__establish_connection()
        if (self.start_conversation is not None):
            self.conversation = self.start_conversation(self.cid)
            self.join()  
            self.invite_participants()
        else: 
            self.receive_invitation() 
            self.channel.start_consuming()       
        self.__continue_with_interactions()
        self.receive()
        
    def join (self):
        self_invitation = [inv for inv in self.conversation.invitations
                           if (inv.participant == self.participant)][0]
        self.receive_invitation()
        self.send_invitation(self_invitation)
        self.channel.start_consuming()
        print "I accept the invitation"
        
    def invite_participants(self):
        [self.send_invitation(inv) for inv in self.conversation.invitations
         if not(inv.participant == self.participant)]
        
    def receive_invitation(self):
        channel= self.channel
        print "receive_invitation: wait on exchange:%s binding:%s" %(self.invitation_exchange, self.invitation_queue)
        channel.exchange_declare(exchange = self.exchange_name, type='topic')
        channel.queue_declare(queue=self.invitation_queue)
        if not(self.invitation_exchange==''):
            channel.queue_bind(exchange = self.invitation_exchange,
                               queue=self.invitation_queue, 
                               routing_key=self.invitation_queue)
        
        channel.basic_consume(self.accept_invitation,
                                   queue = self.invitation_queue,  
                                   no_ack = True)
        
    def accept_invitation(self, ch, method, properties, body):
        print "accept_invitation: %s" %(body)        
        self.channel.stop_consuming()
        invitation = self.adapter.to_invitation_msg(body)
        awaiting_invitation = create_invitation(invitation.cid, self.role, self.participant, self.lt_file)
        # TODO: ugly way for comparison. Don't be that lazy
        # TODO: Add full check participant, role, local_type
        if (awaiting_invitation.participant==invitation.participant):
            
            self.incoming_binding = str.lower("*.*.%s" %(self.role))
            print"in accept: queue%s, exchange: %s" %(self.role, self.participant)
            self.channel.queue_declare(queue=str.lower(self.role))
            self.channel.queue_bind(exchange=self.exchange_name,
                                    queue=str.lower(self.role), 
                                    routing_key=self.incoming_binding)
        else: 
            raise Exception("Invitation:%s does not match with participant awaiting invitation:%s" 
                            %(invitation.__dict__, awaiting_invitation.__dict__))
     
    def send_invitation(self, invitation):
        """ 
        We create participant queue that will handle the invitation
        to handle the case when the required participant has not yet started 
        """
        print "send_invitation: %s" %(invitation)
        self.channel.queue_declare(queue=invitation.invitation_queue_name())
        
        msg = self.adapter.from_invitation_msg(invitation)
        self.channel.basic_publish(exchange = '', 
                                   routing_key=invitation.invitation_queue_name(), 
                                   body=msg)
                 
    def receive(self):
        self.channel.basic_consume(self.__handle_receive,
                                   queue = str.lower(self.role), 
                                   no_ack = True)
        self.channel.start_consuming()
        
    def send(self, conv_msg):
        msg = self.adapter.from_converastion_msg(conv_msg)
        print "Publishing msg %d to exchange:%s  %s" %(self.next_interaction, 
                                                                     self.exchange_name,
                                                                     msg)
        
        self.channel.basic_publish(exchange = self.exchange_name, 
                                   routing_key = conv_msg.get_binding(), 
                              body = msg)
        self.next_interaction = self.next_interaction + 1
        self.__continue_with_interactions()
    
    def __handle_receive(self, ch, method, properties, body):
        print 'Receive %r %s' %(body, method)
        self.next_interaction = self.next_interaction + 1
        self.__continue_with_interactions()
        
    def __continue_with_interactions(self):
        if (self.next_interaction == len(self.messages)): 
            print "I am done, ahu"
            self.channel.stop_consuming()
            #self.channel.close()
            #self.connection.close()
            return
        else:
            print "__continue_with_interactions: next_interaction: %s" %(self.interactions[self.next_interaction])
            while ((self.next_interaction<len(self.interactions)) and (self.interactions[self.next_interaction][0] == LocalType.SEND)):
                    self.send(self.messages[self.next_interaction])
            if (self.next_interaction == len(self.messages)): 
                print "iuhu, I am done"
                self.channel.stop_consuming()
                #self.channel.close()
                #self.connection.close()
                return
        
    def __establish_connection(self):
        print "establish_connection %s" %(self.participant)
        self.connection = pika.BlockingConnection(pika.ConnectionParameters(host = 'localhost'))
        #pika.ConnectionParameters('146.169.4.50'))
        self.channel = self.connection.channel()
                
"""Start a test for monitoring an existing conversation"""
def start_monitor(cid, participant, role, lt_file):
    try:
        initiator_monitor = ConversationInterceptor(participant)
        initiator_monitor.start()
    except:
        sys.exit()