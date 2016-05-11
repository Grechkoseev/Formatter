package it.sevenbits.packages.reader.Implementation;

import it.sevenbits.packages.reader.IReader;

/**
 * Read of one symbol of string
 */
public class Reader implements IReader {

    /**
     * Reading one symbol
     * @param index of input string
     * @param str input string
     * @return str[index]
     */
    public char readSymbol(final int index, final String str) {
        return str.charAt(index);
    }
}
