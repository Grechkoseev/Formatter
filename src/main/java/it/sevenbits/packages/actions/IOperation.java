package it.sevenbits.packages.actions;

/**
 * Interface for classes that describes operations with string
 */
public interface IOperation {

    /**
     * Operation
     * @param symbol
     * @param currentIndent
     * @return received substring
     */
    String perform(char symbol, int currentIndent);
}
