package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.containers.inputStringContainer.IInputStringContainer;
import it.sevenbits.packages.containers.inputStringContainer.Implementation.InputStringContainer;
import it.sevenbits.packages.containers.outputStringContainer.IOutputStringContainer;
import it.sevenbits.packages.containers.outputStringContainer.Implementation.OutputStringContainer;
import it.sevenbits.packages.formatter.IFormatter;
import it.sevenbits.packages.formatter.Implementation.Formatter;

/**
 * Bootstrap class
 */
public final class Bootstrap {

    /**
     * Default constructor
     */
    private Bootstrap() {
    }

    private static String EXAMPLE = "{gheriu{  g; {weogjw";

    /**
     * main method
     * @param args just like that
     */
    public static void main(final String[] args) {
        IInputStringContainer inputStringContainer = new InputStringContainer(EXAMPLE);
        IFormatter formatter = new Formatter();
        IOutputStringContainer outputStringContainer = new OutputStringContainer();
        formatter.format(inputStringContainer, outputStringContainer);
    }
}
