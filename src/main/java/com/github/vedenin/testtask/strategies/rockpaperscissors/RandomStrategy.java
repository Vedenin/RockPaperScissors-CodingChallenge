package com.github.vedenin.testtask.strategies.rockpaperscissors;

import com.github.vedenin.testtask.containers.PlayDecision;
import com.github.vedenin.testtask.containers.rockpaperscissors.DecisionEnum;
import com.github.vedenin.testtask.containers.rockpaperscissors.RockPaperScissorsDecision;
import com.github.vedenin.testtask.strategies.PlayStrategy;

import java.util.Random;

/**
 * RandomStrategy always returns random ROCK, PAPER  or SCISSORS
 * using pattern Strategy
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public class RandomStrategy implements PlayStrategy {
    private final Random rn = new Random();

    /**
     * Returns random decision for all round
     *
     * @param round - current round
     * @return ROCK, PAPER  or SCISSORS
     */
    public PlayDecision getDecision(Integer round) {
        return RockPaperScissorsDecision.create(getDecisionEnum());
    }

    private DecisionEnum getDecisionEnum() {
        switch (getRandomValueFromOneToThree()) {
            case 1:
                return DecisionEnum.PAPER;
            case 2:
                return DecisionEnum.ROCK;
            default:
                return DecisionEnum.SCISSORS;
        }
    }


    /**
     * Return random value from 1 to 3
     *
     * @return random value from 1 to 3
     */
    private int getRandomValueFromOneToThree() {
        return rn.nextInt(3) + 1;
    }
}
