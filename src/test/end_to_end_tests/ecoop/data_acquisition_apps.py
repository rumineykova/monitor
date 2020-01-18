import sys

from test.end_to_end_tests.test_apps import apps_utils
from conversation.conversation_types import LocalType 
from test.benchmark_logger import BenchmarkLogger, BenchmarkType
import random
import time
import datetime

def create_instrument_app(cid, participant, repetitions=1):
    role = 'I'
    lt_file = apps_utils.get_lt_full_name("DataAcquisition_at_I.spr")

    event_trace =   [[LocalType.SEND, 'Push', 'A'],
                    [LocalType.RESV, 'StreamMode', 'A'],    
                    [LocalType.SEND, 'Supported', 'A'], 
                    [LocalType.RESV, 'ConfigStream', 'A'],  
                    [LocalType.SEND, 'Raw', 'A'],  
                    [LocalType.SEND, 'Raw', 'A'],  
                    [LocalType.RESV, 'Stop', 'A' ]]    
    
    full_trace = event_trace
    
    full_trace = full_trace  + [[LocalType.SEND, 'END', 'A']]
    app = apps_utils.BaseApp(cid, role, participant, 
                        full_trace, lt_file)
    return app  

def create_user_app(cid, participant, repetitions=1):
    role = 'U'
    lt_file = apps_utils.get_lt_full_name("DataAcquisition_at_U.spr")
    
    event_trace =   [[LocalType.SEND, 'Push', 'A'],
                    [LocalType.RESV, 'Formatted', 'A'],
                    [LocalType.RESV, 'Formatted', 'A'],
                    [LocalType.SEND, 'Stop', 'A']]
    
    full_trace = event_trace
    
    full_trace = full_trace + [[LocalType.SEND, 'END', 'A']]
    
    app = apps_utils.BaseApp(cid, role, participant, full_trace, 
                         lt_file, create_data_acquisition_conversation)
    return app
    

def create_agent_app(cid, participant, repetitions=1):
    role = 'A'
    lt_file = apps_utils.get_lt_full_name("DataAcquisition_at_A.spr")
    
    event_trace =   [[LocalType.RESV, 'Push', 'U'],
                    [LocalType.SEND, 'StreamMode', 'I'],    
                    [LocalType.RESV, 'Supported', 'I'], 
                    [LocalType.SEND, 'ConfigStream', 'I'],  
                    [LocalType.RESV, 'Raw', 'I'],  
                    [LocalType.SEND, 'Formatted', 'U'],
                    [LocalType.RESV, 'Raw', 'I'],  
                    [LocalType.SEND, 'Formatted', 'U'],
                    [LocalType.RESV, 'Stop', 'U'],
                    [LocalType.SEND, 'Stop', 'I' ]]    
    
    full_trace = event_trace
    for i in range(0, repetitions):
        full_trace = full_trace + event_trace
        
    full_trace = full_trace + [[LocalType.SEND, 'END', 'I']]
    
    app = apps_utils.BaseApp(cid, role, participant, full_trace, 
                         lt_file, create_data_acquisition_conversation)
    return app
        
def create_data_acquisition_conversation(cid):
    participants = [['carol', 'A', apps_utils.get_lt_full_name('DataAcquisition_at_A.spr')], 
                    ['bob', 'U', apps_utils.get_lt_full_name('DataAcquisition_at_U.spr')], 
                    ['alice', 'I', apps_utils.get_lt_full_name('DataAcquisition_at_I.spr')]]
    conversation = apps_utils.BaseConversation(cid, participants)
    return conversation 
    
app_map = {'A': create_agent_app, 'U': create_user_app , 'I': create_instrument_app}

def main(args):
    repetitions = 1
    print args, 
    try:
        cid = 1234
        if (args[0] == 'App'):
            app = app_map.get(args[1])(cid, args[2], repetitions)
            app.set_monitor_on()
            app.start()
        elif (args[0] == 'Monitor'):
            monitor = apps_utils.start_monitor(cid, args[2], args[1], 
                                           apps_utils.get_lt_full_name("DataAcquisition_at_%s.spr"%(args[1])))
    except Exception as e:
        print e
        print 'Error' 
        sys.exit()
    
if (__name__=='__main__'):
    #main(["Monitor", "I", "alice"])
    #main(["Monitor", "U", "bob"])
    #main(["Monitor", "A", "carol"])
    #main(["App", "I", "alice"])
    #main(["App", "U", "bob"])
    main(["App", "A", "carol"])
    main(sys.argv)
    pass