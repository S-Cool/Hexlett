package io.hexlett.java.m101.xo.model;

import io.hexlett.java.m101.xo.helpers.CoordinateHelper;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Board {

    private static final int SIZE_FIELD = 3;

    private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public Figure getFigure(final int x, final int y) {
        if (!CoordinateHelper.checkCoordinate(x) || !CoordinateHelper.checkCoordinate(y)) return null;
        return figures[x][y];
    }

//    public boolean setFigure (final int x, final int y, final Figure figure){
//        if (!CoordinateHelper.checkCoordinate(x) || !CoordinateHelper.checkCoordinate(y))
//            return false;
//        if (figures[x][y] != null) return false;
//
//        figures[x][y] = figure;
//        return true;
//
//    }

    public void showBoard() {
        System.out.println(Arrays.deepToString(this.figures));
    }

    public void setFigure(int x, int y, Figure figure) {

    }
}
