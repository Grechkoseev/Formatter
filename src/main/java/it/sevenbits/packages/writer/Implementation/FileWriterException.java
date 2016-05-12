package it.sevenbits.packages.writer.Implementation;

/**
 * FileWriteException
 */
public class FileWriterException extends Exception {
    /**
     * FileWriterException
     *
     * @param message "File not exist"
     * @param ex
     */
    FileWriterException(final String message, final Throwable ex) {
        super(message, ex);
    }
}
