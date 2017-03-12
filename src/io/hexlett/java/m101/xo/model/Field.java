package io.hexlett.java.m101.xo.model;

import java.awt.*;
import java.util.Arrays;

public class Field {

    private static final int SIZE_FIELD = 3;

    private Figure[][] field = new Figure[SIZE_FIELD][SIZE_FIELD];

    public Figure getFigure(final Point point) {
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) {
        field[point.x][point.y] = figure;
    }

    public int getSize() {
        return SIZE_FIELD;
    }
}
