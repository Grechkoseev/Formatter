package it.sevenbits.packages.writer;

import it.sevenbits.packages.writer.Implementation.WriterException;

/**
 * Writer interface
 */
public interface IWriter {
    /**
     * Write one symbol in outputString
     * @param outputString
     * @throws WriterException
     */
    void write(final String outputString) throws WriterException;

    /**
     * method print results of working of program on console
     */
    void printOnConsole();

    /**
     * Close output stream
     * @throws WriterException
     */
    void close() throws WriterException;
}
