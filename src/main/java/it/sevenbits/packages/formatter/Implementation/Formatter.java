package it.sevenbits.packages.formatter.Implementation;

import it.sevenbits.packages.actions.IndentCounter;
import it.sevenbits.packages.formatter.IFormatter;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.reader.Implementation.ReaderException;
import it.sevenbits.packages.states.ChangeState;
import it.sevenbits.packages.states.IState;
import it.sevenbits.packages.states.Implementations.StateOne;
import it.sevenbits.packages.writer.IWriter;
import it.sevenbits.packages.writer.Implementation.WriterException;

/**
 * Class format code
 */
public class Formatter implements IFormatter {

    private IState state;
    private IndentCounter indentCounter;
    private ChangeState changeState;

    /**
     * Constructor
     *
     * @param indentCounter
     * @throws FormatException
     */
    public Formatter(IndentCounter indentCounter) throws FormatException {
        this.indentCounter = indentCounter;
        this.state = new StateOne(indentCounter);
        this.changeState = new ChangeState();
    }

    /**
     * Format method
     * @param reader
     * @param writer
     * @throws FormatException
     */
    public void format(final IReader reader, final IWriter writer) throws FormatException {
        try {
            while (reader.hasNext()) {
                Character symbol = reader.getElement();
                writer.write(state.action(symbol));
                state = changeState.changeState(symbol, indentCounter);
            }
            reader.close();
            writer.printOnConsole();
            writer.close();
        } catch (ReaderException ex) {
            throw new FormatException("Can't read file", ex);
        } catch (WriterException ex) {
            throw new FormatException("Can't write in file", ex);
        } catch (NullPointerException ex) {
            throw new FormatException("Incoming stream is null", ex);
        }
    }
}
