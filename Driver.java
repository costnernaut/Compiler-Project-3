import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import java.util.*;
import java.io.*;


public class Driver {
    public static void main(String[] args) throws Exception {
// create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream(System.in);
// create a lexer that feeds off of input CharStream
        LittleLexer lexer = new LittleLexer(input);
// create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

	LittleParser parser = new LittleParser(tokens);
	ParseTree tree = parser.program();
	
// Create a generic parse tree walker that can trigger callbacks
	 ParseTreeWalker walker = new ParseTreeWalker();
	 SymbolTableExtractor ste = new SymbolTableExtractor();
	 walker.walk(ste, tree);

         //MAKE IT PRINT PRETTY LATER HE HE
	
	return;

    }
}
