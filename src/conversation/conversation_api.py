import os
import sys
import pika
import uuid
from conversation_types import Invitation, ConversationMessage, LocalType
from core.message_adapter import AMQPConversationMessageAdapter
from core.conversation_interceptor import ConversationInterceptor

"""Start a test for monitoring an existing conversation"""
def start_monitor(participant):
    try:
        initiator_monitor = ConversationInterceptor(participant)
        initiator_monitor.start()
    except:
        sys.exit()
           
def create_invitation(cid, role, participant, lt_file):
        return Invitation(cid = cid,
                          role = role,
                          local_capability = lt_file, 
                          participant = participant)

class Protocol(object):
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

class InterruptExcpetion(object):
    """This is the Interrupt Exception class."""
    def __init__(self, value):
        self.value = value

    def __str__(self):
        return 'self.value'

"""
Example of configure_protocol 
def create_data_acquisition_conversation(cid):
    participants = [['carol', 'A', apps_utils.get_lt_full_name('DataAcquisition_at_A.spr')], 
                    ['bob', 'U', apps_utils.get_lt_full_name('DataAcquisition_at_U.spr')], 
                    ['alice', 'I', apps_utils.get_lt_full_name('DataAcquisition_at_I.spr')]]
    conversation = Protocol(cid, participants)
    return conversation 

"""     
class Conversation(object):
    def __init__(self, role, 
                 participant, 
                 participants_config = None, 
                 is_monitorable = False):
        # Participant attributes
        self.role = str.lower(role)
        self.participant = str.lower(participant)
        
        # Communication related 
        #self.cid = str(uuid.uuid4())
        self.adapter = AMQPConversationMessageAdapter()
        self.invitation_queue =  self.participant 
        
        #Protocol related
        self.participants_description = participants_config if participants_config else None
        self.protocol = None
        interrupt_msg = None
        interrup_callback = None
        #TODO: Fix me!!!
        self.is_monitorable = is_monitorable
        self.configure_invitation_bindings()
        
    @classmethod    
    def join(cls, configuration, self_role, participant, is_originator = False, is_monitorable = False):
        conversation = Conversation(self_role, participant, configuration, is_monitorable)
        conversation.__establish_connection()
        
        if (is_originator):
            conversation.cid = str(uuid.uuid4())
            invitations = conversation.create_invitations()
            conversation.invite_self_role(invitations)  
            conversation.invite_participants(invitations)
        else: 
            conversation.receive_invitation()
        return conversation 
    
    def send(self, other_role, label, *args):
        conv_msg = ConversationMessage(self.cid, label, 
                                       args, self.role, 
                                       other_role)
        msg = self.adapter.from_converastion_msg(conv_msg)
        print "Publishing msg to exchange:%s  with binding: %s \n message: %s" %(self.exchange_name,
                                                       conv_msg.get_binding(), msg)
        
        self.channel.basic_publish(exchange = self.exchange_name, 
                                   routing_key = conv_msg.get_binding(), 
                                   body = msg)
    
    def receive(self, role):
        self.received_msg = None
        while self.received_msg == None:
            method_frame, _ , body = self.channel.basic_get(queue=str.lower(self.role), no_ack = True)
            # It can be empty if the queue is empty so don't do anything
            if method_frame.NAME == 'Basic.GetEmpty':
                pika.log.info("Empty Basic.Get Response (Basic.GetEmpty)")
                # We have data
            else: self.received_msg = self.adapter.to_conversation_msg(body)

            # Acknowledge the receipt of the data
        print 'I have received the message!'
        print 'The received message is:%s' %(self.received_msg)
        return self.received_msg
    
    def create_invitations(self):
        invitations = []
        [invitations.append(create_invitation(self.cid, node[1], node[0], node[2])) 
         for node in self.participants_description]
        return invitations
    
    def configure_interrup(self, interaction_msg, callback):
        self.interrupt_msg = interaction_msg
        self.interrup_callback = callback
    
    def configure_invitation_bindings(self):
        self.invitation_exchange = self.participant if self.is_monitorable else ''
    
    def configure_bindings(self):
        self.exchange_name =  str.lower(self.participant) if self.is_monitorable else str(self.cid) 
    
    def __handle_receive(self, ch, method, properties, body):
        print 'In received messages!'
        self.received_msg = self.adapter.to_conversation_msg(body)
        #self.channel.stop_consuming()
        #TODO: Handle interrupt message, please
        #if (self.interrupt_msg and (self.interrupt_msg.label == self.received_msg.label)):
        #    raise InterruptExcpetion('interrupt')
    
    def invite_self_role(self, invitations):
        self_invitation = [inv for inv in invitations
                           if (inv.participant == self.participant)]
        if (not self_invitation):
            raise Exception('List of invitations does not have the participant name: %s' %(self.participant))
        self_invitation = self_invitation.pop()
        self.send_invitation(self_invitation)
        self.receive_invitation()
        
    def invite_participants(self, invitations):
        [self.send_invitation(inv) for inv in invitations
         if not(inv.participant == self.participant)]
        
    def receive_invitation(self):
        channel= self.channel
        print "receive_invitation: wait on exchange:%s binding:%s" %(self.invitation_exchange, self.invitation_queue)
        channel.queue_declare(queue=self.invitation_queue)
        if not(self.invitation_exchange==''):
            channel.queue_bind(exchange = self.invitation_exchange,
                               queue=self.invitation_queue, 
                               routing_key=self.invitation_queue)
        
        channel.basic_consume(self.accept_invitation,
                              queue = self.invitation_queue,  
                              no_ack = True)
        self.channel.start_consuming()
        
    def accept_invitation(self, ch, method, properties, body):
        print "accept_invitation: %s" %(body)        
        self.channel.stop_consuming()
        invitation = self.adapter.to_invitation_msg(body)
        awaiting_invitation = create_invitation(invitation.cid, self.role, self.participant, invitation.local_capability)
        # Monitor also checks the invitation
        if (awaiting_invitation.participant==invitation.participant):
            self.cid = invitation.cid 
            self.configure_bindings()
            self.incoming_binding = str.lower("*.*.%s" %(self.role))
            print"in accept: queue%s, exchange: %s" %(self.role, self.exchange_name)
            
            self.channel.exchange_declare(exchange = self.exchange_name, type='topic')
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
                 
    def __establish_connection(self):
        print "establish_connection %s" %(self.participant)
        self.connection = pika.BlockingConnection(pika.ConnectionParameters(host = 'localhost'))
        self.channel = self.connection.channel()
        
    def close(self):
        self.connection.close()
        
    def receive_async(self, role, callback):
        # FIX me!. I should be asynchronous
        self.received_msg = None
        self.callback = callback
        self.channel.basic_consume(self.__handle_async_receive,
                                   queue = str.lower(self.role), 
                                   no_ack = True)
        self.channel.start_consuming()
        
    def __handle_async_receive(self, ch, method, properties, body):
        self.channel.stop_consuming()
        msg = self.adapter.to_conversation_msg(body)
        self.callback(self, msg)
