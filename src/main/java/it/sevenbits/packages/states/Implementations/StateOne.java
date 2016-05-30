package it.sevenbits.packages.states.Implementations;

import it.sevenbits.packages.actions.IActions;
import it.sevenbits.packages.actions.IndentCounter;
import it.sevenbits.packages.actions.implementation.CloseBrace;
import it.sevenbits.packages.actions.implementation.Nothing;
import it.sevenbits.packages.actions.implementation.OpenBrace;
import it.sevenbits.packages.actions.implementation.NewLine;
import it.sevenbits.packages.states.IState;

import java.util.HashMap;
import java.util.Map;

/**
 * Just write
 */
public class StateOne implements IState {

    private Map<Character, IActions> hashMap;
    private IndentCounter indentCounter;

    /**
     * just write
     */
    public StateOne(final IndentCounter indentCounter) {
        this.indentCounter = indentCounter;
        this.hashMap = new HashMap<Character, IActions>();
        this.hashMap.put('{', new OpenBrace(' ', 4, indentCounter));
        this.hashMap.put(';', new NewLine(' '));
        this.hashMap.put('}', new CloseBrace(' ', 4, indentCounter));
        this.hashMap.put('\n', new Nothing());
    }

    /**
     * write
     * @param currentSymbol
     * @return symbol or its value in map
     */
    public void action(final Character currentSymbol) {
        if (hashMap.containsKey(currentSymbol)) {
            hashMap.get(currentSymbol).perform(currentSymbol, indentCounter.getIndentCounter());
        }
    }
}
