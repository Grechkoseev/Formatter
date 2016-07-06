package it.sevenbits.packages.actions.implementation;

import it.sevenbits.packages.actions.IActions;

import java.util.Arrays;

/**
 * Make indent
 */
public class MakeIndent implements IActions {

    private char indentSymbol;

    /**
     * Constructor
     *
     * @param indentSymbol is symbol of indent
     */
    public MakeIndent(final char indentSymbol) {
        this.indentSymbol = indentSymbol;
    }

    /**
     * Operation of making indent
     * @param symbol
     * @param currentIndent
     * @return string of indent with line break
     */
    public String perform(final char symbol, final int currentIndent) {
        return makeIndent(currentIndent);
    }

    /**
     * Making indent
     * @param offset
     * @return indent
     */
    private String makeIndent(final int offset) {
        char[] array = new char[offset];
        Arrays.fill(array, indentSymbol);
        return new String(array);
    }
}
