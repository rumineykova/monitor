import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        MonitorLexer lex = new MonitorLexer(new ANTLRFileStream("/homes/rn710/Installs/Scribble/bin/Tests/RecAtBuyer.spr"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MonitorParser g = new MonitorParser(tokens, 49100, null);
        try {
            g.description();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}