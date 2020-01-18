Set-up:

1) Install RabbitMQ Server (http://www.rabbitmq.com/download.html)
2) Install pika, client library for Python: https://github.com/pika/pika
3) Install pyDev: http://pydev.org/manual_101_install.html
4) Install antlr (antlr-runtime-3.1.3): http://www.antlr.org/download/Python 
5) Import the project: http://www.doc.ic.ac.uk/~rn710/monitor/monitor.rar
Resources: 

paper page: http://www.doc.ic.ac.uk/~rn710/monitor/
the paper contains explanation of the api and the monitor implementation
Important files and how to implement a use case: 

conversaion_api.py module: 
path: MonitorPrototype\src\conversation\exampl.py
description: contains the main  classes for Conversation API. 
You need to import the Conversation class: 
from conversation_api import Conversation
The class provides the basic primitives you need to program distributed application using conversations. You need to use the following methods: join, send, receive.
example.py: 
path: MonitorPrototype\src\conversation\example.py
description: contains implementation of processes (buyer and seller) that are meant to interact with each other following a specific protocol.
The global and the local types are provided in the Scribble language. This is a language based on multiparty session types. 
How to run it without monitor: run the buyer first, then run the seller. That’s it.
How to run it with monitor: run the buyer-monitor, run the buyer, run the seller-monitor, then the seller.
Note: for monitor to work, the is_monitorable parameter should be set to True when the conversation is instantiated in the endpoints
