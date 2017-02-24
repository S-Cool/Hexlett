package io.hexlett.java.m101.xo.view;


import io.hexlett.java.m101.xo.controller.GameController;

public class ConsoleView {
    protected final GameController game;

    public ConsoleView(GameController game) {
        this.game = game;
    }
    public void showGameName(){
        System.out.println(game.getGameName());}

//    public void showPlayerName(){
//        System.out.println(game.getPlayers());}
}
