"""
Uncomment paramiko
"""
import sys, os, string, threading
#import paramiko
from  common.configuration import Configuration 
import time
import datetime
import optparse

python_path = Configuration.get_python_path()
#benchmark_script_path = os.path.normpath("/homes/rn710/%s/../../" %__file__) + '/end-to-end-tests/scripts/benchmark_logic.py'
benchmark_script_path = os.path.normpath("/homes/rn710/%s/../../" %__file__) + '/end-to-end-tests/scripts/benchmark_big_fsm.py'
#benchmark_script_path = os.path.normpath("/homes/rn710/%s/../../" %__file__) + '/end-to-end-tests/scripts/benchmark_msg_size.py'

print "file:%s" %(__file__)
print benchmark_script_path 

start_order = ['allice-monitor', 'bob-monitor','bob', 'allice']
#start_order=  ['bob', 'allice'] 
def get_commands(mapping, repetition, script_path):
    commands = []
    for key in mapping: 
        cmd = python_path + ' ' +  script_path + ' ' + key + ' ' + str(repetition)
        #cmd = python_path + ' ' + os.path.normpath("%s/../" %__file__) + '/hello.py'
        commands.append(cmd)
    return commands

def workon(host, cmd):
    print cmd
    #ssh = paramiko.SSHClient()
    #ssh.set_missing_host_key_policy(paramiko.AutoAddPolicy())
    #ssh.connect(host, username='rn710', password='******')
    #stdin, stdout, stderr = ssh.exec_command(cmd)
    #stdin.flush()
    #stdout.flush()
    #stderr.flush
    #with outlock:
    #print os.path.normpath("%s/../" %__file__);
    #print stdout.readlines()
    #print stdout.readlines()
    #print stderr.readlines()

def do_work(repetitions, script_path, hosts):
    client_args = get_commands(start_order, repetitions, script_path)
    threads = []
    for c, arg in zip(hosts, client_args):
        t = threading.Thread(target=workon, args=(c,arg,))
        t.start()
        time.sleep(1)
        threads.append(t)
    t.join()
    print 'over'

def get_parsed_arg_options(argv):
    parser = optparse.OptionParser("usage: %prog [options] ...")
    
    parser.add_option("-s", "--script", dest="benchmark_script_path",
                       default=benchmark_script_path, type="string",
                       help="the path to the script that start all apps associated with the test conversation")
    
    parser.add_option("-h", "--hosts", dest="repetition_range", default= ['corona02', 'corona03', 'corona04', 'corona05'],
                       type="list", help="the host names to be used to run the different test apps." + 
                       "Example: ['corona02', 'corona03', 'corona04', 'corona05']")

    parser.add_option("-w", "--warmup", dest="warm_ups",
                       default="10", type="int",
                       help="specify the number of warm ups")
    
    parser.add_option("-wr", "--warmuprepetitions", dest="warm_up_repetitions", default=1,
                       type="int", help="the number of repetitions for the same configuration during the warmup runs")
    
    parser.add_option("-r", "--repetitions", dest="average_over", default=100,
                       type="int", help="the number of runs for the same configuration")
    
    parser.add_option("-c", "--configurations", dest="repetition_range", default=5,
                       type="int", help="the number of different configurations")
    
    (options, _) = parser.parse_args()
    return options    
def main(args):
    
    """ Process arguments """
    options = get_parsed_arg_options()
    script_path = options.script_path
    warm_ups = options.warmups
    average_over = options.average_over
    repetition_range = options.repetition_range
    warm_up_repetitions = options.warm_up_repetitions
    hosts = options.hosts
    print 'I am in main'
    """ Warm ups """ 
    print 'Start: %s' %(datetime.datetime.now()) 
    for _ in range(1, warm_ups):
        do_work(warm_up_repetitions, script_path)
    
    
    """ Start benchmarking """ 
    repetition = 10
    for _ in range (1, repetition_range):
        for _ in range (1, average_over):
            f = open(Configuration.get_benchmark_directory() + '/Monitor_check.txt', 'a')
            f.write("start processing %s:\n" %(repetition))
            do_work(repetition, script_path, hosts)
        repetition = repetition*10
    print 'END:%s' %(datetime.datetime.now())
    
    
main(sys.argv)