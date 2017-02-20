package io.hexlett.java.m101.xo;

import io.hexlett.java.m101.xo.controller.Game;
import io.hexlett.java.m101.xo.view.AdvConsoleView;
import io.hexlett.java.m101.xo.view.ConsoleView;

public class Main {
    public static void main(String[] args) {

        final Game game = new Game();
        final AdvConsoleView advConsoleView = new AdvConsoleView(game);
        final ConsoleView consoleView = new ConsoleView(game);
        startGame(advConsoleView);
    }
    private static void startGame(final ConsoleView advConsoleView){
        advConsoleView.showGameName();
    }
}
