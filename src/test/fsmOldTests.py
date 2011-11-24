import unittest
from common.logger import Logger
from core.fsm import FSM
from collections import deque

def dummy_action(fsm):
    print 'I have been called'
    
def toDeque(alist):
    return [deque(l) for l in alist]
     
class TestOldFSM(unittest.TestCase):
    def test_add_transition_to_memory_for_first_time_when_newTransitionStack_set_to_True(self):
        fsm = FSM(1)
        fsm.add_transition_to_memory_old('a', 1, True, dummy_action)
        print fsm.memory 
        self.assertEqual(fsm.memory.get(1), toDeque([['a']]))
        
    def test_add_transition_to_memory_for_first_time_when_newTransitionStack_set_to_False(self):
        fsm = FSM(1)
        fsm.add_transition_to_memory_old('a', 1, False, dummy_action)
        print fsm.memory 
        self.assertEqual(fsm.memory.get(1), toDeque([['a']]))
        
    def test_add_transition_to_memory_when_new_transitionStack_is_started(self):
        fsm = FSM(1)
        fsm.memory = {1: [['a']], 2 : [['b', 'c'], ['d']]}
        fsm.add_transition_to_memory_old('e', 2, True, dummy_action)
        print fsm.memory 
        self.assertEqual(fsm.memory.get(2), [['b', 'c'], ['d'], deque(['e'])])
        self.assertEqual(fsm.memory.get(1), [['a']])
    
    def test_add_transition_to_memory_old_when_attach_to_existing_transitionStack(self):
        fsm = FSM(1)
        fsm.memory = {1: [['a']], 2 : [['b', 'c'], ['d']]}
        fsm.add_transition_to_memory_old('e', 2, False, dummy_action)
        print fsm.memory 
        self.assertEqual(fsm.memory.get(2), [['b', 'c'], ['d', 'e']])
        
    def test_get_transition_from_memory_when_there_is_match(self):
        fsm = FSM(1)
        fsm.memory = {1: [deque(['a'])], 2 : [deque(['b', 'c']), deque(['d'])]}
        
        (_, next_state) = fsm.get_transition_old('b', 2)
        self.assertEqual(next_state,2)
        self.assertEqual(fsm.memory, {1: [deque(['a'])], 2 : [deque(['c']), deque(['d'])]})
        
        (_, next_state) = fsm.get_transition_old('d', 2)
        self.assertEqual(next_state,2)