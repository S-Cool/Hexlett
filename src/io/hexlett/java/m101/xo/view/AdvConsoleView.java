package io.hexlett.java.m101.xo.view;

import io.hexlett.java.m101.xo.controller.Game;

public class AdvConsoleView extends ConsoleView {

    public AdvConsoleView(final Game game) {
        super(game);
    }

    @Override
    public void showGameName() {
        System.out.println("***");
        System.out.println(game.getGameName());
    }
}
