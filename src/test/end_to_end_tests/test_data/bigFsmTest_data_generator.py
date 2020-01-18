from core.transition import TransitionFactory
from conversation.conversation_types import LocalType
from common.configuration import Configuration
import os

#-----------------------------------Constants-------------------------
class ParticipantData:
    def __init__(self, type):
        if  str.lower(type) ==  str.lower('buyer'):
            self.role = 'Buyer'
            self.send_label = 'Confirmation'
            self.resv_label = 'OK'
            self.receiver = 'Seller'
            self.send_first = True
        elif  str.lower(type) ==  str.lower('seller'):
            self.role = 'Seller'
            self.send_label = 'OK'
            self.resv_label = 'Confirmation'
            self.receiver = 'Buyer'
            self.send_first = False
    
#--------------------------------------------------------------------
"""
scribble_header = protocol Purchasing at Buyer {
unordered{\n
scribble_end = "\n}}"
"""
scribble_header = """protocol Purchasing at Buyer {"""
scribble_end = "\n}"


def get_local_type_file_name(file_base, role):
    return "%s%s%s" %(file_base, role, '.spr')

def get_lt_full_name(file_name):
    return os.path.join(Configuration.get_specs_directory(), 
                        file_name)

def generate_protocol(length, log_file, data):
    print 'generate_protocol%s:' %(length)
    f = open(log_file, 'w')
    f.write(scribble_header)
    for i in range (1, length + 1):
        send_msg = "%s%s to %s;\n"%(data.send_label, str(i), data.receiver)       
        resv_msg = "%s%s from  %s;\n"%(data.resv_label, str(i), data.receiver)
        if data.send_first:
            f.write(send_msg)
            f.write(resv_msg)
        else: 
            f.write(resv_msg)
            f.write(send_msg)
        f.flush()
    f.write(scribble_end);
    f.close()
            

def generate_client(length, data):
    events = []
    for i in range (1, length + 1):
        if data.send_first:
            addition = [[LocalType.SEND, "%s%s"%(data.send_label, i), data.receiver],
                         [LocalType.RESV, "%s%s"%(data.resv_label, i), data.receiver]]
        else: 
            addition = [[LocalType.RESV, "%s%s"%(data.resv_label, i), data.receiver],
                         [LocalType.SEND, "%s%s"%(data.send_label, i), data.receiver]]
        events = events + addition        
    return events

#generate_protocol(10, "TestUnorder", ParticipantData("seller"))
#generate_protocol(10, "TestUnorder", ParticipantData("buyer"))

