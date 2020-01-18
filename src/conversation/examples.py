import os
from conversation_api import Conversation, Protocol 
from common.configuration import Configuration
from conversation.conversation_api import start_monitor

def get_lt_full_name(file_name):
    return os.path.join(Configuration.get_specs_directory(), 
                        file_name)

def conversation_configuration():
    participants = [['bob', 'C', get_lt_full_name('RecAsRepeat.spr')], 
                    ['allice', 'S', get_lt_full_name('RecAsRepeat.spr')]]
    return participants


class ClientApp(object):
    def do_payment(self):
        c = Conversation.join(conversation_configuration(), 'C', 'bob', True, True)
        conv_msg = c.receive('S')
        account = conv_msg.content 
        print account
        c.send('S', 'MakePayment', 'ab2014', '10')
        #conv_msg = c.receive('S') # receive acknowledgement
        c.send('S', 'Quit')

class ServerApp(object):
    def start(self):
        # Create  the coversation & send the invitations
        c = Conversation.join(conversation_configuration(), 'S', 'allice', False, True)
        c.send('C', 'BalanceOverfdraft', 'no money no cash :(')
        conv_msg = c.receive('S')
        print 'Make payment arguments are: %s' %(conv_msg.content)
        #c.send('C', 'Ack') # send acknowledgement
        conv_msg = c.receive('S')
        print 'I receive label:%s' %(conv_msg.label)
        
    def on_received(self, conversation, conv_msg):
        print 'Received'
        #conversation.close()

def main():
    #start_monitor('bob')
    #start_monitor('allice')
    #ClientApp().do_payment()
    ServerApp().start()
    
if (__name__=='__main__'):
    main()