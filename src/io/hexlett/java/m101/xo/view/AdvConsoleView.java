package io.hexlett.java.m101.xo.view;


import io.hexlett.java.m101.xo.controllers.GameController;

public class AdvConsoleView extends ConsoleView {

    public AdvConsoleView(final GameController gameController) {
        super(gameController);
    }

    @Override
    public void showGameName() {
        showLine(3);
        System.out.println(gameController.getGameName());
    }
}
