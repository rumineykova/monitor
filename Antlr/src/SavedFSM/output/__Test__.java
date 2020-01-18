import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        MonitorLexer lex = new MonitorLexer(new ANTLRFileStream("C:\\Users\\rumi\\workspace\\MonitorPrototype\\Antlr\\src\\SavedFSM\\output\\__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MonitorParser g = new MonitorParser(tokens, 49100, null);
        try {
            g.description();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}