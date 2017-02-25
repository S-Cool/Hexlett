package io.hexlett.java.m101.xo.model;

public class Player {
    private final String name;
    private final Figure figure;

    public Player(final String name, Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {

        return name;
    }

//    public String getFigure() {
//        return figure;
//    }
}
