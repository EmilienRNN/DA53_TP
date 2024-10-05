package tools;

import symbol.SymbolTable;
import token.Token;
import token.TokenType;

import java.io.IOException;
import java.io.Reader;

/** A class Lexer represents a Lexical Analyzer.
 Author: Renon Emilien.
 Date of last modification: 05/10/2024
 */
public class Lexer {

    private final Scanner scanner;

    private final SymbolTable symbolTable = new SymbolTable();

    /**
     * Constructor
     *
     * @param reader a file reader
     */
    public Lexer(Reader reader) {
        this.scanner = new Scanner(reader);
    }

    /**
     * Get the next token. It filters the studied characters and returns the corresponding token.
     *
     * @return the next token
     */
    public Token getNextToken() throws IOException {
        scanner.skipWhitespace();

        // End of file
        if (scanner.peek() == (char) -1) {
            return null;

        // End of line
        } else if (scanner.isEndOfLine()) {
            scanner.get();
            scanner.nextLine();
            System.out.println();
            return getNextToken();

        // Num Token
        } else if (Character.isDigit(scanner.peek())) {
            StringBuilder number = new StringBuilder();
            while (Character.isDigit(scanner.peek())) {
                number.append(scanner.get());
            }
            return new Token(TokenType.NUM, number.toString());

        } else if (Character.isLetter(scanner.peek())) {
            StringBuilder identifier = new StringBuilder();
            while (Character.isLetterOrDigit(scanner.peek()) && !scanner.isWhiteSpace()) {
                identifier.append(scanner.get());
            }

            return checkToken(identifier);

        } else {
            return checkOperand();
        }
    }

    /**
     * Check if the lexeme is a keyword or a variable.
     *
     * @param stringBuilder a string builder
     * @return the token
     */
    protected Token checkToken(StringBuilder stringBuilder) throws IOException {
        String lexeme = stringBuilder.toString().toUpperCase();

        switch (lexeme){
            case "LET":
                return new Token(TokenType.LET);
            case "PRINT":
                return new Token(TokenType.PRINT);
            case "IF":
                return new Token(TokenType.IF);
            case "THEN":
                return new Token(TokenType.THEN);
            case "GOTO":
                return new Token(TokenType.GOTO);
            case "INPUT":
                return new Token(TokenType.INPUT);
            case "GOSUB":
                return new Token(TokenType.GOSUB);
            case "RETURN":
                return new Token(TokenType.RETURN);
            case "END":
                return new Token(TokenType.END);
            case "REM":
                while (!scanner.isEndOfLine()){
                    scanner.get();
                }
                return getNextToken();
            default:
                Token token = new Token(TokenType.ID, lexeme);
                symbolTable.addSymbol(token, scanner.getCurrentLine(), scanner.getCurrentColumn());
                return token;
        }

    }

    /**
     * Check if the lexeme is an operand.
     *
     * @return the token
     */
    protected Token checkOperand() throws IOException {
        char current = scanner.get();
        switch (current){
            case '+':
                return new Token(TokenType.OP, "+");
            case '-':
                return new Token(TokenType.OP, "-");
            case '*':
                return new Token(TokenType.OP, "*");
            case '/':
                return new Token(TokenType.OP, "/");
            case '(':
                return new Token(TokenType.OPEN_PARENT);
            case ')':
                return new Token(TokenType.CLOSE_PARENT);
            case ',':
                return new Token(TokenType.COMA);
            case '<':
                StringBuilder relop = new StringBuilder();
                relop.append(current);
                if(scanner.peek() == '=') {
                    relop.append(scanner.get());
                }
                return new Token(TokenType.RELOP, relop.toString());
            case '>':
                relop = new StringBuilder();
                relop.append(current);
                if(scanner.peek() == '=') {
                    relop.append(scanner.get());
                }
                return new Token(TokenType.RELOP, relop.toString());
            case '=':
                return new Token(TokenType.RELOP, "=");
            case '"':
                StringBuilder string = new StringBuilder();
                while (scanner.peek() != '"'){
                    if(scanner.isEndOfLine()){
                        throw new IOException("String not closed");
                    }
                    string.append(scanner.get());
                }
                scanner.get();
                return new Token(TokenType.STR, string.toString());
            default:
                throw new IOException("Invalid character: " + scanner.peek() + " at line: " + scanner.getCurrentLine() + " column: " + scanner.getCurrentColumn());
        }
    }

    /**
     * Print the symbol table.
     */
    public void printSymbolTable() {
        symbolTable.printSymbolTable();
    }
}
