import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String input = new String(Files.readAllBytes(Paths.get("test.lisp")));


        CharStream charStream = CharStreams.fromString(input);

        LispLexer lexer = new LispLexer(charStream);

        
        for (Token token : lexer.getAllTokens()) {
            System.out.println("Token: " + token.getText() + ", Type: " + lexer.getVocabulary().getSymbolicName(token.getType()));
        }
    }
}
