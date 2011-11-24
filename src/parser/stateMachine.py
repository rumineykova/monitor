from model.ProtocolAST.LocalType import LocalType

class ModelVisitor(object):
    def visit(self, node):
          """Visit a node."""
          method = 'visit_' + node.__class__.__name__
          visitor = getattr(self, method, self.generic_visit)
          return visitor(node)
    
    def generic_visit(self, node):
        """Called if no explicit visitor function exists for a node."""
        for field, value in iter_fields(node):
            if isinstance(value, list):
                for item in value:
                    if isinstance(item, LocalType):
                        self.visit(item)
            elif isinstance(value, LocalType):
                self.visit(value)
        
class DFAModelVisitor(ModelVisitor):
    def visit_import(self, stmt_import):
         super(ModelVisitor, self).generic_visit(self, stmt_import)
    