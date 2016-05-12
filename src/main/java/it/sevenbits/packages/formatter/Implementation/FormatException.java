package it.sevenbits.packages.formatter.Implementation;

/**
 * My own exception class
 */
public class FormatException extends Exception {

    /**
     * @param message "Incoming argument is null"
     * @param e
     */
    FormatException(final String message, final Throwable e) {
        super(message, e);
    }
}
