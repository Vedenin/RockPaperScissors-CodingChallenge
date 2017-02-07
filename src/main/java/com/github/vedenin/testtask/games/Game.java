package com.github.vedenin.testtask.games;

import com.github.vedenin.testtask.containers.GameResult;

/**
 * Game returns result after roundCount rounds
 *
 * Created by vvedenin on 1/20/2017.
 */
public interface Game {
    /**
     * Return result of games after roundCount rounds
     * <p>
     * roundCount - count of rounds
     *
     * @return Result of games
     */
    GameResult getGameResult(Integer roundCount);
}
