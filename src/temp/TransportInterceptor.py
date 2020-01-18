import socket
import sys
import thread 


class TransportInterceptor(object):
    DEFAULT_SERVER_HOST = 'localhost'
    DEFAULT_SERVER_PORT = 5672
    DEFAULT_CLIENT_PORT = 5678
    DEFAULT_CLIENT_HOST = ''
    
    def start_new(self, settings):
        thread.start_new_thread(server, settings)
        lock = thread.allocate_lock()
        lock.acquire()
        lock.acquire()    

#settings are: client_host, client_port, server_host, server_port
def server(*settings):
    try:
        client_host, client_port, server_host, server_port = settings
        dock_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        dock_socket.bind(('', client_port))
        dock_socket.listen(1)
        while True:
            client_socket = dock_socket.accept()[0]
            server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
            server_socket.connect((server_host, server_port))
            thread.start_new_thread(intercept, (client_socket, server_socket))
            thread.start_new_thread(intercept, (server_socket, client_socket))
    finally:
        thread.start_new_thread(server, settings)

def intercept(source, destination):
    string = ' '
    while string:
        string = source.recv(1024)
        print string
        if string:
            destination.sendall(string)
        else:
            source.shutdown(socket.SHUT_RD)
            destination.shutdown(socket.SHUT_WR)

def main(argv):
    interceptor = TransportInterceptor()
    interceptor.start_new((interceptor.DEFAULT_CLIENT_HOST,
                           interceptor.DEFAULT_CLIENT_PORT, 
                           interceptor.DEFAULT_SERVER_HOST, 
                           interceptor.DEFAULT_SERVER_PORT))
    
if __name__ == '__main__':
    main('')
