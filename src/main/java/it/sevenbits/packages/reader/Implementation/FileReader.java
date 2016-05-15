package it.sevenbits.packages.reader.Implementation;

import it.sevenbits.packages.reader.IReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;

/**
 * Read of one symbol of string
 */
public class FileReader implements IReader {

    private BufferedInputStream fileInputStream;

    /**
     * Constructor
     * @throws ReaderException
     */
    public FileReader() throws ReaderException {
        try {
                fileInputStream = new BufferedInputStream(new FileInputStream("InputFile"));
        } catch (FileNotFoundException ex) {
            throw new ReaderException("File not found", ex);
        }
    }
    /**
     * Read one symbol
     * @return str[index]
     * @throws ReaderException
     */
    public char getElement() throws ReaderException {
        try {
            return (char) fileInputStream.read();
        } catch (IOException ex) {
            throw new ReaderException("File not found", ex);
        }
    }

    /**
     * Method check existing of next element
     * @return true if read not the end of file
     * @throws ReaderException
     */
    public boolean hasNext() throws ReaderException {
        try {
            return fileInputStream.available() != 0;
        } catch (IOException ex) {
            throw new ReaderException("Can't correctly read to the end of file", ex);
        }
    }
    /**
     * Close input stream
     * @throws ReaderException
     */
    public void close() throws ReaderException {
        try {
            fileInputStream.close();
        } catch (IOException ex) {
            throw new ReaderException("Can't close input stream", ex);
        }
    }
}
