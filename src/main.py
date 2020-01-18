import sys 
from parser.ANTLRScribbleParser import ANTLRScribbleParser
from core.monitor import Monitor
from antlr3.tree import Tree
from core.fsm import FSM

def main (argv): 
    testANTLScribbleParser()
    #monitorStart()
    #buildPDA()
    
def buildPDA():
    pass

def monitorStart():
    specID = "purchasingAtBuyer"
    monitor = Monitor()
    monitor.start(specID)

def testANTLScribbleParser():
    filename = "/homes/rn710/workspace/MonitorPrototype/src/specs/RecAtBuyer.spr"
    parser = ANTLRScribbleParser()
    res = parser.parse(filename)
    builder = parser.walk(res)
    print builder.memory
    if isinstance(res.tree, Tree) :
        for item in  res.tree.getChildren():
            print item
            if item:
                for child in item.getChildren():
                    print child
            else: print "I am flat"
     
    #t= res.getTree();
    print type(res.tree);

if __name__ == "__main__":
    sys.exit (main (sys.argv))

