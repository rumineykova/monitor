import pika
class DefaultChannel(object):
    @classmethod
    def create_from_connection(cls, connection):
        return DefaultChannel(connection)
    
    def __init__(self, connection=None):
        self.connection = connection
        
class ConnectionFactory(object):
    @classmethod
    def create(cls, host_='localhost'):
        return pika.BlockingConnection(pika.ConnectionParameters(host_))