package it.sevenbits.packages.actions;

/**
 * Action interface
 */
public interface IActions {
    /**
     * Operation
     * @param symbol
     * @param currentIndent
     * @return received substring
     */
    String perform(char symbol, int currentIndent);
}
