import pika
import sys

def send(queue_name):
    connection = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
    channel = connection.channel
    channel.queue_declare(queue=queue_name)
    channel.basic_publish(exchange = '', 
                          routing_key = queue_name, 
                          body = 'Hello worlds')
    print 'Message sent'
    
    connection.close

def main(args):
    send('hello')
    
if __name__ == "__main__":
    sys.exit (main (sys.argv))
