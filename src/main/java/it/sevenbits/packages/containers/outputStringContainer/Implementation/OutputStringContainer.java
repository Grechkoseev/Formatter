package it.sevenbits.packages.containers.outputStringContainer.Implementation;

import it.sevenbits.packages.containers.outputStringContainer.IOutputStringContainer;

/**
 * Output string container class
 */
public class OutputStringContainer implements IOutputStringContainer {

    private String str;

    /**
     * Constructor
     */
    public OutputStringContainer() {
        
    }

    /**
     * setter
     * @param element is setting element
     */
    public void setElement(final char element) {
        str += element;
    }

    /**
     * getter of final String
     * @return output string
     */
    public String getString() {
        return str;
    }
}
