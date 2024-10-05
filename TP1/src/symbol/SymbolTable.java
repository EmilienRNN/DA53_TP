package symbol;

import token.Token;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/** A class SymbolTable represents a symbol table.
 Author: Renon Emilien.
 Date of last modification: 05/10/2024
 */
public class SymbolTable {

    private final Map<Token, Symbol> symbolTable = new HashMap<>();

    /**
     * Constructor
     *
     */
    public SymbolTable() {
    }

    /**
     * Add a symbol to the symbol table. If the symbol already exists, it is not added.
     *
     * @param token a token (ex : <ID, A>)
     * @param firstLineOccurrence the first line occurrence of the token
     * @param firstColumnOccurrence the first column occurrence of the token
     */
    public void addSymbol(Token token, Integer firstLineOccurrence, Integer firstColumnOccurrence) {
        Symbol symbol = new Symbol(token, firstLineOccurrence, firstColumnOccurrence);
        boolean exists = symbolTable.keySet().stream()
                .anyMatch(existingToken -> existingToken.getValue().equals(token.getValue()));
        if (!exists) {
            symbolTable.put(token, symbol);
        }
    }

    /**
     * Print the symbol table
     *
     * @return symbolTable
     */
    public void printSymbolTable() {
        for (Map.Entry<Token, Symbol> entry : symbolTable.entrySet()) {
            Token token = entry.getKey();
            Symbol symbol = entry.getValue();
            System.out.println(token + " - Line : " + symbol.getFirstLineOccurrence() + " Column : " + symbol.getFirstColumnOccurrence());
        }
    }
}
