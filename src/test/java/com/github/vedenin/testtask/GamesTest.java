package com.github.vedenin.testtask;

import com.github.vedenin.testtask.containers.GameResult;
import com.github.vedenin.testtask.containers.PlayDecision;
import com.github.vedenin.testtask.containers.enums.RoundResult;
import com.github.vedenin.testtask.containers.rockpaperscissors.DecisionEnum;
import com.github.vedenin.testtask.containers.rockpaperscissors.RockPaperScissorsDecision;
import com.github.vedenin.testtask.games.Game;
import com.github.vedenin.testtask.rules.Rules;
import com.github.vedenin.testtask.rules.rockpaperscissors.RockPaperScissorsRules;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test RockPaperScissorsRules
 *
 * Created by vvedenin on 1/20/2017.
 */
@Test
public class GamesTest {
    public void HundredRoundsTest() {
        Injector injector = Guice.createInjector(new ApplicationModule());
        Game game = injector.getInstance(Game.class);

        Integer round = 100;
        GameResult result = game.getGameResult(round);
        Assert.assertNull(result.getException());
        Assert.assertTrue(result.getCountWinPlayerA() > 15);
        Assert.assertTrue(result.getCountWinPlayerB() > 15);
        Assert.assertTrue(result.getCountTie() > 15);
        Assert.assertTrue(result.getCountWinPlayerA() < 100);
        Assert.assertTrue(result.getCountWinPlayerB() < 100);
        Assert.assertTrue(result.getCountTie() < 100);
    }

    public void TenThousandRoundsTest() {
        Injector injector = Guice.createInjector(new ApplicationModule());
        Game game = injector.getInstance(Game.class);

        Integer round = 10000;
        GameResult result = game.getGameResult(round);
        Assert.assertNull(result.getException());
        Assert.assertTrue(result.getCountWinPlayerA() > 2500);
        Assert.assertTrue(result.getCountWinPlayerB() > 2500);
        Assert.assertTrue(result.getCountTie() > 2500);
        Assert.assertTrue(result.getCountWinPlayerA() < 10000);
        Assert.assertTrue(result.getCountWinPlayerB() < 10000);
        Assert.assertTrue(result.getCountTie() < 10000);
    }
}
