import org.antlr.runtime.*;

public class testInterp {
	public static void main(String[] args) throws Exception {

      CharStream input = new ANTLRFileStream(args[0]);
      myInterpLexer lexer = new myInterpLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
 
      myInterpParser Interp = new myInterpParser(tokens);
      Interp.program();
	}
}
