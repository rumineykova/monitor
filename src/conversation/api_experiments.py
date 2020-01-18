class Conversation():
    def __init__(self):
        pass

class Guest(object):
    def __init__(self, configs):
        # # config.yml contains information about the participants and the invitations
        # the file, the roles
        self.protocol = {'buyer-seller': [['buyer_seller_as_buyer.spr'], ['buyer', 'seller']]}
    
    def start(self):
        # Create  the coversation & send the invitations
        Conversation.create(self.protocols['buyer-seller'])
        c = Conversation.join(self.protocols['buyer-seller'], 'seller')
        push = c.receive('U')
        c.send('I', 'StreamMode')
        supported = c.resv('Supported')
        c.send('I', 'ConfigStream');
        
class Originator(object):
    def __init__(self, configs):
        self.protocols = configs
    
    def start(self):
        # config.yml contains information about the participants and the invitations
        # get the roles from the protocol & send invitations
        c = Conversation.join(self.protocols['buyer_seller'], 'seller')
        c.send('buyer', 'Push');
        pull = c.receive();
        
class Enum(set):
    def __getattr__(self, name):
        if name in self:
            return name
        raise AttributeError
StreamingMode = Enum(["PUSH", "POLL"])
        
""" Recursive version with Timers""" 
import signal, os        
class UserApp(BaseApp):
    def __init__(self, configs):
        [self.protocol.append(conf) for conf in configs]
            
    def start(self, mode):
        c = Conversation.join('data_acquisition', 'user')
        # set timer for streaming
        self.set_timer()
        c.send('agent', mode) # can be either push or poll
        # start receiving, receiving will stop when the timer expires 
        c.receive('agent', self.on_data_receive)    

    def on_data_receive(self, conversation, data):
        self.process_data(data)
        # continue to receive from agent
        conversation.receive('agent', self.on_data_receive);
    
    def process_data(self, data):
        print 'Data is processes' 
                    
    def timer_handler(self, signum, frame, conversation):        
        conversation.send('agent', 'Stop')
    
    def set_timer(self, conversation):
        signal.signal(signal.SIGALRM, self.timer_handler, conversation)
        signal.alarm(5)

class InstrumentApp(BaseApp):
    def __init__(self, configs, mode):
        [self.protocol.append(conf) for conf in configs]
        self.supported_mode = mode
            
    def start(self):
        c = Conversation.join('data_acquisition', 'user')
        c.add_interrupt(InteractionMessage('stop'), self.on_interrupt)
        # set timer for streaming
        c.receive('agent', self.on_acquisition_mode_receive)
        
    def on_acquisition_mode_receive(self, conversation, conv_msg):
        supported_status = self.get_supported_status(conv_msg.operation)
        conversation.send('agent',  InteractionMessage(supported_status))
        conversation.invoke(conv_msg.operation)
    
    def poll(self, conversation):
        conversation.receive('agent', self.configure)
        conversation.receive('agent', self.on_poll_receive)

    def on_poll_receive(self, conversation, conv_msg):
        conversation.send('agent', InteractionMessage(None, self.get_data()))
        
    def push(self):
        self.start_streaming()
        #conversation.send('agent', InteractionMessage(None, self.get_data()))
    
    def on_interrupt(self, conversation):
        # Stop interactions

