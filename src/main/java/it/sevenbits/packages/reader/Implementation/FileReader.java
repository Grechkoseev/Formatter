package it.sevenbits.packages.reader.Implementation;

import it.sevenbits.packages.reader.IReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Read of one symbol of string
 */
public class FileReader implements IReader {

    private FileInputStream fileInputStream;

    /**
     * Constructor
     * @throws FileReaderException
     */
    public FileReader() throws FileReaderException {
        try {
                fileInputStream = new FileInputStream("InputFile");
        } catch (FileNotFoundException ex) {
            throw new FileReaderException("File not found", ex);
        }
    }
    /**
     * Read one symbol
     * @return str[index]
     */
    public char getElement() throws FileReaderException {
        try {
            return (char) fileInputStream.read();
        } catch (IOException ex) {
            throw new FileReaderException("File not found", ex);
        }
    }

    /**
     * @return true if read not the end of file
     * @throws FileReaderException
     */
    public boolean hasNext() throws FileReaderException {
        try {
            return fileInputStream.available() != 0;
        } catch (IOException ex) {
            throw new FileReaderException("Can't correctly read to the end of file", ex);
        }
    }
    /**
     * hasNext method
     * Close input stream
     * @throws FileReaderException
     */
    public void close() throws FileReaderException {
        try {
            fileInputStream.close();
        } catch (IOException ex) {
            throw new FileReaderException("Can't close input stream", ex);
        }
    }
}
