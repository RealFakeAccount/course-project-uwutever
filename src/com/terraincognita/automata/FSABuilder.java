package com.terraincognita.automata;

public interface FSABuilder{
    /**
     * Reset the builder
     */
    void reset(String id);

    /**
     * Add a state to the FSA with start/accepting indication
     */
    void addState(boolean isStart, boolean isAccepting);

    /**
     * Add an intermediate state to the FSA
     */
    void addState();

    /**
     * Add a transition to the FSA
     */
    void addTransition(String from, String alphabet, String to);
}
