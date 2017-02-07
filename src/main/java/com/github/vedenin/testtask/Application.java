package com.github.vedenin.testtask;

import com.github.vedenin.testtask.containers.GameResult;
import com.github.vedenin.testtask.games.Game;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Main application class
 * This application using dependency injection pattern (Guice)
 *
 * @see ApplicationModule
 * <p>
 * Created by vvedenin on 1/20/2017.
 */
public class Application {
    private static int COUNT_ROUND = 100;

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ApplicationModule());
        Game game = injector.getInstance(Game.class);

        Integer round = COUNT_ROUND;
        GameResult result = game.getGameResult(round);
        if (result.getException() == null) {
            System.out.println(String.format("Player A wins %1d of %2d games", result.getCountWinPlayerA(), round));
            System.out.println(String.format("Player B wins %1d of %2d games", result.getCountWinPlayerB(), round));
            System.out.println(String.format("Tie: %1d of %2d games", result.getCountTie(), round));
        } else {
            System.out.println("Error: " + result.getException().getMessage());
            result.getException().printStackTrace();
        }
    }
}
