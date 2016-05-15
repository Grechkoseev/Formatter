package it.sevenbits.packages.formatter;

import it.sevenbits.packages.formatter.Implementation.FormatException;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.writer.IWriter;

/**
 * Interface for formatter class
 */
public interface IFormatter {
    /**
     * Formatter
     * @param reader
     * @param writer
     * @throws FormatException
     */
    void format(final IReader reader, final IWriter writer) throws FormatException;
}
