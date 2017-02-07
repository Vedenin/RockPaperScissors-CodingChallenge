package com.github.vedenin.testtask.strategies.rockpaperscissors;

import com.github.vedenin.testtask.containers.PlayDecision;
import com.github.vedenin.testtask.containers.rockpaperscissors.DecisionEnum;
import com.github.vedenin.testtask.containers.rockpaperscissors.RockPaperScissorsDecision;
import com.github.vedenin.testtask.strategies.PlayStrategy;

/**
 * OneValueStrategy always returns one value ROCK, PAPER  or SCISSORS defined in constructor
 * Using pattern Strategy
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public class OneValueStrategy implements PlayStrategy {
    private final DecisionEnum decision;

    /**
     * Define DecisionEnum for every round
     *
     * @param decision - DecisionEnum
     */
    public OneValueStrategy(DecisionEnum decision) {
        this.decision = decision;
    }

    /**
     * Returns one decision for any round
     *
     * @param round - current round
     * @return ROCK, PAPER  or SCISSORS
     */
    public PlayDecision getDecision(Integer round) {
        return RockPaperScissorsDecision.create(decision);
    }
}
