package it.sevenbits.packages.writer.Implementation;

import it.sevenbits.packages.writer.IWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Write substring in outputString
 */
public class FileWriter implements IWriter {

    private FileOutputStream fileOutputStream;

    /**
     * Constructor
     * @throws WriterException
     */
    public FileWriter(final String outputFile) throws WriterException {
        try {
        fileOutputStream = new FileOutputStream(outputFile);
        } catch (FileNotFoundException ex) {
            throw new WriterException("Output file not found", ex);
        }
    }
    /**
     * Write output substring in output file
     * @param outputString is substring
     * @throws WriterException
     */
    public void write(final String outputString) throws WriterException {
        try {
            fileOutputStream.write(outputString.getBytes());
        } catch (IOException ex) {
            throw new WriterException("Cannot write in file", ex);
        }
    }

    /**
     * method print on console results of working of program
     */
    public void printOnConsole() {
        System.out.println("Formatted code is in Output file");
    }
    /**
     * Close output stream
     * @throws WriterException
     */
    public void close() throws WriterException {
        try {
            fileOutputStream.close();
        } catch (IOException ex) {
            throw new WriterException("Can't close output stream", ex);
        }
    }
}
