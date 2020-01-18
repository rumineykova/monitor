import sys
import pika
from core.message_adapter import AMQPConversationMessageAdapter
from conversation.conversation_types import LocalType, Invitation
from conversation.protocol_providers import DefaultProtocolProvider

class Monitor(object):
    def init(self, provider):
        pass

class ExternalMonitor(object):
    DEFAULT_MONITOR_PORT = 5673
    messageAdapter = AMQPConversationMessageAdapter()
    protocolProvider = DefaultProtocolProvider()
    
    def __init__(self, host, port):
        self.monitor = Monitor(self.protocolProvider)
        self.connection = pika.BlockingConnection(pika.ConnectionParameters(host = 'localhost'))
        self.channel = self.connection.channel()
    
    def add_conversation(self, convID, protocolID, initiatre):
        self.monitor.on_create_conversation(convID, protocolID)
        roles = self.protocolProvider.get_roles_by_protocolID(protocolID)
        
        for role in roles:
            # 3.1 create queues with queue_name = role, this are queue for the invitations
            invitationQueueName = Invitation.invitation_queue_name(convID, role)
            self.channel.queue_declare(queue=invitationQueueName)
            self.channel.basic_consume(self.on_receive_invitation,
                                       queue = invitationQueueName, 
                                       no_ack = True)
            self.channel.start_consuming()
        
    def on_receive_invitation(self, msg):
        invitation = self.messageAdapter(msg)
        self.monitor.on_incoming_invitations(invitation)
        self.monitor.on_accept_invitation(invitation)
        # Start listening on this participant queue
        #invitationQueueName = invitation.getQueueName()
        self.channel.basic_consume(self.on_receive_msg,
                                   queue = invitation.getQueueName) 
        
    def on_receive_msg(self, msg):
        convMsg = self.messageAdapter.to_conversation_msg(msg)
        try:
            if (convMsg.LocalType == LocalType.RESV):
                self.monitor.check_incoming_msg(convMsg)
            else: self.monitor.check_outgoing_msg(convMsg) 
            self.forwardMessage(msg, )
        except Exception:
            self.process_wrong_message(convMsg)
                    
    def forward_message(self, exchangeName, routingKey, msg):
        self.channel.basic_publish(exchange = exchangeName, 
                                   routing_key = routingKey, 
                                   body = msg)
        
    def process_wrong_message(self, convMsg):
        print "Help. I receive wrong message."
        
    def set_message_adapter(self, messageAdapter):
        self.messageAdapter = messageAdapter
    
    
    
def main (argv): 
    pass

if __name__ == "__main__":
    sys.exit (main (sys.argv))
