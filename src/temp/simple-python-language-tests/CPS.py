import sys
from string import letters
from random import choice, sample, seed
import string

class Test(object):
    def __init__(self, f):
        self.f = f

def test (s): print s 
def sum(x, y, c):
    c(x+y, printTest)

def printTest(): print 'Ihuu'
def generate_and_save_random_string(size):
    s = ''.join([choice(letters) for i in xrange(size)])
    print sys.getsizeof(s)
    return s
test_string = "/homes/rn710/workspace/MonitorPrototype/src/test/end-to-end-tests/MsgSizeTestLocalType_%s.txt"
def get_msg(file):
    pass

def main(args):
    test = Test(f=3)
    name = "alabala"
    buf = name.encode('UTF-8')
    num_bytes = len(buf)
    print num_bytes
    role = 'ihu'
    s = test_string %(role)
    print s
    #print test.f
import time
def test():
    f = open('/homes/rn710/benchmarks/Monitor_check_foo.txt', 'a')
    t = time.clock()
    time.sleep(2)
    #print time.clock() - t
    s = time.clock() - t
    full_msg = "msg:%0.9f\n"%(s)
    print full_msg
    f.write(full_msg)
    f.flush()
    f.close()

def parse_test_file():
    f = open('/homes/rn710/benchmarks/ExtractData.txt', 'r')
    f1 = open('/homes/rn710/benchmarks/ExtractInitalizeData.txt', 'a')
    for file in f:
        if (string.find(file, 'msg') == -1):
            print file 
            f1.write(file)
    f1.close()
    f.close()

if __name__ == "__main__":
    test()
    parse_test_file()
    #sleep(1)
    

    

 