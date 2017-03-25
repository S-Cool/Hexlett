package io.hexlett.java.m101.xo.controllers;

import io.hexlett.java.m101.xo.exceptions.AlreadyOccupiedException;
import io.hexlett.java.m101.xo.exceptions.InvalidPointException;
import io.hexlett.java.m101.xo.model.Field;
import io.hexlett.java.m101.xo.model.Figure;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Point point,
                            final Field field,
                            final Figure figure) throws InvalidPointException, AlreadyOccupiedException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }
}
