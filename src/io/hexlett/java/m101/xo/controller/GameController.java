package io.hexlett.java.m101.xo.controller;

import io.hexlett.java.m101.xo.model.Board;
import io.hexlett.java.m101.xo.model.Figure;
import io.hexlett.java.m101.xo.model.Player;

public class GameController {

    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = 3;


    private final String gameName;

    private final Board board;

    private final Player[] players;

    public GameController(final String gameName, final Player[] players, final Board board) {
        this.board = board;
        this.players = players;
        if (gameName == null || gameName.isEmpty()) {
            this.gameName = "XO";
        } else {
            this.gameName = gameName;
        }
    }

    public String getGameName() {
        return gameName;
    }

    public Player currentPlayer() {
        return null;
    }

    public Board getBoard() {
        return board;
    }

    public boolean move(final int x, final int y) {

        assert x >= 0;
        assert y >= 0;

        if (!checkCoordinate(x) == false || !checkCoordinate(y) == false) {
            return false;
        }

        return true;

    }

    public Player[] getPlayers() {
        return players;
    }

    private static boolean checkCoordinate(final int coordinate) {
        if (coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) return false;
        return true;
    }

}
