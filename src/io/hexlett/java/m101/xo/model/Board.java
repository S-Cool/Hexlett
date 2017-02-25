package io.hexlett.java.m101.xo.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Board {
private static final int SIZE_FIELD = 3;
 private Figure[][] figures = new Figure[SIZE_FIELD][SIZE_FIELD];

    public Figure getFigure(final int x, final int y){
return figures[x][y];
    }

    public void showBoard(){
        System.out.println(Arrays.deepToString(this.figures));
    }
}
