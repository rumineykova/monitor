
class Transition(object):
    def __init__(self, lt_type=None, label=None, role=None):
        self.role = role
        self.label = label
        self.lt_type = lt_type
        
class TransitionFactory:
    @classmethod
    def create(cls, lt_type, label, role = None):
        if role is None: role = ''
        return "%s_%s_%s" %(lt_type, label, role )