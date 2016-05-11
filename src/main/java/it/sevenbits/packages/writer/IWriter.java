package it.sevenbits.packages.writer;

/**
 * Writer interface
 */
public interface IWriter {
    /**
     * Write one symbol in outputString
     * @param symbol should be written
     * @param outputString
     * @return outputString
     */
    String write(final char symbol, String outputString);
}
