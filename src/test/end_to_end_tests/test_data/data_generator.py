from bigFSM_test_data_generator import *
from core.conversation_interceptor import ConversationMonitor
from common.configuration import Configuration
from ..test_data.bigFsmTest_data_generator import scribble_header, scribble_end, ParticipantData

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
    
class TestData:
    def __init__(self, cid, role, role_capability):
        self.cid = cid
        self.role =role
        self.role_capability = role_capability 
    
    
file_path = Configuration.get_test_directory()  + '/end-to-end-tests/test-data/FSMInitializationTest.spr'   
#file_path = "/homes/rn710/workspace/MonitorPrototype/src/test/end-to-end-tests/test-data/FSMInitializationTest.spr"
def start():
    tests = [1, 10, 1000, 1000]
    for i in tests:
        generate_protocol(i, file_path, ParticipantData('Seller'))
    