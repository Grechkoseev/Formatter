package it.sevenbits.packages.reader.Implementation;

/**
 * FileReaderException class
 */
public class FileReaderException extends Exception {
    /**
     * FileReaderException
     * @param message "File not found"
     * @param ex
     */
    FileReaderException(final String message, final Throwable ex) {
        super(message, ex);
    }
}
