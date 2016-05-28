package it.sevenbits.packages.tables;

/**
 * describe exceptions in a tables
 */
public class TableException extends Exception {
    /**
     * constructor
     * @param cause the inner exception
     */
    public TableException(final Throwable cause) {
        super(cause);
    }
}
