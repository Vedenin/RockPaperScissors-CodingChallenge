package com.github.vedenin.testtask.players.impl;

import com.github.vedenin.testtask.containers.PlayDecision;
import com.github.vedenin.testtask.containers.rockpaperscissors.DecisionEnum;
import com.github.vedenin.testtask.containers.rockpaperscissors.RockPaperScissorsDecision;
import com.github.vedenin.testtask.players.Player;
import com.github.vedenin.testtask.strategies.PlayStrategy;
import com.github.vedenin.testtask.strategies.rockpaperscissors.RandomStrategy;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Player returns decision for every round for player according his strategy
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public class PlayerB implements Player {
    @Inject
    @Named("RandomStrategy")
    private PlayStrategy strategy;

    /**
     * Returns decision for this round
     *
     * @param round - current round
     * @return ROCK, PAPER  or SCISSORS
     */
    public PlayDecision getDecision(Integer round) {
        return strategy.getDecision(round);
    }
}
