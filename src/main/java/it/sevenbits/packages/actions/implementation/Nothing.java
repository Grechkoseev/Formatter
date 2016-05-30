package it.sevenbits.packages.actions.implementation;

import it.sevenbits.packages.actions.IActions;

/**
 * write nothing
 */
public class Nothing implements IActions {
    /**
     * Empty string
     * @param symbol
     * @param currentIndent
     * @return empty string
     */
    public String perform(final char symbol, final int currentIndent) {
        return "";
    }
}
