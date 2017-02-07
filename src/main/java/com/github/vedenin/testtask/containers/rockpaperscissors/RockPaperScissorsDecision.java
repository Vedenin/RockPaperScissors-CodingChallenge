package com.github.vedenin.testtask.containers.rockpaperscissors;

import com.github.vedenin.testtask.containers.PlayDecision;

/**
 * Container for DecisionEnum (Decision (Shape hand) for Rock-Scissors-Paper)
 *
 * Created by vvedenin on 1/20/2017.
 */
public class RockPaperScissorsDecision implements PlayDecision {
    private final DecisionEnum decisionEnum;

    private RockPaperScissorsDecision(DecisionEnum decisionEnum) {
        this.decisionEnum = decisionEnum;
    }

    public static RockPaperScissorsDecision create(DecisionEnum decisionEnum) {
        return new RockPaperScissorsDecision(decisionEnum);
    }

    public DecisionEnum getDecisionEnum() {
        return decisionEnum;
    }
}
