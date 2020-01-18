import pika
import sys

def send(queue_name, exchange_name, binding):
    connection = pika.BlockingConnection(pika.ConnectionParameters('localhost', 5678))
    channel = connection.channel()
    channel.exchange_declare(exchange=exchange_name,
                             type='topic')
    channel.basic_publish(exchange = exchange_name, 
                          routing_key = binding, 
                          body = 'Hello worlds')
    print 'Message sent'
    
    connection.close

def main(args):
    send('bob', "global_topic", "from_role.to_role")
    
if __name__ == "__main__":
    sys.exit (main (sys.argv))
