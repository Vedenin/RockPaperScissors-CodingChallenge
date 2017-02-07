package com.github.vedenin.testtask.games;

import com.github.vedenin.testtask.containers.GameResult;
import com.github.vedenin.testtask.players.Player;
import com.github.vedenin.testtask.round.Round;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Return result of games after roundCount rounds
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public class GameImpl implements Game {
    @Inject
    private Round round;
    @Inject
    @Named("PlayerA")
    private Player playerA;
    @Inject
    @Named("PlayerB")
    private Player playerB;
    @Inject
    private GameResult gameResult;

    /**
     * Return result of games after roundCount rounds or exception
     * <p>
     * roundCount - count of rounds
     *
     * @return Result of games
     */
    public GameResult getGameResult(Integer roundCount) {
        try {
            for (int i = 0; i <= roundCount; i++) {
                gameResult.addRoundResult(round.getWinner(playerA.getDecision(i), playerB.getDecision(i)));
            }
            return gameResult;
        } catch (Exception exp) {
            gameResult.addException(exp);
            return gameResult;
        }
    }
}
