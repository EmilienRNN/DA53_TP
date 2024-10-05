package symbol;

import token.Token;

/** A class Symbol represents a symbol.
 Author: Renon Emilien.
 Date of last modification: 05/10/2024
 */
public class Symbol {

    private Token token;

    private Integer firstLineOccurrence;

    private Integer firstColumnOccurrence;

    /**
     * Constructor
     *
     */
    public Symbol(){
    }

    /**
     * Constructor
     *
     * @param token a token (ex : <ID, A>)
     * @param firstLineOccurrence the first line occurrence of the token
     * @param firstColumnOccurrence the first column occurrence of the token
     */
    public Symbol(Token token, Integer firstLineOccurrence, Integer firstColumnOccurrence) {
        this.token = token;
        this.firstLineOccurrence = firstLineOccurrence;
        this.firstColumnOccurrence = firstColumnOccurrence;
    }

    /**
     * Get the token
     *
     * @return token
     */
    public Token getToken() {
        return token;
    }

    /**
     * Set the token
     *
     * @param token a token (ex : <ID, A>)
     */
    public void setToken(Token token) {
        this.token = token;
    }

    /**
     * Get the first line occurrence
     *
     * @return firstLineOccurrence
     */
    public Integer getFirstLineOccurrence() {
        return firstLineOccurrence;
    }

    /**
     * Set the first line occurrence
     *
     * @param firstLineOccurrence the first line occurrence of the token
     */
    public void setFirstLineOccurrence(Integer firstLineOccurrence) {
        this.firstLineOccurrence = firstLineOccurrence;
    }

    /**
     * Get the first column occurrence
     *
     * @return firstColumnOccurrence
     */
    public Integer getFirstColumnOccurrence() {
        return firstColumnOccurrence;
    }

    /**
     * Set the first column occurrence
     *
     * @param firstColumnOccurrence the first column occurrence of the token
     */
    public void setFirstColumnOccurrence(Integer firstColumnOccurrence) {
        this.firstColumnOccurrence = firstColumnOccurrence;
    }
}
