package it.sevenbits.packages.tables;

import it.sevenbits.packages.actions.IOperation;
import it.sevenbits.packages.actions.implementation.AddIndent;
import it.sevenbits.packages.actions.implementation.DeleteIndent;
import it.sevenbits.packages.actions.implementation.NewString;
import it.sevenbits.packages.actions.implementation.Write;
import it.sevenbits.packages.formatter.Implementation.IndentCounter;

import java.util.HashMap;
import java.util.Map;

/**
 * Table of outputs
 */
public class TableOfOutputs {

    private Integer[][] table;
    private Map<Integer, IOperation> acts;

    /**
     * Constructor
     * @param indentCounter
     */
    public TableOfOutputs(final IndentCounter indentCounter) {
        Integer[] stateOne = new Integer[] { 1, 2, 3, null, 2};

        Integer[] stateTwo = new Integer[] { 1, 2, 3, 3, 2 };

        Integer[] stateThree = new Integer[] { null, 2, 3, null, 2 };

        Integer[] stateFour = new Integer[] { 3, null, 4, 4, 2 };

        Integer[] stateFive = new Integer[] { 2, 2, 2, 2, 2 };

        table = new Integer[5][];
        table[0] = stateOne;
        table[1] = stateTwo;
        table[2] = stateThree;
        table[3] = stateFour;
        table[4] = stateFive;

        acts = new HashMap<Integer, IOperation>();
        acts.put(1, new AddIndent(' ', 4, indentCounter));
        acts.put(2, new Write());
        acts.put(3, new NewString(' '));
        acts.put(4, new DeleteIndent(' ', 4, indentCounter));

    }

    /**
     * getter of array of tables of states
     * @return array of tables of states
     */
    public Integer[][] getTable() {
        return table;
    }

    /**
     * getter of map of actions
     * @return map of actions
     * @throws TableException
     */
    public Map<Integer, IOperation> getActs() throws TableException {
        return acts;
    }
}
