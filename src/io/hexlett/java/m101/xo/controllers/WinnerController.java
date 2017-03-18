package io.hexlett.java.m101.xo.controllers;

import io.hexlett.java.m101.xo.exceptions.InvalidePointException;
import io.hexlett.java.m101.xo.model.Field;
import io.hexlett.java.m101.xo.model.Figure;

import java.awt.*;

public class WinnerController {
    public Figure getWinner(final Field field) {
        try {
            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(0, 0), new Point(0, 1), new Point(0, 2)))
                    return field.getFigure(new Point(0, 0));
            }
            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(0, 1), new Point(1, 1), new Point(2, 1)))
                    return field.getFigure(new Point(0, 1));
            }
            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(0, 0), new Point(1, 1), new Point(2, 2)))
                    return field.getFigure(new Point(0, 0));
            }
            for (int i = 0; i < 3; i++) {
                if (check(field, new Point(0, 2), new Point(1, 1), new Point(2, 0)))
                    return field.getFigure(new Point(1, 1));
            }

        } catch (InvalidePointException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean check(final Field field, final Point p1, final Point p2, final Point p3) {
        try {
            if (field.getFigure(p1) == null) return false;
            if (field.getFigure(p1) == field.getFigure(p2) &&
                    field.getFigure(p1) == field.getFigure(p3))
                return true;
        } catch (InvalidePointException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static interface IPointChanger {
        Point next(final Point p);
    }
}
