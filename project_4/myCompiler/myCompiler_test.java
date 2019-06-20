import org.antlr.runtime.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class myCompiler_test {
	public static void main(String[] args) throws Exception {

      CharStream input = new ANTLRFileStream(args[0]);
      myCompilerLexer lexer = new myCompilerLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
 
      myCompilerParser parser = new myCompilerParser(tokens);
      parser.program();
      
      /* Output text section */
      List<String> text_code = parser.getTextCode();

      //write textCode into temporary j file
      Path file  = Paths.get("tmpJasmin.j");
      Files.write(file, text_code, StandardCharsets.UTF_8);
      
      //for (int i=0; i < text_code.size(); i++)
      //   System.out.println(text_code.get(i));

      }
}
