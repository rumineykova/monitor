import unittest
import os
from parsing.parsers import ANTLRScribbleParser

from common.configuration import Configuration
from core.monitor import ConversationMonitor
from conversation.conversation_types import ConversationMessage, LocalType
from core.transition import TransitionFactory

def create_conv_msg(cid, self_role, local_type, label_, role_):
    if (local_type == LocalType.SEND):
        to_role = role_
        from_role = self_role
    elif(local_type == LocalType.RESV):
        from_role = role_
        to_role = self_role
        
    else: raise Exception('Unknown Local Type')
    test_conv_msg = ConversationMessage(cid=cid, label=label_,
                                        content='I am a test conversation message',
                                        sender_role=from_role, receiver_role=to_role)
    return test_conv_msg

def purchasingAtBuyer_events():
    events = []
    events.append(TransitionFactory.create(LocalType.SEND, 'Order', 'Seller'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Confirmation', 'Seller'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Order', 'Seller'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Confirmation', 'Seller'))
    return events

class BaseTestDataClass(object):
    def __init__(self, cid, role, interactions):
        self.cid = cid
        self.role = role
        self.interactions = interactions
    def events(self):
        events =  [TransitionFactory.create(node[0], node[1], node[2]) 
                   for node in self.interactions]
        return events
    
    def messages(self):
        messages =  [create_conv_msg(self.cid, self.role, node[0], node[1], node[2]) for node in self.interactions]
        return messages
    
class PurchasingAtBuyerTestData(BaseTestDataClass):
    def __init__(self):
        self.cid = 1234
        self.role = 'buyer'
        self.interactions = [[LocalType.SEND, 'Order', 'Seller'], 
                             [LocalType.RESV, 'Confirmation', 'Seller'], 
                             [LocalType.SEND, 'Order', 'Seller'], 
                             [LocalType.RESV, 'Confirmation', 'Seller']]
        self.file_name = "purchasingAtBuyer.srt"
                             
class ConversationMonitorTests(unittest.TestCase):
    def setUp(self):
        self.path = Configuration.get_specs_directory()
        
    def __get_fsm_for_local_type(self, local_type_path):
        myparser = ANTLRScribbleParser()
        res = myparser.parse(local_type_path)
        builder = myparser.walk(res)
        return builder.main_fsm.fsm
        
    def __check_msg_set_up(self, events, local_type_file, cid, role):
        conversation_monitor = ConversationMonitor()
        test_file = os.path.join(self.path, local_type_file)
        conversation_monitor.initialise(cid, role, test_file)
        fsm = conversation_monitor.protocolStateMachines.get((cid, role))
        fsm.process_list(events)
        
        return conversation_monitor
        
    def test_initialize(self):
        conversation_monitor = ConversationMonitor()
        test_file_name = 'purchasingAtBuyer.srt' 
        test_file = os.path.join(self.path, test_file_name)
        expected_fsm = self.__get_fsm_for_local_type(test_file)
        
        cid = '1234'
        role = 'buyer'
        conversation_monitor.initialise(cid, role, test_file)
        actual_fsm = conversation_monitor.protocolStateMachines.get((cid, role))
        
        self.assertEquals(actual_fsm.__dict__, expected_fsm.__dict__)
        
    def test_check_outgoing_msg_with_the_first_msg(self):
        test_data = PurchasingAtBuyerTestData()
        
        conversation_monitor =  self.__check_msg_set_up([],
                                test_data.file_name, test_data.cid, 
                                test_data.role)
        result = conversation_monitor.check_outgoing_msg(test_data.messages()[0])
        self.assertEqual(result, True)  
    
    def test_check_incoming_msg(self):
        
        test_data = PurchasingAtBuyerTestData()
        conversation_monitor =  self.__check_msg_set_up(test_data.events()[:3],
                                test_data.file_name, test_data.cid, 
                                test_data.role)
        
        result = conversation_monitor.check_incoming_msg(test_data.messages()[3])
        self.assertEqual(result, True)    
        
    def test_check_outgoing_msg(self):
        test_data = PurchasingAtBuyerTestData()
        conversation_monitor =  self.__check_msg_set_up(test_data.events()[:2],
                                test_data.file_name, test_data.cid, 
                                test_data.role)
        
        result = conversation_monitor.check_outgoing_msg(test_data.messages()[2])
        self.assertEqual(result, True)  