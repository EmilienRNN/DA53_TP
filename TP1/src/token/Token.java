package token;

/** A class Token represents a token.
 Author: Renon Emilien.
 Date of last modification: 05/10/2024
 */
public class Token {

    private final TokenType type;
    private final String value;

    /**
     * Constructor
     *
     * @param type the type of the token
     * @param value the value of the token
     */
    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Constructor
     *
     * @param type the type of the token
     */
    public Token(TokenType type) {
        this.type = type;
        this.value = null;
    }

    /**
     * Get the type
     *
     * @return type
     */
    public TokenType getType() {
        return type;
    }

    /**
     * Get the value
     *
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * Get the string representation of the token
     *
     * @return string representation of the token
     */
    @Override
    public String toString() {
        if (value == null) {
            return "<" + type + ">";
        }else {
            return "<" + type + ", " + value + ">";
        }
    }

}
