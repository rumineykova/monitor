import sys
import os
def get_src_folder_path():
    return os.path.normpath("%s/../../" %__file__);

class Configuration(object):
    @classmethod
    def get_specs_directory(cls):
        return os.path.normpath(os.path.join(get_src_folder_path(), 'specs/'))
    @classmethod
    def get_test_directory(cls):
        return os.path.normpath(os.path.join(get_src_folder_path(), 'test/'))
    @classmethod
    def get_benchmark_directory(cls):
        return os.path.normpath('/homes/rn710/benchmarks/')
    @classmethod
    def get_python_path(cls):
        return os.path.normpath('/homes/rn710/monitorEnv/bin/python')
    
    
    
def main(args):
    print Configuration.get_specs_directory() 

if __name__ == '__main__':
    sys.exit(main(sys.argv))