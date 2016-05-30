package it.sevenbits.packages.states.Implementations;

import it.sevenbits.packages.actions.IActions;
import it.sevenbits.packages.actions.IndentCounter;
import it.sevenbits.packages.actions.implementation.CloseBraceWithoutLineBreak;
import it.sevenbits.packages.actions.implementation.Nothing;
import it.sevenbits.packages.states.IState;

import java.util.HashMap;
import java.util.Map;

/**
 * when current symbol is semicolon
 */
public class StateTwo implements IState {

    private Map<Character, IActions> hashMap;
    private IndentCounter indentCounter;

    /**
     * Constructor
     * @param indentCounter
     */
    public StateTwo(final IndentCounter indentCounter) {
        this.indentCounter = indentCounter;
        this.hashMap = new HashMap<Character, IActions>();
        hashMap.put('\n', new Nothing());
        hashMap.put('}', new CloseBraceWithoutLineBreak(' ', 4, indentCounter));
    }

    /**
     * write
     * @param currentSymbol
     * @return symbol or do action
     */
    public String action(final Character currentSymbol) {
        if (hashMap.containsKey(currentSymbol)) {
            return hashMap.get(currentSymbol).perform(currentSymbol, indentCounter.getIndentCounter());
        }
        return "    " + currentSymbol.toString();
    }
}
