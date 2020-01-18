from conversation.conversation_types import Invitation, ConversationMessage 


from abc import ABCMeta, abstractmethod 
class ConversationMessageAdapter(object):
    __metaclass__= ABCMeta
    @abstractmethod
    def to_conversation_msg(self, rawMsg):
        pass
    @abstractmethod
    def to_invitation_msg(self, invitation):
        pass
    @abstractmethod
    def from_invitation_msg(self):
        pass
    @abstractmethod
    def from_converastion_msg(self):
        pass 

class AMQPConversationMessageAdapter(ConversationMessageAdapter):
    CONV_MESSAGE_LENGTH = 5
    INV_MESSAGE_LENGTH = 6
    def to_conversation_msg(self, raw_msg):
        props = self.__split_raw_msg(raw_msg, self.CONV_MESSAGE_LENGTH)
        
        conv_msg = ConversationMessage(cid=props[0],
                                       label=props[3],
                                       content=props[4:],
                                       sender_role=props[1],
                                       receiver_role=props[2])
        return conv_msg
        
    def to_invitation_msg(self, raw_msg):
        props = self.__split_raw_msg(raw_msg, self.INV_MESSAGE_LENGTH)            
        
        if (props[3]==Invitation.DEFAULT_LABEL):
            invitation = Invitation(props[0], props[2], props[4], props[5]);
            return invitation
        else: raise Exception("The following message is not an invitation: %s" %(props))
        
    def from_invitation_msg(self, invitation):
        return "%s%s%s%s%s%s0000" %(self.__with_length_prefix(invitation.cid), 
                                    self.__with_length_prefix(invitation.ADMIN_ROLE), 
                                    self.__with_length_prefix(invitation.role), 
                                    self.__with_length_prefix(invitation.DEFAULT_LABEL),
                                    self.__with_length_prefix(invitation.local_capability), 
                                    self.__with_length_prefix(invitation.participant))
        
    def from_converastion_msg(self, conv_msg):
        return "%s%s%s%s%s0000" %(self.__with_length_prefix(conv_msg.cid), 
                                    self.__with_length_prefix(conv_msg.from_role), 
                                    self.__with_length_prefix(conv_msg.to_role), 
                                    self.__with_length_prefix(conv_msg.label), 
                                    #self.__with_length_prefix(conv_msg.content))
                                    ''.join([self.__with_length_prefix(arg) for arg in conv_msg.content]))
        
    
    def __with_length_prefix(self, val):
        if not val: val = ""
        return "%04d%s" %(len(val), val)
    
    def __split_raw_msg(self, raw_msg, length):
        print "__split_raw_msg: mesg: %s" %raw_msg
        props = []
        #props.append(int(raw_msg[0:4]))
        #raw_msg = raw_msg[4:]
        
        # TODO: This is ugly in Python...come with better solution
        #for _ in range(0, length):
        while raw_msg != '0000':
            len_ = int(raw_msg[0:4])
            props.append(raw_msg[4: (4 + len_)])
            raw_msg = raw_msg[4 + len_:]
        return props
    