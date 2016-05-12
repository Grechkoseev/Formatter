package it.sevenbits.packages.formatter;

import it.sevenbits.packages.containers.inputStringContainer.IInputStringContainer;
import it.sevenbits.packages.containers.outputStringContainer.IOutputStringContainer;
import it.sevenbits.packages.formatter.Implementation.FormatException;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.writer.IWriter;

/**
 * Interface for formatter class
 */
public interface IFormatter {
    /**
     * Formatter
     * @param inputContainer
     * @param outputContainer
     */
    void format(final IInputStringContainer inputContainer, final IOutputStringContainer outputContainer, final IReader reader, final IWriter writer) throws FormatException;
}
