package it.sevenbits.packages.containers.outputStringContainer.Implementation;

import it.sevenbits.packages.containers.outputStringContainer.IOutputStringContainer;

/**
 * Output string container class
 */
public class OutputStringContainer implements IOutputStringContainer {

    private StringBuffer str = new StringBuffer();

    /**
     * Constructor
     */
    public OutputStringContainer() {
    }

    /**
     * setter
     * @param substring is setting string
     */
    public void setSubstring(final StringBuffer substring) {
        str.append(substring);
    }

    /**
     * getter of final String
     * @return output string
     */
    public StringBuffer getString() {
        return str;
    }
}
