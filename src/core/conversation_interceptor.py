from monitor import ConversationMonitor
from messaging.exchange_gateway import ExchangeGateway
from core.message_adapter import AMQPConversationMessageAdapter
from fsm import ExceptionFSM, ExceptionFailAssertion

class ConversationInterceptor(object):
    DEFAULT_EXCHANGE = '' 
    RESEND = 'RESEND'
    def __init__(self, participant):
        self.participant = participant
        self.conversation_monitor = ConversationMonitor()
        self.message_adapter = AMQPConversationMessageAdapter()
        self.invitations = {}
        self.gateway = ExchangeGateway()
        self.monitor_enabled = True
        
    def start(self):
        # received all invitations for the participant and forward them to the participant queue
        self.gateway.start_forwarding(self.DEFAULT_EXCHANGE, #source_exchange  
                                              self.participant,      #destination_exchange  
                                              self.participant,      #source_binding
                                              self.on_incoming_invitation, #interceptor  
                                              self.participant)     #source_queue_name
        self.gateway.consume(self.participant)
        self.__handle_accept_invitation()

    """ on_incoming_invitations is meant to be used for checking of send_invitation, 
        check when an invitation arrive, not when it is accepted
        In the current setting receiving an invitation means accepting it. """      
    def on_incoming_invitation(self, ch, method, properties, body):
        # in invitation
        print "on_incoming_invitation: %s" %(self.participant)
        invitation = self.message_adapter.to_invitation_msg(body) 
        if self.monitor_enabled:
            self.conversation_monitor.on_incoming_invitations(invitation)
        self.invitations.setdefault(self.participant, invitation)         
        # callback_queue
        properties.reply_to = self.participant
        return (self.RESEND, method, properties, True, None)
                                                
    def on_outgoing_msg(self, ch, method, properties, body):
        print 'on_outgoing_msg'
        conv_msg = self.message_adapter.to_conversation_msg(body)
        monitor_check = self.conversation_monitor.check_outgoing_msg
        result = self.__on_msg_intercept(monitor_check, conv_msg)
        print 'Result from on_outgoing_msg:%s' % (result)
        return (result, method, properties, False, None)
    
    def on_incoming_msg(self, ch, method, properties, body):
        print 'on_incoming_msg'
        conv_msg = self.message_adapter.to_conversation_msg(body)
        monitor_check = self.conversation_monitor.check_incoming_msg
        result = self.__on_msg_intercept(monitor_check, conv_msg)
        return (result, method, properties, False, None)
    
    def __handle_accept_invitation(self):
        print "_handle_accept_invitation: exchange: %s" %self.participant
        invitation = self.invitations.get(self.participant, )
        if self.monitor_enabled:
            self.conversation_monitor.on_accept_invitation(invitation)
        
        monitor_queue = 'monitor-%s' %(self.participant)
        self.gateway.start_forwarding(self.participant, 
                                               invitation.cid, 
                                               "*.%s.*" %(invitation.role), 
                                               self.on_outgoing_msg, 
                                               monitor_queue)
        
        self.gateway.start_forwarding(invitation.cid, 
                                               self.participant, 
                                               "*.*.%s" %(invitation.role), 
                                               self.on_incoming_msg, 
                                               monitor_queue)
        self.gateway.consume(monitor_queue)
    
    def __on_msg_intercept(self, monitor_check, conv_msg):
        result = self.RESEND
        if (conv_msg.label =='END'): 
            self.gateway.stop_forwarding()
            return 'DO_NOT_RESEND'
        elif self.monitor_enabled:                    
            try: 
                if monitor_check(conv_msg):
                    result  =  self.RESEND
                else: result = 'ERROR'
            except ExceptionFailAssertion as exf:
                print "Wro00000000000000000000000000000000000000000ng message for assertions"
                result = 'ERROR'
            except ExceptionFSM as exa:
                print "Wroooooooooooooooooooooooooooooooooooooooooooooooong message for FSM"
                result = 'ERROR'
        return result