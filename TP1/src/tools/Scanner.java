package tools;

import java.io.IOException;
import java.io.Reader;

/** A class Scanner represents a file scanner.
 Author: Renon Emilien.
 Date of last modification: 05/10/2024
 */
public class Scanner {

    private final Reader reader;

    private int currentLine = 1;

    private int currentColumn = 1;

    private char currentChar;

    private String studiedString;

    /**
     * Constructor
     *
     * @param reader a file reader
     */
    public Scanner(Reader reader) {
        this.reader = reader;
        try {
            currentChar = (char) reader.read();
            skipWhitespace();
        } catch (IOException e) {
            e.printStackTrace();
            this.currentChar = 0;
        }
    }

    /**
     * Peek the current character
     *
     * @return the current character
     */
    public char peek() {
        return currentChar;
    }

    /**
     * Get the current character znd move to the next one.
     *
     * @return the current character
     */
    public char get() throws IOException {

        char ch = currentChar;
        currentChar = (char) reader.read();
        currentColumn++;

        return ch;
    }

    /**
     * Get the current line of the character.
     *
     * @return the current line of character
     */
    public int getCurrentLine() {
        return currentLine;
    }

    /**
     * Get the current column of the character.
     *
     * @return the current column of character
     */
    public int getCurrentColumn() {
        return currentColumn;
    }

    /**
     * Skip the whitespace characters.
     */
    public void skipWhitespace() throws IOException {
        while (Character.isWhitespace(currentChar) && currentChar != '\n') {
            get();
        }
    }

    /**
     * Check if the character is the end of the line.
     *
     * @return true if the character is the end of the line, false otherwise
     */
    public boolean isEndOfLine() {
        return currentChar == '\n';
    }

    /**
     * Check if the character is a whitespace.
     *
     * @return true if the character is a whitespace, false otherwise
     */
    public boolean isWhiteSpace() {
        return Character.isWhitespace(currentChar);
    }

    /**
     * Move to the next line.
     */
    public void nextLine() {
        currentLine++;
        currentColumn = 1;
    }

}
