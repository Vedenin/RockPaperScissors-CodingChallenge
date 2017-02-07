package com.github.vedenin.testtask.players;

import com.github.vedenin.testtask.containers.PlayDecision;

/**
 * Player returns decision for every round for player according his strategy
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public interface Player {
    /**
     * Returns decision for this round
     *
     * @param round - curent round
     * @return ROCK, PAPER  or SCISSORS
     */
    PlayDecision getDecision(Integer round);
}
