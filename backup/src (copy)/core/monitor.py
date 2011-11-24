import sys 
from parser.ANTLRScribbleParser import ANTLRScribbleParser
from common.configuration import Configuration
from common.logger import Logger
        
# Need to have parser, filecontent
class Monitor(object):
    specsScribble = {"purchasingAtBuyer":"/homes/rn710/workspace/MonitorPrototype/src/specs/purchasingAtBuyer.txt"}
    specsXML = {"purchasingAtBuyer":"/homes/rn710/workspace/MonitorPrototype/src/specs/purchasingAtBuyer.txt"} 
    def start(self, specID):
        Logger.logFuncCall([Monitor,self.start])
        if (Configuration.useXmlMonitorModel()):
            { self.__getModelFromXml(specID) }
        else:  
            { self.__getModelFromScribble(specID, )}
        pass
    
    def receive(self, sessionId, msg):
        # state = statemachine[sessionId].getState() 
        # check(state, msg)
        pass
    def output(self, sessionId, msg):
        pass    
    
    def __getModelFromScribble(self, specID):
        spec = self.specs.get(specID)
        parser = ANTLRScribbleParser()
        protocol = parser.parse(spec)
        # statemachine = SateMachine(protocol)
    
    # This is just a wrapper function for getting the monitor from Scribble implementation 
    # We load the monitor model that is serialized as XML 
    def __getModelFromXml(self, specID):
        pass
    
def main (argv): 
    monitor = Monitor()
    monitor.start("purchasingAtBuyer")

if __name__ == "__main__":
    sys.exit (main (sys.argv))