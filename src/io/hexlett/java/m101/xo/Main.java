package io.hexlett.java.m101.xo;

import io.hexlett.java.m101.xo.View.ConsoleView;
import io.hexlett.java.m101.xo.model.Field;
import io.hexlett.java.m101.xo.model.Figure;
import io.hexlett.java.m101.xo.model.Game;
import io.hexlett.java.m101.xo.model.Player;

public class Main {
    public static void main(String[] args) {
        final String name1 = "Gleb";
        final String name2 = "Slava";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[0] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(3), "XO");

        final ConsoleView consoleView = new ConsoleView();
        consoleView.show(gameXO);
        while (consoleView.move(gameXO)){
        consoleView.show(gameXO);
        }
    }
}
