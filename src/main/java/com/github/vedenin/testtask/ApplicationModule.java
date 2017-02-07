package com.github.vedenin.testtask;

import com.github.vedenin.testtask.containers.GameResult;
import com.github.vedenin.testtask.containers.GameResultImpl;
import com.github.vedenin.testtask.games.Game;
import com.github.vedenin.testtask.games.GameImpl;
import com.github.vedenin.testtask.players.Player;
import com.github.vedenin.testtask.players.impl.PlayerA;
import com.github.vedenin.testtask.players.impl.PlayerB;
import com.github.vedenin.testtask.round.Round;
import com.github.vedenin.testtask.round.RoundImpl;
import com.github.vedenin.testtask.rules.rockpaperscissors.RockPaperScissorsRules;
import com.github.vedenin.testtask.rules.Rules;
import com.github.vedenin.testtask.strategies.PlayStrategy;
import com.github.vedenin.testtask.strategies.rockpaperscissors.PaperStrategy;
import com.github.vedenin.testtask.strategies.rockpaperscissors.RandomStrategy;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Module for configuration our application
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public class ApplicationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Game.class).to(GameImpl.class);
        bind(Rules.class).to(RockPaperScissorsRules.class);
        bind(GameResult.class).to(GameResultImpl.class);
        bind(PlayStrategy.class).annotatedWith(Names.named("PaperStrategy")).
                to(PaperStrategy.class);
        bind(PlayStrategy.class).annotatedWith(Names.named("RandomStrategy")).
                to(RandomStrategy.class);
        bind(Player.class).annotatedWith(Names.named("PlayerA")).
                to(PlayerA.class);
        bind(Player.class).annotatedWith(Names.named("PlayerB")).
                to(PlayerB.class);
        bind(Round.class).to(RoundImpl.class);
    }

}
