package it.sevenbits.packages.containers.inputStringContainer.Implementation;

import it.sevenbits.packages.containers.inputStringContainer.IInputStringContainer;

/**
 * InputStringContainer
 */
public class InputStringContainer implements IInputStringContainer {

    private String str;
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
    str = inputStr;
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
     */
    public int getLength() {
        return str.length();
    }
}
