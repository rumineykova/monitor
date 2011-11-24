class Logger(object):
    @classmethod
    def log(cls, msg):
        print msg
        
    @classmethod
    def logFuncCall(cls, params):
        msg = ' '.join(i.__name__ for i in params)
        Logger.log(msg)