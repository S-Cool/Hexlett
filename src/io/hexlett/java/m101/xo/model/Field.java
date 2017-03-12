package io.hexlett.java.m101.xo.model;

import io.hexlett.java.m101.xo.exceptions.AlreadyOccupiedException;
import io.hexlett.java.m101.xo.exceptions.InvalidePointException;

import java.awt.*;

public class Field {

    private static final int SIZE_FIELD = 3;
    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = SIZE_FIELD;

    private Figure[][] field = new Figure[SIZE_FIELD][SIZE_FIELD];

    public int getSize() {
        return SIZE_FIELD;
    }

    public Figure getFigure(final Point point)throws InvalidePointException{
        if (!checkPoint(point)){
            throw new InvalidePointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidePointException, AlreadyOccupiedException{
        if (!checkPoint(point)){
            throw new InvalidePointException();
        }
        if (field[point.x][point.y] != null){
            throw new AlreadyOccupiedException();
        }
        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point) {
        return checkCoordinate(point.x) && checkCoordinate(point.y);
    }

    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < MAX_COORDINATE;
    }
}
