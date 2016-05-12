package it.sevenbits.packages.containers.inputStringContainer.Implementation;

/**
 * My own exception class
 */
public class InputStringContainerException extends Exception {

    /**
     * @param message "Incoming string is null"
     * @param e
     */
    InputStringContainerException(final String message, final Throwable e) {
        super(message, e);
    }
}
