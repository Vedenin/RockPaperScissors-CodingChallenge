package com.github.vedenin.testtask;

import com.github.vedenin.testtask.containers.rockpaperscissors.DecisionEnum;
import com.github.vedenin.testtask.containers.rockpaperscissors.RockPaperScissorsDecision;
import com.github.vedenin.testtask.strategies.PlayStrategy;
import com.github.vedenin.testtask.strategies.rockpaperscissors.OneValueStrategy;
import com.github.vedenin.testtask.strategies.rockpaperscissors.PaperStrategy;
import com.github.vedenin.testtask.strategies.rockpaperscissors.RandomStrategy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Test OneValueStrategy, PaperStrategy and RandomStrategy
 *
 * Created by vvedenin on 1/20/2017.
 */
@Test
public class StrategiesTest {

    public void OneValueStrategyTest() {
        PlayStrategy strategy1 = new OneValueStrategy(DecisionEnum.PAPER);
        Assert.assertEquals(((RockPaperScissorsDecision) strategy1.getDecision(0)).getDecisionEnum(), DecisionEnum.PAPER);
        PlayStrategy strategy2 = new OneValueStrategy(DecisionEnum.ROCK);
        Assert.assertEquals(((RockPaperScissorsDecision) strategy2.getDecision(22)).getDecisionEnum(),
                DecisionEnum.ROCK);
        PlayStrategy strategy3 = new OneValueStrategy(DecisionEnum.SCISSORS);
        Assert.assertEquals(((RockPaperScissorsDecision) strategy3.getDecision(99)).getDecisionEnum(),
                DecisionEnum.SCISSORS);
    }

    public void PaperStrategy() {
        PlayStrategy strategy = new PaperStrategy();
        Assert.assertEquals(((RockPaperScissorsDecision) strategy.getDecision(42)).getDecisionEnum(), DecisionEnum.PAPER);
    }

    /**
     *  Check that random strategy really random
     */
    public void RandomStrategy() {
        PlayStrategy strategy = new RandomStrategy();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(3);
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        int N = 1000000;
        for(int i = 0; i < N; i++) {
            DecisionEnum decisionEnum = ((RockPaperScissorsDecision) strategy.getDecision(i)).getDecisionEnum();
            int j = decisionEnum == DecisionEnum.PAPER ? 1 : decisionEnum == DecisionEnum.ROCK ? 2 : 3;
            map.put(j, map.get(j) + 1);
        }
        for(int i = 1; i < 4; i++) {
           Assert.assertTrue(map.get(i) > N * 0.3);
        }
    }

}
