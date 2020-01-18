class Participant(object):
    def __init__(self, role):
        self.role = role
        # Binding has the form: from_role.to_role
        # Thus, Messages that have to_role that is role are incoming messages
        self.incoming_msg_binding = "%s.#" %(self.role)
        self.outgoing_msg_binding = "#.%s" %(self.role)
        
    def join_role(self):
        # create local topic exchange
        # create incoming queue
        # create outgoing queue
        # start listening on incoming queue
        pass
    def accept_role(self, Invitation):
        pass
    
    def send_msg(self):
        # read the global exchange from the config
        # If send_to_local is send to true then we send to the Local Exchange
        # If send_to_global is send to false we send to the Global Exchange tha we know from session initiation
        pass  
    