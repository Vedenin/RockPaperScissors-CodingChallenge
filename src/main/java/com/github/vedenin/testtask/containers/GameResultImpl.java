package com.github.vedenin.testtask.containers;

import com.github.vedenin.testtask.containers.enums.RoundResult;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Store result of all game (thread-safe)
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public class GameResultImpl implements GameResult {
    private AtomicInteger countWinPlayerA = new AtomicInteger(0);
    private AtomicInteger countWinPlayerB = new AtomicInteger(0);
    private AtomicInteger countTie = new AtomicInteger(0);
    private Exception exception;

    public void addRoundResult(RoundResult roundResult) {
        if (roundResult == RoundResult.TIE) {
            countTie.incrementAndGet();
        } else if (roundResult == RoundResult.WIN_PLAYER_A) {
            countWinPlayerA.incrementAndGet();
        } else {
            countWinPlayerB.incrementAndGet();
        }
    }

    public void addException(Exception exception) {
        this.exception = exception;
    }

    public Integer getCountWinPlayerA() {
        return countWinPlayerA.get();
    }

    public Integer getCountWinPlayerB() {
        return countWinPlayerB.get();
    }

    public Integer getCountTie() {
        return countTie.get();
    }

    public Exception getException() {
        return exception;
    }
}
