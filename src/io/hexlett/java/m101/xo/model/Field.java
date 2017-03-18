package io.hexlett.java.m101.xo.model;

import io.hexlett.java.m101.xo.exceptions.InvalidePointException;

import java.awt.*;

public class Field {

    private int fieldSize = 3;

    private static final int MIN_COORDINATE = 0;
    private Figure[][] field;

    public Field(final int fieldSize) {
        this.fieldSize = fieldSize;
        field = new Figure[fieldSize][fieldSize];
    }

    public int getSize() {
        return fieldSize;
    }

    public Figure getFigure(final Point point)throws InvalidePointException{
        if (!checkPoint(point)){
            throw new InvalidePointException();
        }
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure) throws InvalidePointException{
        if (!checkPoint(point)){
            throw new InvalidePointException();
        }
        field[point.x][point.y] = figure;
    }

    private boolean checkPoint(final Point point) {
        return checkCoordinate(point.x, field.length) && checkCoordinate(point.y, field[point.x].length);
    }

    private boolean checkCoordinate(final int coordinate, final int maxCoordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < maxCoordinate;
    }
}
