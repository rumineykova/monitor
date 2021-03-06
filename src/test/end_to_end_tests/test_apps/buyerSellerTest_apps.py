import sys 
from conversation.conversation_types import LocalType
from test.end_to_end_tests.test_apps import apps_utils 
from test.benchmark_logger import BenchmarkLogger, BenchmarkType
import random
import time
import datetime 
#sys.path.append('/homes/rn710/workspace/MonitorPrototype/src/core')

def create_buyer_app(cid, participant, repetitions=20):
    role = 'Buyer'
    lt_file = apps_utils.get_lt_full_name("Benchmark_BuyerApp.spr")
    
    event_trace = [[LocalType.RESV, 'Confirmation', 'Seller', '1'],
                   [LocalType.SEND, 'OK', 'Seller', '-1'],
                   [LocalType.RESV, 'Confirmation', 'Seller', '1'], 
                   [LocalType.SEND, 'OK', 'Seller', '-1']]
    
    full_trace = event_trace
    for i in range(0, repetitions):
        full_trace = full_trace + event_trace
    
    end_trace = [[LocalType.RESV, 'OutOfStock', 'Seller']]
    full_trace = full_trace + end_trace + [[LocalType.SEND, 'END', 'Seller']]
    buyer_app = apps_utils.BaseApp(cid, role, participant, 
                        full_trace, lt_file)
    return buyer_app  

def create_seller_app(cid, participant, repetitions=20):
    role = 'Seller'
    lt_file = apps_utils.get_lt_full_name("Benchmark_SellerApp.spr")
    
    event_trace = [[LocalType.SEND, 'Confirmation', 'Buyer', '1'],
                   [LocalType.RESV, 'OK', 'Buyer', '-1'], 
                   [LocalType.SEND, 'Confirmation', 'Buyer', '1'], 
                   [LocalType.RESV, 'OK', 'Buyer', '-1']]
    
    full_trace = event_trace
    for i in range(0, repetitions):
        full_trace = full_trace + event_trace
        
    end_trace = [[LocalType.SEND, 'OutOfStock', 'Buyer']]
    full_trace = full_trace + end_trace + [[LocalType.SEND, 'END', 'Buyer']]
    
    seller_app = apps_utils.BaseApp(cid, role, participant, full_trace, 
                         lt_file, create_buyer_seller_conversation)
    return seller_app
        
def create_buyer_seller_conversation(cid):
    participants = [['alice', 'seller', apps_utils.get_lt_full_name('Benchmark_SellerApp.spr')], 
                    ['bob', 'buyer', apps_utils.get_lt_full_name('Benchmark_BuyerApp.spr')]]
    conversation = apps_utils.BaseConversation(cid, participants)
    return conversation 
    
def main(args, repetitions = 1, type_of_benchmark = BenchmarkType.Full_Monitor):
    print args, repetitions
    try:
        #has_monitor = args[3]
        #has_timing = args[4]
        cid = 1234
        #random.randint(0, 1000)
        if (args[0] == 'App' and args[1] =='Buyer'):
            buyer = create_buyer_app(cid, args[2], repetitions)
            
            #if has_monitor: 
            buyer.set_monitor_on()
            #else: 
            #buyer.set_monitor_off()
            
            #if has_timing: timeit(buyer.start, type_of_benchmark, repetitions)
            #else: 
            buyer.start()
        
        elif (args[0] == 'App' and args[1] =='Seller'):
            seller = create_seller_app(cid, args[2], repetitions)
            
            seller.set_monitor_on()
            #else: 
            #seller.set_monitor_off()
            
            #timeit(seller.start, type_of_benchmark, repetitions)
            #else: 
            seller.start()
            
        elif (args[0] == 'Monitor' and args[1] =='Buyer'):
            apps_utils.start_monitor(cid, args[2], args[1], 
                                          apps_utils.get_lt_full_name("PurchasingAtBuyer.txt"))
        elif (args[0] == 'Monitor' and args[1] =='Seller'):
            apps_utils.start_monitor(cid, args[2], args[1], 
                                                      apps_utils.get_lt_full_name("PurchasingAtSeller.txt"))
    except Exception as e:
        print e
        print 'Error' 
        sys.exit()
 

def timeit(func, type_of_benchmark, repetitions):
    print 'A am logging'
    logger = BenchmarkLogger('/homes/rn710/benchmarks/Full_Monitor.txt', type_of_benchmark)
    t0 = time.time() 
    func()
    delta = time.time() - t0
    logger.log(str(repetitions),delta)
    
if (__name__=='__main__'):
    #main(["Monitor", "Seller", "alice"])
    #main(["Monitor", "Buyer", "bob"])
    #main(["App", "Buyer", "bob"], 1)
    #main(["App", "Seller", "alice"], 1)
    pass