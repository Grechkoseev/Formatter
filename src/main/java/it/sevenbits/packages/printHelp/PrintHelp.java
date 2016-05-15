package it.sevenbits.packages.printHelp;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Class print info on console
 */
public class PrintHelp {

    private FileInputStream fileInputStream;

    /**
     * Constructor
     */
    public PrintHelp() throws PrintHelpException {
        try {
            fileInputStream = new FileInputStream("???");
        } catch (IOException ex) {
            throw new PrintHelpException("File 'help' is not found", ex);
        }
    }

    /**
     * method print info
     */
    public void printHelp() {
        System.out.println(fileInputStream.toString());
    }
}
