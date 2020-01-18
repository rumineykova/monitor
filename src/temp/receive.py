import pika
import sys

class Server(object):
    def callback(self, ch, method, properties, body):
        print 'Receive %r %s' %(body, method)
        self.channel.close()
        
    def receive(self, queue_name, exchange_name, binding):
        self.connection = pika.BlockingConnection(pika.ConnectionParameters(host = 'localhost'))
        self.channel = self.connection.channel()
        self.channel.queue_declare(queue=queue_name)
        
        self.channel.exchange_declare(exchange=exchange_name, 
                                      type='topic')
        
        self.channel.queue_bind(exchange=exchange_name,
                           queue=queue_name, 
                           routing_key=binding)     
               
        self.channel.basic_consume(self.callback,
                              queue = queue_name, 
                              no_ack = True)
        self.channel.start_consuming()
    
def main(args):
    server = Server() 
    server.receive('test_queue1','global_topic', '*.to_role')
    
if __name__ == "__main__":
    sys.exit (main (sys.argv))
