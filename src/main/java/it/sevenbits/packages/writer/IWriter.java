package it.sevenbits.packages.writer;

import it.sevenbits.packages.writer.Implementation.FileWriterException;

/**
 * Writer interface
 */
public interface IWriter {
    /**
     * Write one symbol in outputString
     * @param outputString
     * @throws FileWriterException
     * @return outputString
     */
    void write(final String outputString) throws FileWriterException;

    /**
     * Close output stream
     * @throws FileWriterException
     */
    void close() throws FileWriterException;
}
