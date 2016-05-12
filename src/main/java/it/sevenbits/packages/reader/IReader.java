package it.sevenbits.packages.reader;

import it.sevenbits.packages.reader.Implementation.FileReaderException;

/**
 * Reader interface
 */
public interface IReader {
    /**
     * read one symbol
     * @return symbol str[index]
     */
    char getElement() throws FileReaderException;

    /**
     * hasNext method
     * @return false if read symbol of end of file
     * @throws FileReaderException
     */
    boolean hasNext() throws FileReaderException;
    /**
     * Close input stream
     * @throws FileReaderException
     */
    void close() throws FileReaderException;
}
