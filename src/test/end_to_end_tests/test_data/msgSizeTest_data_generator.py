from core.transition import TransitionFactory
from conversation.conversation_types import LocalType
from common.configuration import Configuration
from string import letters
from random import choice, sample, seed
import sys
import os


def generate_and_save_random_msg(size, file_name):
    s = ''.join([choice(letters) for i in xrange(size)])
    f = open(file_name, 'w')
    f.write(s)
    f.flush()
    f.close()
    return s

def get_msg(file_name):
    f = open(file_name, 'r')
    s = f.read()
    f.flush()
    msg_size = sys.getsizeof(s)
    print "Message size is: %s" %(msg_size)
    f.close()
    return s

test_data_file_name =  os.path.normpath("/homes/rn710/%s/../../" %__file__) + 'MsgSizeTestData' 

#generating test data
#file_name = '/homes/rn710/workspace/MonitorPrototype/src/test/end-to-end-tests/MsgSizeTestData_1000.txt' 
#generate_and_save_random_msg(1000*1024, file_name)
#get_msg(file_name)

