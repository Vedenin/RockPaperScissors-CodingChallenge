package com.github.vedenin.testtask.rules.rockpaperscissors;

import com.github.vedenin.testtask.containers.PlayDecision;
import com.github.vedenin.testtask.containers.rockpaperscissors.DecisionEnum;
import com.github.vedenin.testtask.containers.enums.RoundResult;
import com.github.vedenin.testtask.containers.rockpaperscissors.RockPaperScissorsDecision;
import com.github.vedenin.testtask.rules.Rules;

import java.util.HashMap;
import java.util.Map;

/**
 * Rules found Winner for this round
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public class RockPaperScissorsRules implements Rules {
    /**
     * RockPaperScissorsRules has combinations map: Win combination/ Lost combination
     */
    private final Map<DecisionEnum, DecisionEnum> rules = new HashMap<>();

    {
        rules.put(DecisionEnum.SCISSORS, DecisionEnum.PAPER);
        rules.put(DecisionEnum.PAPER, DecisionEnum.ROCK);
        rules.put(DecisionEnum.ROCK, DecisionEnum.SCISSORS);
    }

    /**
     * Return how win in this Round
     *
     * @param decisionPlayerA - DecisionEnum of PlayerA
     * @param decisionPlayerB - DecisionEnum of PlayerA
     * @return Tie, Win of Player A or Win of Player B
     */
    public RoundResult getWinner(PlayDecision decisionPlayerA, PlayDecision decisionPlayerB) {
        if (decisionPlayerA instanceof RockPaperScissorsDecision && decisionPlayerB instanceof RockPaperScissorsDecision) {
            DecisionEnum decisionPlayerAEnum = ((RockPaperScissorsDecision) decisionPlayerA).getDecisionEnum();
            DecisionEnum decisionPlayerBEnum = ((RockPaperScissorsDecision) decisionPlayerB).getDecisionEnum();
            return getWinner(decisionPlayerAEnum, decisionPlayerBEnum);
        } else {
            throw new IllegalArgumentException("PlayDecision must be RockPaperScissorsDecision type");
        }
    }

    private RoundResult getWinner(DecisionEnum decisionPlayerA, DecisionEnum decisionPlayerB) {
        if (decisionPlayerA == decisionPlayerB) {
            return RoundResult.TIE;
        } else if (rules.get(decisionPlayerA) == decisionPlayerB) {
            return RoundResult.WIN_PLAYER_A;
        } else {
            return RoundResult.WIN_PLAYER_B;
        }
    }
}
