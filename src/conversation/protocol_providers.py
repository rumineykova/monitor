from abc import ABCMeta, abstractmethod
from conversation_types import Role 
 
class ProtocolProvider(object):
    __metaclass__ = ABCMeta
    @abstractmethod
    def get_roles_by_protocolID(self, protocolID):
        pass
    @abstractmethod
    def get_protocol_by_protocolID(self, protocolID):
        pass
    
    @abstractmethod
    def get_local_protocol_by_protocolID_and_role(self, protocolID, role):
        pass

class DefaultProtocolProvider(ProtocolProvider):
    protocols = {"buyer_seller":"buyer_seller.spr"}
    protocolsRoles = {"buyer_seller": [Role("buyer"), Role("seller")]} 

    def __init__(self):
        self.path = ""
        self.projectionPrefix = "at"
    
    def get_roles_by_protocolID(self, protocolID):
        return self.protocolsRoles[protocolID]
    
    def get_protocol_by_protocolID(self, protocolID):
        return "%s%s" %(self.path, protocolID)
    
    def get_local_protocol_by_protocolID_and_role(self, protocolID, role):
        return "%s%s%s%s" %(self.path, protocolID, self.projectionPrefix, role) 