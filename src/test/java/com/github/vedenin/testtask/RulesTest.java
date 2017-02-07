package com.github.vedenin.testtask;

import com.github.vedenin.testtask.containers.PlayDecision;
import com.github.vedenin.testtask.containers.enums.RoundResult;
import com.github.vedenin.testtask.containers.rockpaperscissors.DecisionEnum;
import com.github.vedenin.testtask.containers.rockpaperscissors.RockPaperScissorsDecision;
import com.github.vedenin.testtask.rules.Rules;
import com.github.vedenin.testtask.rules.rockpaperscissors.RockPaperScissorsRules;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test RockPaperScissorsRules
 *
 * Created by vvedenin on 1/20/2017.
 */
@Test
public class RulesTest {
    public void RockPaperScissorsRulesTest() {
        PlayDecision rock = RockPaperScissorsDecision.create(DecisionEnum.ROCK);
        PlayDecision paper = RockPaperScissorsDecision.create(DecisionEnum.PAPER);
        PlayDecision scissors = RockPaperScissorsDecision.create(DecisionEnum.SCISSORS);
        Rules rules = new RockPaperScissorsRules();
        Assert.assertEquals(rules.getWinner(rock, rock), RoundResult.TIE);
        Assert.assertEquals(rules.getWinner(paper, paper), RoundResult.TIE);
        Assert.assertEquals(rules.getWinner(scissors, scissors), RoundResult.TIE);

        Assert.assertEquals(rules.getWinner(rock, scissors), RoundResult.WIN_PLAYER_A);
        Assert.assertEquals(rules.getWinner(rock, paper), RoundResult.WIN_PLAYER_B);

        Assert.assertEquals(rules.getWinner(paper, rock), RoundResult.WIN_PLAYER_A);
        Assert.assertEquals(rules.getWinner(paper, scissors), RoundResult.WIN_PLAYER_B);

        Assert.assertEquals(rules.getWinner(scissors, paper), RoundResult.WIN_PLAYER_A);
        Assert.assertEquals(rules.getWinner(scissors, rock), RoundResult.WIN_PLAYER_B);
    }
}
