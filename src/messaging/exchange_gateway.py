import pika
import string
import sys

""" 
A class that forward messages from one exchange to another exchange
parameters: source_eaxchange, destination_exchange,source_binding_key
Important points:
(1) The Gateway is subscribed to a queue. The queue is bound to the source_exchange
using the source_binding_key
(2) Whenever it receives messages it resends them to the destination_exchange
"""
class ExchangeGateway(object):
    DEFAULT_EXCHANGE = ''
    RESEND = 'RESEND'
    # We pass connection if we want to use existing connection
    def __init__(self, monitor=None, connection=None, broker_host = 'localhost'):
        self.forwarder = {}
        self.monitor = monitor
        self.exchange_queue_bindings = {}
        if connection is None:
            print 'Connection'
            self.connection = pika.BlockingConnection(pika.ConnectionParameters(host = broker_host))
        else: 
            self.connectin = connection
        self.channel = self.connection.channel()
        
    """ 
    (1) Subscribe to a source_queue
    (2) set the forwarding destination for the messages from the source_queue   
    """    
    def start_forwarding(self, source_exchange,
                         destination_exchange, source_binding, interceptor=None, source_queue_name = None):
        """ 
        The forwarding is from source_queue to destination_exchange. 
        Thus, source_exchange argument is not needed.
        However, we require the source_exchange to protect from infinite loop. 
        """
        print "Before Start Forwarding from exchange:%s binding:%s to exchange: %s" \
               %(source_exchange, source_binding, destination_exchange)
        
        if (source_exchange==destination_exchange):
            raise Exception ("Source and Destination cannot be the same")
        # add a forward pair
        self.forwarder.setdefault(str(source_exchange), (str(destination_exchange), interceptor))
        self.create_topic_exchanges([source_exchange, destination_exchange])        
        self.create_and_bind_queue(source_exchange, source_binding, source_queue_name)

        print "Start Forwarding from exchange: %s binding: %s to exchange%s; forwarders: %s" \
              %(source_exchange, source_binding, destination_exchange, self.forwarder)
        
    def create_topic_exchanges(self, exchange_list):
        [self.channel.exchange_declare(exchange = str.lower(str(exchange)), type = 'topic') 
         for exchange in exchange_list 
         if (not(str(exchange)==self.DEFAULT_EXCHANGE))]
        
    def create_and_bind_queue(self, exchange_name, binding, queue_name_ = None):
        exchange_name = str(exchange_name)
        if (exchange_name==self.DEFAULT_EXCHANGE):
            new_queue = self.channel.queue_declare(queue=str.lower(binding))
            queue_name = binding
        else:
            if (queue_name_ is None): 
                new_queue = self.channel.queue_declare()
            else:
                new_queue = self.channel.queue_declare(queue = str.lower(queue_name_))
            queue_name = new_queue.method.queue 
            self.channel.queue_bind(exchange=exchange_name, 
                                     queue=queue_name, 
                                     routing_key=binding)
        self.exchange_queue_bindings.setdefault(str(exchange_name), queue_name)
        print "create_and_declare_queue: %s" %(queue_name)
        return queue_name
    
    def stop_forwarding(self):
        self.channel.stop_consuming()
        self.channel.close()
        self.connection.close()
        
    def consume(self, queue_name):
        print "consume queue_name: %s" %(queue_name)
        self.channel.basic_consume(self.__intercept,
                                   queue = queue_name, 
                                   no_ack = True)
        self.channel.start_consuming()

    def __intercept(self, ch, method, properties, body):
        print "Message intercepted: method:%s, body:%s: %s" %(method, body, self.forwarder)
        if (not(string.find(body, "END")==-1)):
            print "Stop monitoring: %s" %(body)
            self.stop_consume()
            return
        
        if len(body)>0:
            status = self.RESEND
            print "forwarders:%s" %(self.forwarder)
            (destination, interceptor) = self.forwarder.get(method.exchange)
            print "__intercept: destination:%s" %(destination)
            
            if interceptor is not None:
                (status, method, properties, stop_interception, continuation) = interceptor(ch, method, properties, body)     
                if stop_interception: self.channel.stop_consuming()
            if (status == self.RESEND): 
                # Check that the gateway is configured to forward from this queue
                if destination is None:
                    Exception("Configuration for the exchange: %s is missing" 
                              %(method.exchange))
                self.channel.basic_publish(exchange = destination, 
                                           routing_key = method.routing_key,
                                           properties = properties,   
                                           body = body)
            else: print "This message is wrooooong %s" %(body)
        
        #queue_name = self.exchange_queue_bindings.get(method.exchange)
        print "Message:%s forwarded to exchange: %s and routing_key:%s" %(body, destination, method.routing_key) 
        
        if continuation is not None: continuation(ch, method, properties, body)
        
    def start_auto_forward(self, source_exchange, destination_excchange, binding="*"):
        self.channel.exchange.bind(source = source_exchange, 
                                   destination = destination_excchange,
                                   routing_key = binding)
         
    def stop_auto_forward(self, source_exchange, destination_excchange, binding="*"):
        self.channel.exchange.unbind(source = source_exchange, 
                                   destination = destination_excchange,
                                   routing_key = binding)
 
class Test(object):
    def intercept(self, ch, method, properties, body):
        print 'I am interceptor'
        return 'RESEND'
       
def main(args):
    test = Test()
    forwarder = ExchangeGateway()
    forwarder.start_forwarding('local_topic',  'global_topic', 'from_role.*', test.intercept)
    #forwarder.start_auto_forward('local_topic', 'global_topic')
    
if __name__ == "__main__":
    sys.exit (main (sys.argv))