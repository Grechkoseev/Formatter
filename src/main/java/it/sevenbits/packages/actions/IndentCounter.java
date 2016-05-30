package it.sevenbits.packages.actions;

/**
 * Counter of current indent
 */
public class IndentCounter {

    private Integer indentCounter;

    /**
     * Constructor
     */
    public IndentCounter() {
        this.indentCounter = 0;
    }

    /**
     * getter of current indent
     * @return current indent
     */
    public Integer getIndentCounter() {
        return indentCounter;
    }

    /**
     * setter of current indent
     * @param indentCounter
     */
    public void setIndentCounter(Integer indentCounter) {
        this.indentCounter = indentCounter;
    }

}
