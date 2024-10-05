import token.Token;
import tools.Lexer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("src/test/test4.tb");
            Lexer lexer = new Lexer(reader);

            Token token;
            System.out.println("========= Lexer Action =========\n");

            while ((token = lexer.getNextToken()) != null) {
                System.out.println(token);
            }

            System.out.println("\n========= Symbol Table =========\n");

            lexer.printSymbolTable();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}