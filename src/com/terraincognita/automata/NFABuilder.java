package com.terraincognita.automata;

import java.util.*;

public class NFABuilder implements FSABuilder{
    private NFA nfa;

    /**
     * Input an NFA to the builder
     */
    public void setNFA(NFA nfa){
        this.nfa = nfa;
    }

    /**
     * Return the NFA in the builder
     */
    public NFA getResult(){
        return this.nfa;
    }

    /**
     * Reset the builder
     */
    @Override
    public void reset(String id) {
        this.nfa = new NFA(id);
    }

    /**
     * Add a state to the FSA with start/accepting indication
     *
     * @param isStart whether the state is a start state
     * @param isAccepting weather the state is an accepting state
     */
    @Override
    public void addState(boolean isStart, boolean isAccepting) {
        String newState = this.nfa.getId() + this.nfa.states.size();
        this.nfa.states.add(newState);

        if(isStart){
            this.nfa.startState = newState;
        }

        if(isAccepting){
            this.nfa.acceptingState.add(newState);
        }
    }

    /**
     * Add an intermediate state to the FSA
     */
    @Override
    public void addState() {
        String newState = this.nfa.getId() + this.nfa.states.size();
        this.nfa.states.add(newState);
    }

    /**
     * Add a transition to the FSA
     *
     * @param fromState the state where the transition starts
     * @param alphabet the alphabet for the transition
     * @param toState the state where the transition ends
     */
    //TODO throw exception if fromState or toState is not in nfa.state
    @Override
    public void addTransition(String fromState, String alphabet, String toState) {
        Map<String, Set<String>> transition = this.nfa.transitionTable.get(fromState);

        if(transition.containsKey(alphabet)){
            transition.get(alphabet).add(toState);
        } else{
            Set<String> newToSet = new HashSet<>();
            newToSet.add(toState);
            transition.put(alphabet, newToSet);
        }
    }
}
