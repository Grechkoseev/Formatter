package it.sevenbits.packages.reader.Implementation;

/**
 * ReaderException class
 */
public class ReaderException extends Exception {
    /**
     * FileReaderException
     * @param message "File not found"
     * @param ex
     */
    ReaderException(final String message, final Throwable ex) {
        super(message, ex);
    }
}
