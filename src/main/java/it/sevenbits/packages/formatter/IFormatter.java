package it.sevenbits.packages.formatter;

import it.sevenbits.packages.containers.inputStringContainer.IInputStringContainer;
import it.sevenbits.packages.containers.outputStringContainer.IOutputStringContainer;

/**
 * Interace for formatter class
 */
public interface IFormatter {
    /**
     * Formatter
     * @param inputContainer
     * @param outputContainer
     */
    void format(final IInputStringContainer inputContainer, final IOutputStringContainer outputContainer);
}
