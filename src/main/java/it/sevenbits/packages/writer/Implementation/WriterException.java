package it.sevenbits.packages.writer.Implementation;

/**
 * FileWriteException
 */
public class WriterException extends Exception {
    /**
     * WriterException
     *
     * @param message
     * @param ex
     */
    WriterException(final String message, final Throwable ex) {
        super(message, ex);
    }
}
