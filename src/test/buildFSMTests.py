import unittest
from core.transition import TransitionFactory
from core.LocalType import LocalType
from core.fsm import ExceptionFSM
from parser import ANTLRScribbleParser

def purchasingAtBuyer_events():
    events = []
    events.append(TransitionFactory.create(LocalType.SEND, 'Order', 'Broker'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Confirmation', 'Seller'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Confirmation', 'Seller'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Order', 'Broker'))
    return events

def locateChoiceAtBuyer_events():
    events = []
    events.append(TransitionFactory.create(LocalType.RESV, 'Confirmation', 'Seller'))
    events.append(TransitionFactory.create(LocalType.SEND, 'OK', 'Seller'))
    events.append(TransitionFactory.create(LocalType.RESV, 'OutOfStock', 'Seller'))
    events.append(TransitionFactory.create(LocalType.RESV, 'OutOfStock', 'Seller'))
    events.append(TransitionFactory.create(LocalType.RESV, 'OutOfStock', 'Seller'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Finish', 'Seller'))
    return events

def recAtBuyer_events():
    events = []
    events.append(TransitionFactory.create(LocalType.SEND, 'Order', 'Seller'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Invoice', 'Seller'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Order', 'Seller'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Invoice', 'Seller'))
    events.append(TransitionFactory.create(LocalType.SEND, 'OK', 'Seller'))
    return events

def parallelAtSeller1_events():
    events = []
    events.append(TransitionFactory.create(LocalType.RESV, 'Order', 'Buyer'))
    events.append(TransitionFactory.create(LocalType.SEND, 'Confirmation', 'Buyer'))
    events.append(TransitionFactory.create(LocalType.SEND, 'OK', 'Buyer'))
    return events

def UnorderedAtBuyer_events():
    events = []
    events.append(TransitionFactory.create(LocalType.SEND, 'Order', 'Seller'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Confirmation', 'Seller'))
    events.append(TransitionFactory.create(LocalType.RESV, 'Order', 'Seller1'))
    events.append(TransitionFactory.create(LocalType.SEND, 'OK', 'Seller'))
    return events


class TestFSM(unittest.TestCase):
    def setUp(self):
        #self.path = 'C:/Users/rumi/workspace/MonitorPrototype/src/specs/'
        self.path = '/homes/rn710/workspace/MonitorPrototype/src/specs/'
        pass
    def base(self, lt_filename, events):
        try:
            myparser = ANTLRScribbleParser.ANTLRScribbleParser()
            res = myparser.parse(self.path + lt_filename)
            walk = myparser.walk(res)
            builder = myparser.walk(res)
            #print builder.main_fsm.fsm
            #print builder.memory
            #print builder.main_fsm.fsm
            #print builder.current_fsm.fsm.state_transitions 
            builder.main_fsm.fsm.process_list(events)
        except ExceptionFSM:
            raise 
                
    def test_simpleInteraction(self):
        self.base('purchasingAtBuyer.txt', purchasingAtBuyer_events())
        self.assertEqual(1, 1)
    def test_choice(self):
        # Test The First branch
        self.base('LocateChoiceAtBuyer.spr', locateChoiceAtBuyer_events()[0:2])
        # Test The Second branch
        self.base('LocateChoiceAtBuyer.spr', locateChoiceAtBuyer_events()[2:6])
        self.assertEqual(1, 1)
    def test_choice_wrong(self):
        # Test The First branch
        self.base('LocateChoiceAtBuyer.spr', locateChoiceAtBuyer_events()[0:2])
        # Test The Second branch
        self.assertRaises(ExceptionFSM,  self.base, 'LocateChoiceAtBuyer.spr',  locateChoiceAtBuyer_events()[1:4])
    
    def test_rec(self):
        self.base('RecAtBuyer.spr', recAtBuyer_events())
        self.assertEqual(1, 1)
        
    def test_rec_wrong(self):
        self.assertRaises(ExceptionFSM,  self.base, 'RecAtBuyer.spr',  recAtBuyer_events()[0:-2] +recAtBuyer_events()[-1:])
        
    def test_parallel(self):
        self.base('ParallelAtSeller1.spr', parallelAtSeller1_events())
        self.assertEqual(1, 1)
    
    def t1est_parallel_wrong(self):
        self.assertRaises(ExceptionFSM,  self.base, 'ParallelAtSeller1.spr', recAtBuyer_events()[1:])
        
    def test_unordered(self):
        self.base('UnorderedAtBuyer.spr', UnorderedAtBuyer_events())
        self.assertEqual(1, 1)
    
    def test_unordered_wrong(self):
        self.assertRaises(ExceptionFSM,  self.base, 'UnorderedAtBuyer.spr', UnorderedAtBuyer_events()[1:])    
    
    