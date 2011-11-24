import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        MonitorLexer lex = new MonitorLexer(new ANTLRFileStream("/homes/rn710/Installs/Scribble/bin/Tests/ParallelAtSeller1"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MonitorParser parser = new MonitorParser(tokens);
        MonitorParser.description_return r = parser.description(); 
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());
        
        BuildFSM walker = new BuildFSM(nodes);
        try {
            walker.description();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}