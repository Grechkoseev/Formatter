package it.sevenbits.packages.states.Implementations;

import it.sevenbits.packages.actions.IActions;
import it.sevenbits.packages.actions.IndentCounter;
import it.sevenbits.packages.actions.implementation.CloseBrace;
import it.sevenbits.packages.actions.implementation.NewLine;
import it.sevenbits.packages.actions.implementation.Nothing;
import it.sevenbits.packages.actions.implementation.OpenBrace;
import it.sevenbits.packages.states.IState;

import java.util.HashMap;
import java.util.Map;

/**
 * when current symbol is space
 */
public class StateThree implements IState {

    private Map<Character, IActions> hashMap;
    private IndentCounter indentCounter;

    /**
     * Constructor
     *
     * @param indentCounter
     */
    public StateThree(final IndentCounter indentCounter) {
        this.indentCounter = indentCounter;
        this.hashMap = new HashMap<Character, IActions>();
        hashMap.put(' ', new Nothing());
        hashMap.put('{', new OpenBrace(' ', 4, indentCounter));
        hashMap.put(';', new NewLine(' '));
        hashMap.put('}', new CloseBrace(' ', 4, indentCounter));
        hashMap.put('\n', new Nothing());
    }

    /**
     * write
     * @param currentSymbol
     * @return
     */
    public String action(final Character currentSymbol) {
        if (hashMap.containsKey(currentSymbol)) {
            return hashMap.get(currentSymbol).perform(currentSymbol, indentCounter.getIndentCounter());
        }
        return currentSymbol.toString();
    }
}
