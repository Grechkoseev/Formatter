package it.sevenbits.packages.states;

import it.sevenbits.packages.actions.IndentCounter;
import it.sevenbits.packages.states.Implementations.StateFour;
import it.sevenbits.packages.states.Implementations.StateOne;
import it.sevenbits.packages.states.Implementations.StateThree;
import it.sevenbits.packages.states.Implementations.StateTwo;

/**
 * Change state
 */
public class ChangeState {

    /**
     * Method that change state
     * @param symbol
     * @param indentCounter
     * @return new state
     */
    public IState changeState(final Character symbol, final IndentCounter indentCounter) {

        switch (symbol) {
            case(';'):
                return new StateTwo(indentCounter);
            case(' '):
                return new StateThree(indentCounter);
            case('/'):
                return new StateFour(indentCounter);
            default:
                return new StateOne(indentCounter);
        }
    }
}
