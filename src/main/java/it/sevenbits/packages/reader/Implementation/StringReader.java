package it.sevenbits.packages.reader.Implementation;

import it.sevenbits.packages.reader.IReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * class read input string
 */
public class StringReader implements IReader {

    private InputStream inputStream;

    /**
     * Constructor
     * @param inputString is input string
     * @throws ReaderException
     */
    public StringReader(final String inputString) throws ReaderException {
            inputStream = new ByteArrayInputStream(inputString.getBytes());
    }

    /**
     * method get one element of input string
     * @return getting element
     * @throws ReaderException
     */
    public char getElement() throws ReaderException {
        try {
            return (char) inputStream.read();
        } catch (IOException ex) {
            throw new ReaderException("Can't read next element", ex);
        }
    }

    /**
     * Method check existing of next element
     * @return true if next element exist
     * @throws ReaderException
     */
    public boolean hasNext() throws ReaderException {
        try {
            return inputStream.available() != 0;
        } catch (IOException ex) {
            throw new ReaderException("Can't check existing of next element", ex);
        }
    }

    /**
     * Method close input stream
     * @throws ReaderException
     */
    public void close() throws ReaderException {
        try {
            inputStream.close();
        } catch (IOException ex) {
            throw new ReaderException("Can't close stream", ex);
        }
    }
}
