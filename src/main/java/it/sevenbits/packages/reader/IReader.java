package it.sevenbits.packages.reader;

import it.sevenbits.packages.reader.Implementation.ReaderException;

/**
 * Reader interface
 */
public interface IReader {

    /**
     * read one symbol
     * @return symbol str[index]
     */
    char getElement() throws ReaderException;

    /**
     * hasNext method
     * @return false if read symbol of end of file
     * @throws ReaderException
     */
    boolean hasNext() throws ReaderException;

    /**
     * Close input stream
     * @throws ReaderException
     */
    void close() throws ReaderException;
}
