package com.github.vedenin.testtask.containers;

import com.github.vedenin.testtask.containers.enums.RoundResult;

/**
 * GameResult save and return result of game or exception
 *
 * Created by vvedenin on 1/20/2017.
 */
public interface GameResult {
    void addRoundResult(RoundResult roundResult);

    void addException(Exception exception);

    Integer getCountWinPlayerA();

    Integer getCountWinPlayerB();

    Integer getCountTie();

    Exception getException();

}
