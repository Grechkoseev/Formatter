package it.sevenbits.packages.tables;

import it.sevenbits.packages.actions.IOperation;

import java.util.List;
import java.util.Map;

    /**
     * an interface to the machine output table
     */
    public interface ITableOfOutputs {
        /**
         * @return output table
         * @throws TableException if is error
         */
        List<List<Integer>> getTable() throws TableException;

        /**
         * @return table of acts
         * @throws TableException if is error
         */
        Map<Integer, IOperation> getActs() throws TableException;

    }
