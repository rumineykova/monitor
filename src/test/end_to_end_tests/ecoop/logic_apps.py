import sys
from test.end_to_end_tests.test_apps import apps_utils
from conversation.conversation_types import LocalType 
from test.benchmark_logger import BenchmarkLogger, BenchmarkType
from conversation.conversation_types import LocalType
import random
import time
import datetime

def create_client_app(cid, participant):
    role = 'client'
    lt_file = apps_utils.get_lt_full_name("ecoop\LogicExample_at_Client.spr")
    
    event_trace = [[LocalType.RESV, 'Balance', 'Server', '1'],
                   [LocalType.RESV, 'OverdraftLimit', 'Server', '1'],
                   [LocalType.SEND, 'MakePayment', 'Server', '1'],
                   [LocalType.RESV, 'Balance', 'Server', 1],
                   [LocalType.RESV, 'OverdraftLimit', 'Server', '1'],
                   [LocalType.SEND, 'CloseAccount', 'Server', '1']]
    
    full_trace = event_trace
    full_trace = full_trace  + [[LocalType.SEND, 'END', 'Seller']]
    app = apps_utils.BaseApp(cid, role, participant, 
                        full_trace, lt_file)
    return app  

def create_server_app(cid, participant):
    role = 'server'
    lt_file = apps_utils.get_lt_full_name("ecoop\LogicExample_at_Server.spr")
    event_trace = [[LocalType.SEND, 'Balance1', 'Client', '1'],
                   [LocalType.SEND, 'OverdraftLimit1', 'Client', '1'],
                   [LocalType.RESV, 'MakePayment', 'Client', '1'],
                   [LocalType.SEND, 'Balance', 'Client', '1'],
                   [LocalType.SEND, 'OverdraftLimit', 'Client', '1'],
                   [LocalType.RESV, 'CloseAccount', 'Client', '1']]
    
    full_trace = event_trace
    full_trace = full_trace  + [[LocalType.SEND, 'END', 'Client']]
    
    app = apps_utils.BaseApp(cid, role, participant, full_trace, 
                         lt_file, create_logic_conversation)
    return app
    
        
def create_logic_conversation(cid):
    participants = [['alice', 'client', apps_utils.get_lt_full_name('ecoop\LogicExample_at_Client.spr')], 
                    ['bob', 'server', apps_utils.get_lt_full_name('ecoop\LogicExample_at_Server.spr')]]
    conversation = apps_utils.BaseConversation(cid, participants)
    return conversation 

app_map = {'Client': create_client_app, 'Server': create_server_app }

def main(args):
    print args
    try:
        cid = 1234
        if (args[0] == 'App'):
            app = app_map.get(args[1])(cid, args[2])
            app.set_monitor_on()
            app.start()
        elif (args[0] == 'Monitor'):
            apps_utils.start_monitor(cid, args[2], args[1], 
                                           apps_utils.get_lt_full_name("ecoop\LogicExample_at_%s.spr"%(args[1])))
    except Exception as e:
        print e
        print 'Error' 
        sys.exit()
    
if (__name__=='__main__'):
    #main(["Monitor", "Client", "alice"])
    #main(["Monitor", "Server", "bob"])
    #main(["App", "Client", "alice"])
    #main(["App", "Server", "bob"])
    #main(sys.argv)
    pass