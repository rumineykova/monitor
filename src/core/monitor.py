import sys 
from parsing.parsers import ANTLRScribbleParser
from transition import TransitionFactory    
from conversation.conversation_types import LocalType
from conversation.protocol_providers import DefaultProtocolProvider  
from core.fsm import ExceptionFSM, ExceptionFailAssertion
    
class ConversationMonitorException(Exception):
    """This is the Exception class for ConversationMonitor."""
    def __init__(self, value):
        self.value = value

    def __str__(self):
        return 'self.value'
    
class ConversationMonitor(object):
    def __init__(self, protocolProvider = None): 
        self.protocolStateMachines = {} 
        self.conversations = {}
        self.conversationRoles = {}
        self.is_logic_enabled = True
        if protocolProvider: self.protocolProvider = protocolProvider
        else: self.protocolProvider = DefaultProtocolProvider()
    
    def on_create_conversation(self, cid, protocolID, initiator):
        roles = self.protocolProvider.get_roles_by_protocolID(protocolID)
        self.conversations.setdefault(cid, protocolID)
        for role in roles:
            # This marks whether a role capability is enabled. Initially it is not
            self.conversationRoles.setdefault((cid, role), None)
            
    """ on_incoming_invitations is meant to be used for checking of send_invitation, 
        check when an invitation arrive, not when it is accepted
        In the current setting receiving an invitation means accepting it. """          
    def on_incoming_invitations(self, invitation):
        cid = invitation.cid
        role = invitation.role
        self.conversationRoles.setdefault((cid, role), invitation.local_capability)
        
    def on_accept_invitation(self, invitation):
        self.initialise(invitation.cid, invitation.role, invitation.local_capability)
    
    def check_accept_invitation(self, invitation):
        cid = invitation.cid
        role = invitation.role
        return self.conversationRoles.get((cid, role), False)
      
    def check_outgoing_invitation(self, invitation):
        cid = invitation.cid
        role = invitation.role
        if self.conversationRoles.has_key((cid, role)):
            self.conversationRoles[(cid, role)] = invitation.participant
            return True
        return False
        
    # Note: here role capability is file_name
    
    def initialise(self, cid, role, role_capability):
        print role_capability
        myparser = ANTLRScribbleParser()
        res = myparser.parse(role_capability)
        builder = myparser.walk(res)
        builder.main_fsm.fsm.set_assertion_check(self.is_logic_enabled)
        self.protocolStateMachines.setdefault((cid, str.lower(role)), builder.main_fsm.fsm)
        print "Monitor initalise: %s" %(builder.main_fsm.fsm)
    
    def check_incoming_msg(self, convMsg):
        return self.__check(convMsg.cid, convMsg.to_role, LocalType.RESV, 
                            convMsg.label, convMsg.from_role, convMsg.content) 
        
    def check_outgoing_msg(self, convMsg):
        return self.__check(convMsg.cid, convMsg.from_role, LocalType.SEND, 
                            convMsg.label, convMsg.to_role, convMsg.content)     
    def __check(self, cid, self_role, local_type, label, participant_role, content = None):
        fsm = self.protocolStateMachines.get((cid, str.lower(self_role)))
        if fsm is None:
            raise ConversationMonitorException('No FSM for cid:%s and role:%s' 
                                               %(cid, str.lower(self_role)))
        transition = TransitionFactory.create(local_type, label, participant_role)
        
        try:
            if self.is_logic_enabled:
                # content is a tuple
                fsm.process(transition, content)
            else:
                fsm.process(transition)
            return True
        except ExceptionFailAssertion: 
            raise
        except ExceptionFSM:
            raise

def main (argv): 
    pass

if __name__ == "__main__":
    sys.exit (main (sys.argv))