package it.sevenbits.packages.containers.inputStringContainer.Implementation;

import it.sevenbits.packages.containers.inputStringContainer.IInputStringContainer;

/**
 * InputStringContainer
 */
public class InputStringContainer implements IInputStringContainer {

    private StringBuffer str = new StringBuffer();
    /**
     * Default constructor
     */
    InputStringContainer() {
    }

    /**
     * Constructor
     * @param inputStr input String
     */
    public InputStringContainer(final String inputStr) {
    str.append(inputStr);
    }

    /**
     * Get element of input string
     * @param index of getting element
     * @return str[index]
     */
    public char getElement(final int index) {
        return str.charAt(index);
    }

    /**
     * getting length of input string
     * @return length
     * @throws InputStringContainerException
     */
    public int getLength() throws InputStringContainerException {
        try {
            return str.length();
        } catch (NullPointerException ex) {
            throw new InputStringContainerException("Incoming string is null", ex);
        }
    }
}
