package io.hexlett.java.m101.xo;

import io.hexlett.java.m101.xo.view.MenuView;

public class Main {
    public static void main(String[] args) {

//        final Board board = new Board();
//        final GameController gameController = new GameController("XO", new Player[]{new Player("Slava", new Figure("O")), new Player("Gleb", new Figure("X"))}, board);
//        new ConsoleView(gameController).showPlayers();

        MenuView menu = new MenuView();
        menu.showMenuWithResult();
    }
}
