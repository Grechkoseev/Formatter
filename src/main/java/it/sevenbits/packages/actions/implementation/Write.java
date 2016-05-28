package it.sevenbits.packages.actions.implementation;

import it.sevenbits.packages.actions.IOperation;

/**
 * write current element
 */
public class Write implements IOperation {
    /**
     * Operation of writing symbol
     * @param symbol
     * @param currentIndent
     * @return current symbol
     */
    public String perform(final char symbol, final int currentIndent) {
        return String.valueOf(symbol);
    }
}
