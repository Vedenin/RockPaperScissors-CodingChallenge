package com.github.vedenin.testtask.round;

import com.github.vedenin.testtask.containers.PlayDecision;
import com.github.vedenin.testtask.containers.rockpaperscissors.DecisionEnum;
import com.github.vedenin.testtask.containers.enums.RoundResult;

/**
 * Return winner for this round
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public interface Round {
    /**
     * Return how win in this Round
     *
     * @param decisionPlayerA - DecisionEnum of PlayerA
     * @param decisionPlayerB - DecisionEnum of PlayerA
     * @return Tie, Win of Player A or Win of Player B
     */
    RoundResult getWinner(PlayDecision decisionPlayerA, PlayDecision decisionPlayerB);
}
