package it.sevenbits.packages.reader;

/**
 * Reader interface
 */
public interface IReader {
    /**
     * read one symbol
     * @param index of current element
     * @param str is input string
     * @return symbol str[index]
     */
    char readSymbol(int index, String str);
}
