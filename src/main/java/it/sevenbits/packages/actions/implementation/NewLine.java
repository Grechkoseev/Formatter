package it.sevenbits.packages.actions.implementation;

import it.sevenbits.packages.actions.IActions;

import java.util.Arrays;

/**
 * if semicolon or :
 */
public class NewLine implements IActions {

    private char indentSymbol;

    /**
     * constructor
     * @param indentSymbol symbol to indent
     */
    public NewLine(final char indentSymbol) {
        this.indentSymbol = indentSymbol;
    }

    /**
     * Operation of transition on new line
     * @param symbol
     * @param currentIndent
     * @return ";\n" + indent
     */
    public String perform(final char symbol, final int currentIndent) {
        return ";\n" + makeIndent(currentIndent);
    }

    /**
     * create indent
     * @param offset
     * @return indent
     */
    private String makeIndent(final int offset) {
        char[] array = new char[offset - 4];
        Arrays.fill(array, indentSymbol);
        return new String(array);
    }
}
