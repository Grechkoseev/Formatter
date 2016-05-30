package it.sevenbits.packages.actions.implementation;

import it.sevenbits.packages.actions.IActions;
import it.sevenbits.packages.actions.IndentCounter;

import java.util.Arrays;

/**
 * delete the indent
 */
public class CloseBraceWithoutLineBreak implements IActions {

    private char indentSymbol;
    private int indentLength;
    private IndentCounter indentCounter;

    /**
     * constructor
     * @param indentSymbol symbol to indent
     * @param indentLength
     */
    public CloseBraceWithoutLineBreak(final char indentSymbol, final int indentLength, final IndentCounter indentCounter) {
        this.indentSymbol = indentSymbol;
        this.indentLength = indentLength;
        this.indentCounter = indentCounter;
    }

    /**
     * Operation of removal of indent
     * @param symbol
     * @param currentIndent
     * @return indent
     */
    public String perform(final char symbol, final int currentIndent) {
        indentCounter.setIndentCounter(currentIndent - indentLength);
        return createIndent(indentCounter.getIndentCounter()) + symbol;
    }

    /**
     * create indent
     * @param offset
     * @return indent
     */
    private String createIndent(final int offset) {
        char[] array = new char[offset - 4];
        Arrays.fill(array, indentSymbol);
        return new String(array);
    }
}
