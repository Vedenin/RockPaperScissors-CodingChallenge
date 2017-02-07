package com.github.vedenin.testtask.strategies.rockpaperscissors;

import com.github.vedenin.testtask.containers.rockpaperscissors.DecisionEnum;

/**
 * PaperStrategy always return Paper for any round
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public class PaperStrategy extends OneValueStrategy {
    public PaperStrategy() {
        super(DecisionEnum.PAPER);
    }
}
