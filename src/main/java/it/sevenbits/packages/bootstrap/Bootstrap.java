package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.formatter.IFormatter;
import it.sevenbits.packages.formatter.Implementation.FormatException;
import it.sevenbits.packages.formatter.Implementation.Formatter;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.reader.Implementation.FileReader;
import it.sevenbits.packages.reader.Implementation.ReaderException;
import it.sevenbits.packages.reader.Implementation.StringReader;
import it.sevenbits.packages.writer.IWriter;
import it.sevenbits.packages.writer.Implementation.FileWriter;
import it.sevenbits.packages.writer.Implementation.StringWriter;
import it.sevenbits.packages.writer.Implementation.WriterException;

/**
 * Bootstrap class
 */
public final class Bootstrap {

    /**
     * Default constructor
     */
    private Bootstrap() {
    }

    private static String EXAMPLE = "class{int x=5;while(true){println(Hello, world!)}}";

    /**
     * main method
     * @param args just like that
     * @throws FormatException
     * @throws BootstrapException
     */
    public static void main(final String[] args) throws FormatException, BootstrapException {
        IFormatter formatter = new Formatter();
        try {
            IReader reader = new FileReader();
            IWriter writer = new FileWriter();
            formatter.format(reader, writer);
        } catch (ReaderException ex) {
            throw new BootstrapException(ex);
        } catch (WriterException ex) {
            throw new BootstrapException(ex);
        }
        try {
            IReader reader = new StringReader(EXAMPLE);
            IWriter writer = new StringWriter();
            formatter.format(reader, writer);
        } catch (ReaderException ex) {
            throw new BootstrapException(ex);
        } catch (WriterException ex) {
            throw new BootstrapException(ex);
        }
    }
}
