package it.sevenbits.packages.states;

/**
 * Interface of states
 */
public interface IState {
    /**
     * Action
     * @param currentSymbol
     * @return string that match current symbol
     */
    String action(final Character currentSymbol);
}
