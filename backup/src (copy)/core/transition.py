
class Transition(object):
    def __init__(self, lt_type=None, label=None, role=None):
        self.role = role
        self.label = label
        self.lt_type = lt_type
        
class TransitionFactory(object):
    @classmethod
    def create(lt_type, label, role = None):
        Transition(lt_type, label, role)