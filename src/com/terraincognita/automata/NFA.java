package com.terraincognita.automata;

import java.util.*;

public class NFA extends FSA<String>{
    /**
     * Each state is represented as a String in a format of NFAId + index
     */
    // id of the NFA
    private final String id;

    // FSA attributes
    protected Set<String> states;
    protected String startState;
    protected Set<String> acceptingState;
    protected Map<String, Map<String, Set<String>>> transitionTable;

    public NFA(String id){
        this.id = id;
        this.states = new HashSet<>();
        this.startState = null;
        this.transitionTable = new HashMap<>();
    }

    /**
     * Return the id of this NFA
     */
    public String getId(){
        return this.id;
    }

    /**
     * Return the start state of the FSA
     */
    @Override
    public String getStartState() {
        return this.startState;
    }

    /**
     * Return the accepting states of the FSA
     */
    @Override
    public Set<String> getAcceptingStates() {
        return this.acceptingState;
    }

    /**
     * Run the FSA from the start state with a given string
     *
     * @param alphabets a given string to run the FSA
     * @return the reached state(s)
     */
    //TODO: Implement this method
    @Override
    public List<String> transitions(String alphabets) {
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
        for (String state: transitions(alphabets)){
            if(this.acceptingState.contains(state)){
                return true;
            }
        }
        return false;
    }
}
