package it.sevenbits.packages.bootstrap;

import it.sevenbits.packages.actions.IndentCounter;
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

    private static String EXAMPLE = "c {i;c(){f;}}";

    /**
     * main method
     * @param args args[0] is full path to input file, args[1] is full path to output file
     * @throws FormatException
     * @throws BootstrapException
     */
    public static void main(final String[] args) throws FormatException, BootstrapException {
        if (args.length == 2) {
            IndentCounter indentCounter = new IndentCounter();
            IFormatter formatter = new Formatter(indentCounter);
            try {
                IReader reader = new FileReader(args[0]);
                IWriter writer = new FileWriter(args[1]);
                formatter.format(reader, writer);
            } catch (ReaderException ex) {
                throw new BootstrapException(ex);
            } catch (WriterException ex) {
                throw new BootstrapException(ex);
            }
        } else {
            IndentCounter indentCounter = new IndentCounter();
            IFormatter formatter = new Formatter(indentCounter);
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
}
