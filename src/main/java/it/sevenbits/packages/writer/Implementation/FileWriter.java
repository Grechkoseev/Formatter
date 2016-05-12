package it.sevenbits.packages.writer.Implementation;

import it.sevenbits.packages.writer.IWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Write one symbol in outputString
 */
public class FileWriter implements IWriter {

    private FileOutputStream fileOutputStream;

    /**
     * Constructor
     * @throws FileWriterException
     */
    public FileWriter() throws FileWriterException {
        try {
        fileOutputStream = new FileOutputStream("OutputFile");
        } catch(FileNotFoundException ex) {
            throw new FileWriterException("Output file not found", ex);
        }
    }
    /**
     * Write output substring in output file
     * @param outputString
     * @throws FileWriterException
     * @return outputString
     */
    public void write(final String outputString) throws FileWriterException {
        try {
            fileOutputStream.write(outputString.getBytes());
        } catch (IOException ex) {
            throw new FileWriterException("Cannot write in file", ex);
        }
    }

    /**
     * Close output stream
     * @throws FileWriterException
     */
    public void close() throws FileWriterException {
        try {
            fileOutputStream.close();
        } catch (IOException ex) {
            throw new FileWriterException("Can't close output stream", ex);
        }
    }
}
