import unittest
from core.transition import TransitionFactory
from conversation.conversation_types import LocalType
from core.fsm import ExceptionFSM, ExceptionFailAssertion
from parsing.parsers import ANTLRScribbleParser

def ECOOPLogic_Server_events():
    events = []
    events.append(TransitionFactory.create(LocalType.SEND, 'Balance', 'Client'))
    events.append(TransitionFactory.create(LocalType.SEND, 'OverdraftLimit', 'Client'))
    events.append(TransitionFactory.create(LocalType.RESV, 'MakePayment', 'Client'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Balance', 'Client'))
    events.append(TransitionFactory.create(LocalType.SEND, 'OverdraftLimit', 'Client'))
    events.append(TransitionFactory.create(LocalType.RESV, 'CloseAccount', 'Client'))
    return events

def ECOOPLogic_Client_events():
    events = []
    events.append(TransitionFactory.create(LocalType.RESV, 'Balance', 'Server'))
    events.append(TransitionFactory.create(LocalType.RESV, 'OverdraftLimit', 'Server'))
    events.append(TransitionFactory.create(LocalType.SEND, 'MakePayment', 'Server'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Balance', 'Server'))
    events.append(TransitionFactory.create(LocalType.RESV, 'OverdraftLimit', 'Server'))
    events.append(TransitionFactory.create(LocalType.SEND, 'CloseAccount', 'Server'))
    return events


def DataAcquisition_at_A_events_push_supported():
    events = []
    events.append(TransitionFactory.create(LocalType.RESV, 'Push', 'U'))
    events.append(TransitionFactory.create(LocalType.SEND, 'StreamMode', 'I'))    
    events.append(TransitionFactory.create(LocalType.RESV, 'Supported', 'I'))  
    events.append(TransitionFactory.create(LocalType.SEND, 'ConfigStream', 'I'))  
    events.append(TransitionFactory.create(LocalType.RESV, 'Raw', 'I'))  
    events.append(TransitionFactory.create(LocalType.SEND, 'Formatted', 'U'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Raw', 'I'))  
    events.append(TransitionFactory.create(LocalType.SEND, 'Formatted', 'U'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Stop', 'U'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Stop', 'I'))      
    return events


def DataAcquisition_at_A_events_push_not_supported():
    events = []
    events.append(TransitionFactory.create(LocalType.RESV, 'Push', 'U'))
    events.append(TransitionFactory.create(LocalType.SEND, 'StreamMode', 'I'))    
    events.append(TransitionFactory.create(LocalType.RESV, 'NotSupported', 'I'))  
    events.append(TransitionFactory.create(LocalType.SEND, 'ConfigPoll', 'I'))  
    events.append(TransitionFactory.create(LocalType.SEND, 'Poll', 'I'))  
    events.append(TransitionFactory.create(LocalType.RESV, 'Raw', 'I'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Formatted', 'U'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Poll', 'I'))  
    events.append(TransitionFactory.create(LocalType.RESV, 'Raw', 'I'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Formatted', 'U'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Stop', 'U'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Stop', 'I'))      
    return events

def DataAcquisition_at_A_events_poll_supported():
    events = []
    events.append(TransitionFactory.create(LocalType.RESV, 'Poll', 'U'))
    events.append(TransitionFactory.create(LocalType.SEND, 'SampleMode', 'I'))    
    events.append(TransitionFactory.create(LocalType.RESV, 'Supported', 'I'))  
    events.append(TransitionFactory.create(LocalType.SEND, 'ConfigPoll', 'I'))  
    events.append(TransitionFactory.create(LocalType.SEND, 'Poll', 'I'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Raw', 'I'))  
    events.append(TransitionFactory.create(LocalType.SEND, 'Formatted', 'U'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Poll', 'I'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Raw', 'I'))  
    events.append(TransitionFactory.create(LocalType.SEND, 'Formatted', 'U'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Stop', 'U'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Stop', 'I'))      
    return events
        
def DataAcquisition_at_A_events_poll_not_supported():
    events = []
    events.append(TransitionFactory.create(LocalType.RESV, 'Poll', 'U'))
    events.append(TransitionFactory.create(LocalType.SEND, 'SampleMode', 'I'))    
    events.append(TransitionFactory.create(LocalType.RESV, 'NotSupported', 'I'))  
    events.append(TransitionFactory.create(LocalType.SEND, 'ConfigPush', 'I'))  
    events.append(TransitionFactory.create(LocalType.RESV, 'Raw', 'I'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Raw', 'I'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Formatted', 'U'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Stop', 'U'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Stop', 'I'))      
    return events

def DataAcquisition_at_U_events():
    events = []
    events.append(TransitionFactory.create(LocalType.SEND, 'Push', 'A'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Formatted', 'A')) 
    events.append(TransitionFactory.create(LocalType.RESV, 'Formatted', 'A'))    
    events.append(TransitionFactory.create(LocalType.SEND, 'Stop', 'A'))
    return events

def DataAcquisition_at_I_events():
    events = []
    events.append(TransitionFactory.create(LocalType.RESV, 'StreamMode', 'A'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Supported', 'A')) 
    events.append(TransitionFactory.create(LocalType.RESV, 'ConfigStream', 'A'))    
    events.append(TransitionFactory.create(LocalType.SEND, 'Raw', 'A'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Stop', 'A'))
    return events


class TestEcoopExamples(unittest.TestCase):
    def setUp(self):
        self.path = 'C:/Users/rumi/workspace/MonitorPrototype/src/specs/'
        #self.path = '/homes/rn710/workspace/MonitorPrototype/src/specs/'
    def base(self, lt_filename, events):
        try:
            myparser = ANTLRScribbleParser()
            res = myparser.parse(self.path + lt_filename)
            builder = myparser.walk(res)
            #print builder.main_fsm.fsm
            print builder.memory
            print builder.main_fsm.fsm.memory
            print builder.main_fsm.recursions_states
            print builder.current_fsm.fsm.state_transitions 
            builder.main_fsm.fsm.process_list(events)
        except ExceptionFSM: raise
         
    def base_logic(self, lt_filename, events, payloads):
        try:
            myparser = ANTLRScribbleParser()
            res = myparser.parse(self.path + lt_filename)
            builder = myparser.walk(res)
            #print builder.main_fsm.fsm
            #print builder.memory
            #print builder.main_fsm.fsm
            print builder.current_fsm.fsm.state_transitions 
            builder.main_fsm.fsm.set_assertion_check_on()
            builder.main_fsm.fsm.process_list(events, payloads)
            print builder.main_fsm.fsm.interrupt_transition 
            print builder.main_fsm.fsm.interrupt_start_state
        except ExceptionFSM:
            raise
    def test_data_acquisition_for_U(self):
        self.base('ecoop/DataAcquisition_at_U.spr', DataAcquisition_at_U_events())
        self.assertEqual(1, 1)  
    def test_data_acquisition_for_I(self):
            self.base('ecoop/DataAcquisition_at_I.spr', DataAcquisition_at_I_events())
            self.assertEqual(1, 1)     
 
    def test_data_acquisition_for_A(self):
            self.base('ecoop/DataAcquisition_at_A.spr', DataAcquisition_at_A_events_push_supported())
            self.base('ecoop/DataAcquisition_at_A.spr', DataAcquisition_at_A_events_push_not_supported())
            self.base('ecoop/DataAcquisition_at_A.spr', DataAcquisition_at_A_events_poll_supported())
            self.base('ecoop/DataAcquisition_at_A.spr', DataAcquisition_at_A_events_poll_not_supported())
            self.assertEqual(1, 1)
    def test_ecoop_logic(self):
        payloads = [[-1], [4], [2, 1], [1], [4], [2, 1]]
        self.base_logic('ecoop/LogicExample_at_Server.spr', ECOOPLogic_Server_events(), payloads)
        self.base_logic('ecoop/LogicExample_at_Client.spr', ECOOPLogic_Client_events(), payloads)
        wrong_payloads = [[-1], [4], [2, 1], [-1], [4], [2, 1]]
        self.assertRaises(ExceptionFailAssertion,  self.base_logic, 'ecoop/LogicExample_at_Server.spr', ECOOPLogic_Server_events(), wrong_payloads)    
        self.assertEqual(1, 1)