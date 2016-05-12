package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.containers.inputStringContainer.IInputStringContainer;
import it.sevenbits.packages.containers.inputStringContainer.Implementation.InputStringContainer;
import it.sevenbits.packages.containers.outputStringContainer.IOutputStringContainer;
import it.sevenbits.packages.containers.outputStringContainer.Implementation.OutputStringContainer;
import it.sevenbits.packages.formatter.IFormatter;
import it.sevenbits.packages.formatter.Implementation.FormatException;
import it.sevenbits.packages.formatter.Implementation.Formatter;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.reader.Implementation.FileReader;
import it.sevenbits.packages.reader.Implementation.FileReaderException;
import it.sevenbits.packages.writer.IWriter;
import it.sevenbits.packages.writer.Implementation.FileWriter;
import it.sevenbits.packages.writer.Implementation.FileWriterException;

/**
 * Bootstrap class
 */
public final class Bootstrap {

    /**
     * Default constructor
     */
    private Bootstrap() {
    }

    private static String EXAMPLE = "class Jrhrug{int x=5;while(true){println(Hello, world!)}}";

    /**
     * main method
     * @param args just like that
     * @throws FormatException
     * @throws BootstrapException
     */
    public static void main(final String[] args) throws FormatException, BootstrapException {
        IInputStringContainer inputStringContainer = new InputStringContainer(EXAMPLE);
        IFormatter formatter = new Formatter();
        IOutputStringContainer outputStringContainer = new OutputStringContainer();
        try {
            IReader reader = new FileReader();
            IWriter writer = new FileWriter();
            formatter.format(inputStringContainer, outputStringContainer, reader, writer);
            System.out.println(outputStringContainer.getString());
        } catch (FileReaderException ex) {
            throw new BootstrapException(ex);
        } catch (FileWriterException ex) {
            throw new BootstrapException(ex);
        }
    }
}
