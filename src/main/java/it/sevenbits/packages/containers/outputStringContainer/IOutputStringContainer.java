package it.sevenbits.packages.containers.outputStringContainer;

/**
 * Output string container interface
 */
public interface IOutputStringContainer {
    /**
     * setter
     * @param substring is setting string
     */
    void setSubstring(final StringBuffer substring);

    /**
     * getting of final string
     * @return output string
     */
    StringBuffer getString();
}
