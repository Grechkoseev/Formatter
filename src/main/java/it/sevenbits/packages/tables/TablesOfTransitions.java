package it.sevenbits.packages.tables;

/**
 * Tables of transitions
 */
public class TablesOfTransitions {

    private Character[][] arrayOfStates;
    private Character[] initialState;
    private Integer[] finalState;
    private Character[] alphabet;

    /**
     * Constructor
     */
    public TablesOfTransitions() {

        Character[] specElementsOne = new Character[] { '{', 's', null, '}', '\n' };
        
        Character[] specElementsTwo = new Character[] { '{', 's', ';', null, '\n' };
        
        Character[] specElementsThree = new Character[] { '{', 's', null, '}', '\n' };
        
        Character[] specElementsFour = new Character[] { '{', 's', null, '}', '\n' };
        
        Character[] specElementsFive = new Character[] { '{', 's', ';', '}', '\n' };
        
        finalState = new Integer[] { 3, 4 };

        initialState = new Character[] { '{', 's', null, null, '\n'};
        
        arrayOfStates = new Character[5][];
        arrayOfStates[0] = specElementsOne;
        arrayOfStates[1] = specElementsTwo;
        arrayOfStates[2] = specElementsThree;
        arrayOfStates[3] = specElementsFour;
        arrayOfStates[4] = specElementsFive;

        this.alphabet = new Character[] { 's', '{', ';', '}', '\n' };
    }

    /**
     * getter of alphabet
     * @return alphabet
     */
    public Character[] getAlphabet() {
        return alphabet;
    }

    /**
     * getter of array of states
     * @return array of states
     */
    public Character[][] getArrayOfStates() {
        return arrayOfStates;
    }

    /**
     * getter of initial state
     * @return initial state
     */
    public Character[] getInitialState() {
        return initialState;
    }

    /**
     * getter of final state
     * @return final state
     */
    public Integer[] getFinalState() {
        return finalState;
    }
}