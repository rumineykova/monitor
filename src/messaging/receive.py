import pika
import sys

def callback(ch, method, properties, body):
    print 'Receive %r' %(body,)
def receive(queue_name):
    connection = pika.BlockingConnection(pika.ConnectionParameters(host = 'localhost'))
    channel = connection.channel
    channel.queue_delare(queue_name)
            
    
    channel.basic_consume(callback,
                          queue = queue_name , 
                          no_ack = True)
    channel.start_consuming()
    
def main(args):
    receive('Hello')
    
if __name__ == "__main__":
    sys.exit (main (sys.argv))
