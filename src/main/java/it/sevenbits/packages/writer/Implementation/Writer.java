package it.sevenbits.packages.writer.Implementation;

import it.sevenbits.packages.writer.IWriter;

/**
 * Write one symbol in outputString
 */
public class Writer implements IWriter {

    /**
     * Write one symbol in outputString
     * @param symbol that should be written
     * @param outputString
     * @return outputString
     */
    public String write(final char symbol, String outputString) {
        outputString += symbol;
        return outputString;
    }
}
