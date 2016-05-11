package it.sevenbits.packages.containers.inputStringContainer;

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
     */
    int getLength();
}
