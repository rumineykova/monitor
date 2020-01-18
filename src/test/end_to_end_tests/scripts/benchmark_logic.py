#!/homes/rn710/monitorEnv/bin/python

import os, sys
 # cmd_folder = os.path.dirname(os.path.abspath(__file__)) # DO NOT USE __file__ !!!
 # __file__ fails if script is called in different ways on Windows
 # __file__ fails if someone does os.chdir() before
 # sys.argv[0] also fails because it doesn't not always contains the path
sys.path.append("/homes/rn710/workspace/MonitorPrototype/src")
#print sys.path
from common import *
from core import *
from conversation import *
from exceptions import *
from messaging import *
from parsing import *
from test import * 
import BuyerSellerTest

app_mapping = {'allice':["App", "Seller", "alice", "True", "True"],'allice-monitor':["Monitor", "Seller", "alice", "False", "False"], 
               'bob':["App", "Buyer", "bob", "True", "False"], 'bob-monitor':["Monitor", "Buyer", "bob", "False", "False"]}

print sys.argv
repetitions = 5
if len(sys.argv)> 2: repetitions = int(sys.argv[2])

buyer_seller_apps.main(app_mapping.get(sys.argv[1]), repetitions)