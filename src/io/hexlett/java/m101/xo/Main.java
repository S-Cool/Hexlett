package io.hexlett.java.m101.xo;


import io.hexlett.java.m101.xo.controller.GameController;


public class Main {
    public static void main(String[] args) {

final GameController gameController = new GameController("XO");
        gameController.move(-2, -2);
    }
}