class AgentApp(BaseApp):
    def __init__(self, configs):
        [self.protocol.append(conf) for conf in configs]
            
    def start(self):
        c = Conversation.join('data_acquisition', 'user')
        c.add_interrupt('user', InteractionMessage('stop'), self.on_interrupt)
        # set timer for streaming
        c.receive('agent', self.on_acquisition_mode_receive)

    def on_acquisition_mode_receive(self, conversation, conv_msg):
        self.invoke(conv_msg.operation, conversation) #invoke either push or poll
    
    def push(self, conversation):
        conversation.send('instrument', InteractionMessage('StreamMode'))
        conversation.receive('instrument', self.on_push_support_received)
        
    def on_push_support_received(self, conversation, conv_msg):
        if (conv_msg.operation == 'Supported'):
            self.push_stream()
        else: self.emulated_poll()
            
    def push_stream(self, conversation):
        conversation.send('intrument', InteractionMessage('ConfigPush'))
        while(True): 
            conversation.receive('intrument', self.on_data_receive)
    
    def emulate_push_stream(self):
        conversation.send('intrument', InteractionMessage('ConfigPoll'))
        while(True):
            conversation.send('instrument', InteractionMessage('Poll'))
            conversation.receive('instrument', self.on_data_receive)
            
    def poll(self, conversation):
        conversation.send('intrument', InteractionMessage('ConfigPoll'))
        conversation.receive('instrument', self.on_poll_support_received)
            
    def on_poll_support_received(self, conversation, conv_msg):
        if (conv_msg.operation == 'Supported'):
            self.poll(conversation)
        else: self.emulate_poll(conversation)
    
    def emulate_poll(self, conversation):
        conversation.send('intrument', InteractionMessage('ConfigPush'))
        self.set_polling_timer(self.on_time_elapsed, conversation)
        while(True):
            conversation.receive('instrument', self.on_data_receive)
        
    def on_data_receive(self, conversation, conv_msg):
        formatted_data = self.process_data(conv_msg.payload)
        if (mode == 'Push'):
            conversation.send('user', InteractionMessage('formatted', formatted_data))
        else self.received_data_queue.append(formatted_data)
        
    def on_interrupt(self, conversation):
        conversation.send('instrument', 'stop')                
        
    def on_time_elapsed(self, conversation):
        fomratted_data = self.received_data_queue.pop()
        conversation.send('user', InteractionMessage('formatted', formatted_data))

"""Invocation is handled by the conversation message class. 
   Each operation that might be invoked have conversation argument"""
class UserApp(BaseApp):
    def __init__(self, configs):
        [self.protocol.append(conf) for conf in configs]
            
    def start(self):
        c = Conversation.join(self.protocols['data_acquisition'], 'user')
        c.send('agent', ConversationMessage('Push'))
        # Question. Should we handle that dispatch automatically 
        conv_msg = c.receive('agent')
        conv_msg.invoke(self, conversation)
            
    def format(self, conversation, data):
        print 'Process data'
        conv_msg = conversation.receive('agent')
        if (data_manager.receive_more_data):
            conv_msg.invoke(self)
        else: conversation.send('agent', ConversationMessage('Stop'))

"""Message Dispatch is handled transparently by the Application"""
class UserApp(BaseApp):
    def __init__(self, configs):
        [self.protocol.append(conf) for conf in configs]
            
    def start(self):
        c = Conversation.join(self.protocols['data_acquisition'], 'user')
        """"Conversation message encapsulates the operation (Push) 
        and the arguments if needed (None in the case below) """
        c.send('agent', ConversationMessage('Push'))
        while (data_manager.receive_more_data()):
            data  = c.receive('agent')
            self.invoke(data.operation, data.arguments) 
        c.send('agent', ConversationMessage('Stop'))
            
    def format(self, data):
        print 'Process data'


"""Diverted control flow with callbacks"""
class UserApp(BaseApp):
    def __init__(self, configs):
        """Read the location of the capability files and the roles for the conversation."""
        [self.protocol.append(conf) for conf in configs]
            
    def start_push(self, streaming_mode):
        c = Conversation.join(self.protocols['data_acquisition'], 'user')
        """ can be used to handle both push and pull """
        c.send('agent', ConversationMessge(streaming_mode))
        while (data_manager.receive_more_data()):
            """ Here the dispatch is handled automatically. Format is invoked. 
               I found that this is bad, because the control flow is unclear """ 
            conv_msg = c.receive('agent')
            self.process_data(self.get_data(conv_msg))
        c.send('agent', 'stop')
            
    def on_receive(self, conversation, data):
        if (data_manager.receive_more_data()):
            """ Here the dispatch is handled automatically. Format is inviked. 
                I found that this is bad, because the control flow is unclear """ 
            data  = c.receive('agent')
            self.invoke(data.operation, data.args)
        """ConversationMessage('Stop') add field operation to the header message and sets it to Stop"""
        """low level version is to pass simple dictionary: {'op': 'Stop'}""" 
        c.send('agent', ConversationMessage('Stop'))
        
    def format(self, conversation, data):
        print 'Process data'        


    

