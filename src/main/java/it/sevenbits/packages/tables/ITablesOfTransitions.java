package it.sevenbits.packages.tables;

import java.util.List;

/**
 * interface to the automatic tables
 */
public interface ITablesOfTransitions {
    /**
     * @return transition table
     * @throws TableException
     */
    List<List<Character>> getTable() throws TableException;

    /**
     * @return the begin state of machine
     * @throws TableException
     */
    List<Character> getBeginState() throws TableException;

    /**
     * @return the final states of automatic
     * @throws TableException
     */
    List<Integer> getFinalState() throws TableException;

    /**
     * @return alphabet of automatic
     * @throws TableException
     */
    List<Character> getAlphabet() throws TableException;
}
