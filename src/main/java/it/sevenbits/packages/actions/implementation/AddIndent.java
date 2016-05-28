package it.sevenbits.packages.actions.implementation;

import it.sevenbits.packages.actions.IOperation;
import it.sevenbits.packages.formatter.Implementation.IndentCounter;

import java.util.Arrays;

/**
 * adds the indentation and transit on new line
 */
public class AddIndent implements IOperation {

    private char indentSymbol;
    private int indentLength;
    private IndentCounter indentCounter;

    /**
     * constructor
     * @param indentSymbol symbol to indent
     * @param indentLength
     */
    public AddIndent(final char indentSymbol, final int indentLength, final IndentCounter indentCounter) {
        this.indentSymbol = indentSymbol;
        this.indentLength = indentLength;
        this.indentCounter = indentCounter;
    }

    /**
     * Operation of adding of indent and transition on new line
     * @param symbol
     * @param currentIndent
     * @return string '\n' + indent
     */
    public String perform(final char symbol, final int currentIndent) {
        indentCounter.setIndentCounter(currentIndent + indentLength);
        return '\n' + addIndent(indentCounter.getIndentCounter()) + symbol;
    }

    /**
     * add indent
     * @param offset
     * @return string with braces
     */
    private String addIndent(final int offset) {
        char[] array = new char[offset];
        Arrays.fill(array, indentSymbol);
        return new String(array);
    }
}