class UserApp():
    def __init__(self, configs):
        [self.protocol.append(conf) for conf in configs]
        self.participant = 'bob'
            
    def start(self):
        c = Conversation.join(self.protocols['data_acquisition'], 'user', self.participant, True)
        """"Conversation message encapsulates the operation (Push) 
        and the arguments if needed (None in the case below) """
        c.send('agent', ConversationMessage('push'))      # push to A                      
        while (data_manager.receive_more_data()):          
            data  = c.receive('agent')                    # (FomrattedData) from A 
        # Should we mark tthis message as interrupt message? c.interrupt
        c.send('agent', ConversationMessage('stop')) # stop to A 


class AgentApp():
    def __init__(self, configs):
        """Read the location of the capability files and the roles for the conversation."""
        [self.protocol.append(conf) for conf in configs]
        self.participant = 'allice'
        
    def start(self):
            c = Conversation.join(self.protocols['data_acquisition'], 'agent', self.participant)
            # on_interrupt will be called when interrupt message is received
            interrupt_msg = ConversationMessage('stop')                                    
            c.configure_interrup('user', interrupt_msg)
        try:      
            # Start the actual workflow
            conv_msg = c.receive('user');                                                # push from U
            acquisition_mode = 
                self.get_node_by_operation(conv_msg.operation)
            
            c.send("instrument", ConversationMessage('check_support', acquisition_mode)) # check_support from I  
            conv_msg = c.receive("instrument")                                           # (Supported) from I 
            config_options = self.config_streaming(conv_msg.args)       
            
            c.send("instrument", ConversationMessage('configure', config_options))       # configure(Options) to I
            # Is that extremely ugly. It bothers me a lot, I want a nicer way :(
            while(True):
                if (self.get_status(config_options) == Status.NotSupported):
                    c.send('instrument', ConversationMessage('poll'))                       
                conv_msg = c.receive('instrument')                                       # RawData from I
                formatted_data = self.get_formatted_data(conv_msg)
                c.send('user', self.get_data(conv_msg))                                  # FormattedData to U     
        with InterruptException:
            conversation.send('instrument', ConversationMessage('stop'))                 # stop to I
            
class InstrumentApp():
    def __init__(self, configs):
        """Read the location of the capability files and the roles for the conversation."""
        [self.protocol.append(conf) for conf in configs]
        self.participant = 'carol'
        
    def start(self):
            c = Conversation.join(self.protocols['data_acquisition'], 'instrument', self.participant)
            # on_interrupt will be called when interrupt message is received
            interrupt_msg = ConversationMessage('stop')                                    
            c.configure_interrup('agent', interrupt_msg, self.on_interrupt_data_acquisition)
        
        try:    
            # Start the actual workflow
            conv_msg = c.receive('agent');                             # check_support from I
            support_status = self.check_support(conv_msg.args)
            
            c.send("agent", ConversationMessage(None, support_status)) # (Supported) to A  
            conv_msg = c.receive("agent")                              # (Supported) from I 
            self.configure(conv_msg.args)                              # configure(Options) to I
            
            while(True):
                if (support_status == Status.NotSupported):
                    # wait to receive poll
                    conv_msg = conversation.receive('agent')                       
                raw_data = self.collect_raw_data()
                c.send('agent', raw_data)                              # RawData from I
                
        with InterruptMessage:
            print 'We are done'        
                
                
                
"""Nice to have will be the how the actual invitation is done and how the code conversation is started 
and initialized by the config. So we have ...send and receive. It is the simple low leve, it can always be wrapped 
with dispatch of function calls, we do not show that here """
        