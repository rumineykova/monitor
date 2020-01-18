'''
Created on 27 Apr 2012

@author: yingke
'''

import os
import random
from conversation_api import Conversation, start_monitor
from common.configuration import Configuration

def get_lt_full_name(file_name):
    return os.path.join(Configuration.get_specs_directory() , 
                        file_name)

def conversation_configuration():
    participants = [['client', 'Client', get_lt_full_name('ecoop\LogicExample_at_Client.spr')], 
                    ['server', 'Server', get_lt_full_name('ecoop\LogicExample_at_Server.spr')]]
    return participants


class SimpleWalletClient(object):
    def do_payment(self):
        print 'CLIENT'
        c = Conversation.join(conversation = conversation_configuration(), 
                              self_role = 'Client', participant = 'client', 
                              is_originator = True, is_monitorable = False)
        conv_msg = c.receive('Server')
        conv_msg = c.receive('Server')
        c.send('Server', 'Quit')

class SimpleWalletServer(object):
    def start(self):
        print 'SERVER'
        c = Conversation.join(configuration = conversation_configuration(), 
                              role = 'Server', participant = 'server', 
                              is_originator = False, is_monitorable = False)
        c.send('Client', 'Balance', '1000')
        c.send('Client', 'OverdraftLimit', '2000')
        conv_msg = c.receive('Client')


class WalletClient(object):
    def do_payment(self):
        print 'CLIENT'
        c = Conversation.join(configuration = conversation_configuration(), 
                              self_role = 'Client', participant = 'client', 
                              is_originator = True, is_monitorable =  True)
        # Receive balance
        conv_msg = c.receive('Server')
        balance = int(conv_msg.content[0])
        # Receive overdraft limit
        conv_msg = c.receive('Server')
        overdraft = int(conv_msg.content[0]) 
        
        # Make a payment
        amount = random.randint(0,balance+overdraft)
        c.send('Server', 'MakePayment', str(amount))

        # Receive new balance
        conv_msg = c.receive('Server')
        balance_new = conv_msg.content 
        # Receive overdraft limit
        conv_msg = c.receive('Server')
        overdraft = conv_msg.content 
        c.send('Server', 'Quit')

class WalletServer(object):
        
    def start(self,balance,overdraft):      
        # Create  the coversation & send the invitations
        c = Conversation.join(configuration = conversation_configuration(), 
                              self_role = 'Server', participant = 'server', 
                              is_originator = False, is_monitorable = True)
        self.loop(c,balance,overdraft)
    
    def loop(self,c,balance,overdraft):
        # Send balance and overdraft
        print 'Sending balance' 
        c.send('Client', 'Balance', str(balance))
        print 'Sending overdraft' 
        c.send('Client', 'OverdraftLimit', str(overdraft))
        # Receive one of three choices from Client
        conv_msg = c.receive('Client')
        if conv_msg.label == 'MakePayment':
            print 'Client has made a payment of',conv_msg.content,'.' 
            self.loop(c,balance-int(conv_msg.content[0]),overdraft)
        elif conv_msg.label == 'CloseAccount':
            print 'Client has closed the account.'
        elif conv_msg.label == 'Quit':
            print 'Client has quit session.'
        
    def on_received(self, conversation, conv_msg):
        print 'Received'
        #conversation.close()

def main():
    """The monitor for each participant should be started prior to starting the participant itself.
    Thus, th eorder of executions is as numbered below"""
    """1. Start the client monitor"""
    #start_monitor('client')
    """1. Start the Server monitor"""
    #start_monitor('server')
    """1. Start the Client monitor"""
    #WalletClient().do_payment()
    """1. Start the Server monitor"""
    WalletServer().start(-4000,100)
    
    #start_monitor('client')
    #start_monitor('server')
    #client = SimpleWalletClient().do_payment()
    #server = SimpleWalletServer().start()
    
if (__name__=='__main__'):
    main()