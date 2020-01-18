class ConversationMessage(object):
    def __init__(self, cid, label, content, sender_role, receiver_role):
        self.cid = cid
        self.label = label
        self.content = content
        self.from_role = sender_role
        self.to_role = receiver_role
        
    def get_binding(self):
        return str.lower("%s.%s.%s" %(self.cid,self.from_role, self.to_role))
        
class Invitation(object):
    ADMIN_ROLE = 'Adm'
    DEFAULT_LABEL = 'inv'
    def __init__(self, cid, role, local_capability, participant):
        self.cid = cid
        self.role = str.lower(role)
        self.participant = str.lower(participant)
        self.local_capability = local_capability
    def invitation_queue_name (self):
        return "%s" %(self.participant)
    
class Role(object):
    def __init__(self, name):
        self.name = name
        
class Enum(set):
    def __getattr__(self, name):
        if name in self:
            return name
        raise AttributeError

LocalType = Enum(["SEND", "RESV"])