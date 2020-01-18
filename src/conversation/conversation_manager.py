from conversation_types import Invitation
import pika
 
class ConversationManager(object):
    """
    We have 3 dependencies for that class:
    1. Transport Model (The underlaying Messaging Framework)
    2. MessageAdapter - format the message in the appropriate format
    3. The Governance Plugins
    What about the dispatcher???
    """
    def __init__(self, messageAdapter,  governanceStack):
        self.messageAdapter = messageAdapter
        self.governanceStack = governanceStack
    
    """
    1. Create fresh Conversation by convID(fresh name) and globalProtocolID
    Note that connection is established when we create a Conversation
    2. Send invitations to initiator for all roles for the 
    """
    def create_conversation(self, convID, protocolID, initiator):
        conversation = Conversation(convID, protocolID)
        
        # 1.create connection and channel
        self.connection = pika.BlockingConnection(pika.ConnectionParameters(host = 'localhost'))
        self.channel = self.connection.channel()
        
        # create exchange with routing key equal to convID
        self.channel.exchange_declare(exchange=convID,
                                      type='direct')
        
        for role in conversation.get_roles():
            # 3.1 create queues with queue_name = role, this are queue for the invitations
            invitationQueueName = Invitation.invitation_queue_name(convID, role)
            self.channel.queue_declare(queue_name = invitationQueueName, exclusive=True)
            
            # Here we use the default exchange. No routing. 
            # Invitations are send to concrete queues
            self.channel.queue_bind(exchange="",
                                    queue=invitationQueueName)
            localCapability = conversation.get_capability_for_role(role)
            invitation = Invitation(convID, role, localCapability, initiator) 
            # 3.2 send invitations to the queue so a participant can join
            self.send_invitation(invitation)
        pass
    
    
    def send_conversation_msg(self, convMsg):
        status = all (monitor.check_outgoing_invitation(convMsg)
                      for monitor in self.governanceStack)
        if status: 
            msg = self.messageAdapter.to_conversation_msg(convMsg)
            self.channel.basic_publish(exchange = convMsg.convID,
                                       routing_key = convMsg.toRole,  
                                       body = msg) 
        
    def receive_converstation_msg(self, msg):
        convMsg = self.messageFormatter.formatToConvMsg(msg)
        status = all (monitor.check_outgoing_invitation(convMsg)
                      for monitor in self.governanceStack)
        
        if status:
            return convMsg.content
        else: return None
    
    def send_invitation(self, invitation):
        status = all (monitor.check_outgoing_invitation(invitation)
                      for monitor in self.governanceStack) 
        
        msg = self.messageAdapter.from_invitation(invitation)
        invitationQueueName = Invitation.invitation_queue_name(invitation.convID, 
                                                                 invitation.role) 
        if status: self.channel.basic_publish(exchange = "", 
                                              routing_key = invitationQueueName, 
                                              body = msg)
            
    
    def recevie_invitation(self, msg):
        # Again the invitation contains from who and to who
        invitation = self.messageAdapter.to_invitation(msg)
        # TODO: Add dispatcher...Dispatcher will decide whether to send it.
        status = all (monitor.check_outgoing_invitation(invitation)
                      for monitor in self.governanceStack) 
        if status:
            participantQueue = self.channel.queue_declare(exclusive=True)
            
            self.channel.queue_bind(exchange=invitation.convID,
                                    queue=participantQueue.queue.method, 
                                    routing_key = invitation.participant)
            
            self.channel.basic_consume(self.receive_converstation_msg,
                                       queue = participantQueue) 
            
    def accept_invitation(self, convID, role):
        # Start listening on the queue
        invitationQueueName = Invitation.invitation_queue_name(convID, role)
        
        self.channel.basic_consume(self.receive_invitation,
                                   queue = invitationQueueName) 