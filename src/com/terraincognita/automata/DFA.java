package com.terraincognita.automata;

import java.util.Collection;

public class DFA extends FSA<String>{
    /**
     * Return the start state of the FSA
     */
    @Override
    public String getStartState() {
        return null;
    }

    /**
     * Return the accepting states of the FSA
     */
    @Override
    public Collection<String> getAcceptingStates() {
        return null;
    }

    /**
     * Run the FSA from the start state with a given string
     *
     * @param alphabets a given string to run the FSA
     * @return the reached state(s)
     */
    @Override
    public Object transitions(String alphabets) {
        return null;
    }

    /**
     * Return whether the input string is accepted by the FSA
     *
     * @param alphabets the string to be tested
     * @return whether the input string is accepted by the FSA
     */
    @Override
    public boolean accept(String alphabets) {
        return false;
    }
}
