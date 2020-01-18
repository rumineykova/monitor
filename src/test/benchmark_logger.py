import time
class Enum(set):
    def __getattr__(self, name):
        if name in self:
            return name
        raise AttributeError

BenchmarkType = Enum(["Full_Monitor", "Only_Forwarder", "No_Forwarder"])
class BenchmarkLogger(object):
    def __init__(self, log_file, benchmark_type = BenchmarkType.Full_Monitor, measure_initialize = False):
        self.measure_initialize = measure_initialize
        self.log_file = log_file
        self.benchmark_type = benchmark_type
        
    def log(self, msg, time):
        f = open(self.log_file, 'a')
        full_msg = "%s:%s\n"%(msg, time)
        print full_msg
        f.write(full_msg)
        f.flush()
        f.close()
    def log_summary(self):
        pass
    
    @classmethod    
    def timeit(func,args, msg):
        print 'A am logging'
        logger = BenchmarkLogger('/homes/rn710/benchmarks/Full_Monitor.txt', BenchmarkType.Full_Monitor)
        t0 = time.time() 
        func(args)
        delta = time.time() - t0
        logger.log(msg ,delta)