package it.sevenbits.packages.containers.inputStringContainer;

import it.sevenbits.packages.containers.inputStringContainer.Implementation.InputStringContainerException;
/**
 * Interface of container
 */
public interface IInputStringContainer {
    /**
     * getter
     * @param index of getting element
     * @return str[index]
     */
    char getElement(final int index);

    /**
     * getting of input string length
     * @return length
     * @throws InputStringContainerException
     */
    int getLength() throws InputStringContainerException;
}
