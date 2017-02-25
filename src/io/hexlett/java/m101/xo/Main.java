package io.hexlett.java.m101.xo;

import io.hexlett.java.m101.xo.controller.GameController;
import io.hexlett.java.m101.xo.model.Board;
import io.hexlett.java.m101.xo.model.Figure;
import io.hexlett.java.m101.xo.model.Player;
import io.hexlett.java.m101.xo.view.ConsoleView;

public class Main {
    public static void main(String[] args) {

        final Board board = new Board();
        final GameController gameController = new GameController("XO", new Player[]{new Player("Slava", new Figure("O")), new Player("Gleb", new Figure("X"))}, board);
        new ConsoleView(gameController).showPlayers();
    }
}
