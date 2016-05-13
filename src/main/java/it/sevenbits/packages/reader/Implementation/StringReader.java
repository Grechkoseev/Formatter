package it.sevenbits.packages.reader.Implementation;

import it.sevenbits.packages.reader.IReader;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * Read elements of string
 */
public class StringReader implements IReader {

    private BufferedInputStream bufferedInputStream;
    private InputStream inputStream;

    /**
     * Constructor
     */
    public StringReader() {
        bufferedInputStream = new BufferedInputStream(inputStream);
    }
    /**
     * getting one symbol from string
     * @return element
     * @throws ReaderException
     */
    public char getElement() throws ReaderException {
        try {
            return (char) bufferedInputStream.read();
        } catch (IOException ex) {
            throw new ReaderException("Can't found string", ex);
        }
    }

    /**
     * method check existing next element
     * @return
     */
    public boolean hasNext() throws ReaderException {
        try {
            return bufferedInputStream.available() != 0;
        } catch (IOException ex) {
            throw new ReaderException("Can't correctly read to the end of string", ex);
        }
    }

    /**
     * method close stream if all elements are reading
     */
    public void close() throws ReaderException {
        try {
            bufferedInputStream.close();
        } catch (IOException ex) {
            throw new ReaderException("Can't close input stream", ex);
        }
    }
}
