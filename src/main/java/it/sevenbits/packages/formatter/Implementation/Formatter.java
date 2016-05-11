package it.sevenbits.packages.formatter.Implementation;

import it.sevenbits.packages.containers.inputStringContainer.IInputStringContainer;
import it.sevenbits.packages.containers.outputStringContainer.IOutputStringContainer;
import it.sevenbits.packages.formatter.IFormatter;

/**
 * Class format code
 */
public class Formatter implements IFormatter {
    /**
     * format method
     */
    public void format(final IInputStringContainer inputContainer, final IOutputStringContainer outputContainer) {
    int length = inputContainer.getLength();
        for (int i = 0; i < length; i++) {
        outputContainer.setElement(inputContainer.getElement(i));
        }
        System.out.println(outputContainer.getString());
    }
}
