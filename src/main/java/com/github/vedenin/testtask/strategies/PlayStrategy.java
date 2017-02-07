package com.github.vedenin.testtask.strategies;

import com.github.vedenin.testtask.containers.PlayDecision;

/**
 * Interface of pattern Strategy
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public interface PlayStrategy {
    /**
     * Returns decision for this round
     *
     * @param round - current round
     * @return ROCK, PAPER  or SCISSORS
     */
    PlayDecision getDecision(Integer round);
}
