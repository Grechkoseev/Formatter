package it.sevenbits.packages.actions.implementation;

import it.sevenbits.packages.actions.IActions;
import it.sevenbits.packages.actions.IndentCounter;

import java.util.Arrays;

/**
 * delete the indent and and transit on new line
 */
public class CloseBrace implements IActions {

    private char indentSymbol;
    private int indentLength;
    private IndentCounter indentCounter;

    /**
     * constructor
     * @param indentSymbol symbol to indent
     * @param indentLength
     */
    public CloseBrace(final char indentSymbol, final int indentLength, final IndentCounter indentCounter) {
        this.indentSymbol = indentSymbol;
        this.indentLength = indentLength;
        this.indentCounter = indentCounter;
    }

    /**
     * Operation of removal of indent and transit on new line
     * @param symbol
     * @param currentIndent
     * @return '\n' + indent
     */
    public String perform(final char symbol, final int currentIndent) {
        indentCounter.setIndentCounter(currentIndent - indentLength);
        return '\n' + createIndent(indentCounter.getIndentCounter()) + symbol;
    }

    /**
     * create indent
     * @param offset
     * @return indent
     */
    private String createIndent(final int offset) {
        char[] array = new char[offset];
        Arrays.fill(array, indentSymbol);
        return new String(array);
    }
}
