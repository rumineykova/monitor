class Configuration(object):
    # use to check whether the object model use Gary's ANTLR parsing and serialization
    _useXmlMonitorModel = True;
    
    @classmethod
    def useXmlMonitorModel(cls):
        return cls._useXmlMonitorModel
