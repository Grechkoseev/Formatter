package it.sevenbits.packages.formatter.Implementation;

import it.sevenbits.packages.actions.IOperation;
import it.sevenbits.packages.formatter.IFormatter;
import it.sevenbits.packages.reader.IReader;
import it.sevenbits.packages.reader.Implementation.ReaderException;
import it.sevenbits.packages.tables.TableException;
import it.sevenbits.packages.tables.TableOfOutputs;
import it.sevenbits.packages.tables.TablesOfTransitions;
import it.sevenbits.packages.writer.IWriter;
import it.sevenbits.packages.writer.Implementation.WriterException;

import java.util.Map;

/**
 * Class format code
 */
public class Formatter implements IFormatter {
    private Integer[][] outputTable;
    private Character[][] arrayOfStates;
    private Character[] state;
    private Character[] alphabet;
    private Map<Integer, IOperation> actions;
    private int current;
    private int next;
    private IndentCounter indentCounter;

    /**
     * Constructor
     * @param transitionTable
     * @param outputTable
     * @param indentCounter
     * @throws FormatException
     */
    public Formatter(final TablesOfTransitions transitionTable, final TableOfOutputs outputTable, IndentCounter indentCounter) throws FormatException {
        try {
            this.outputTable = outputTable.getTable();
            this.actions = outputTable.getActs();
            this.arrayOfStates = transitionTable.getArrayOfStates();
            this.state = transitionTable.getInitialState();
            this.alphabet = transitionTable.getAlphabet();
            current = 1;
            this.indentCounter = indentCounter;
        } catch (TableException e) {
            throw new FormatException("Error", e);
        }
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
                char symbol = reader.getElement();
                char clearSymbol = checkSymbol(symbol);
                next = indexOf(clearSymbol, state);
                state = arrayOfStates[next];
                output(current, next, symbol, writer);
                current = next;
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

    /**
     * write substring that comply with current element
     * @param currentState
     * @param toState
     * @param element
     * @param writer
     * @throws WriterException
     * @throws FormatException
     */
    private void output(final int currentState, final int toState, final char element, final IWriter writer) throws WriterException, FormatException {
        Integer[] col = outputTable[toState];
        int act = col[currentState];
            writer.write(actions.get(act).perform(element, indentCounter.getIndentCounter()));
    }

    /**
     * @param symbol
     * @return special symbol of alphabet or 's' if it is just another symbol
     */
    private char checkSymbol(final char symbol) {
            return alphabet[indexOf(symbol, alphabet)];
    }

    /**
     * search index of element in array
     * @param element
     * @param array
     * @return index of element
     */
    private int indexOf(final Character element, final Character[] array) {
        for (int i = 0; i < array.length; i++) {
            if (element.equals(array[i])) {
                return i;
            }
        }
        return 0;
    }
}
