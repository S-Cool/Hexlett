package io.hexlett.java.m101.xo.controller;

import io.hexlett.java.m101.xo.model.Player;

public class Game {
    private static final String GAME_NAME = "XO";

    private Player[] players;

    public String getGameName() {
        return GAME_NAME;
    }

    public Player currentPlayer() {
        return null;
    }

    public boolean move(final int x, final int y) {
        return true;
    }

    public Player[] getPlayers() {
        return players;
    }
}
