package it.sevenbits.packages.actions.implementation;

import it.sevenbits.packages.actions.IOperation;

import java.util.Arrays;

/**
 * perform a newline
 */
public class NewString implements IOperation {

    private char indentSymbol;

    /**
     * constructor
     * @param indentSymbol symbol to indent
     */
    public NewString(final char indentSymbol) {
        this.indentSymbol = indentSymbol;
    }

    /**
     * Operation of transition on new line
     * @param symbol
     * @param currentIndent
     * @return '\n' + indent + next symbol
     */
    public String perform(final char symbol, final int currentIndent) {
        return "\n" + makeIndent(currentIndent) + symbol;
    }

    /**
     * create indent
     * @param offset
     * @return indent
     */
    private String makeIndent(final int offset) {
        char[] array = new char[offset];
        Arrays.fill(array, indentSymbol);
        return new String(array);
    }
}
