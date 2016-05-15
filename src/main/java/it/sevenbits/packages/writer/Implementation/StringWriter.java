package it.sevenbits.packages.writer.Implementation;

import it.sevenbits.packages.writer.IWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


/**
 * Class write substring in output string
 */
public class StringWriter implements IWriter {

    private ByteArrayOutputStream outputStream;

    /**
     * Constructor
     * @throws WriterException
     */
    public StringWriter() throws WriterException {
        outputStream = new ByteArrayOutputStream();
    }

    /**
     * Write output substring in output string
     * @param outputString is substring
     * @throws WriterException
     */
    public void write(final String outputString) throws WriterException {
        try {
            outputStream.write(outputString.getBytes());
        } catch (IOException ex) {
            throw new WriterException("Can't write in string", ex);
        }
    }

    /**
     * method print on console results of working of program
     */
    public void printOnConsole() {
            System.out.println(outputStream.toString());
    }
    /**
     * Close output stream
     * @throws WriterException
     */
    public void close() throws WriterException {
        try {
            outputStream.close();
        } catch (IOException ex) {
            throw new WriterException("Can't close output stream", ex);
        }
    }
}
