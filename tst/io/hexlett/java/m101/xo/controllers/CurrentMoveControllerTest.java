package io.hexlett.java.m101.xo.controllers;

import io.hexlett.java.m101.xo.model.Field;
import io.hexlett.java.m101.xo.model.Figure;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CurrentMoveControllerTest {

    @Test
    public void testCurrentMoveWhenNextMoveIsO() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 0), Figure.X);
            field.setFigure(new Point(i, 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.X, currentMoveController.currentMove(field));
        }
    }

    @Test
    public void testCurrentMoveWhenNextMoveIsX() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(i, 1), Figure.O);
            field.setFigure(new Point(i, 2), Figure.X);
            assertEquals(Figure.X, currentMoveController.currentMove(field));
        }
    }

    @Test
    public void testCurrentMoveWhenNoNextMove() throws Exception {
        final CurrentMoveController currentMoveController = new CurrentMoveController();
        for (int i = 0; i < 3; i++) {
            final Field field = new Field(3);
            field.setFigure(new Point(0, 0), Figure.O);
            field.setFigure(new Point(0, 1), Figure.X);
            field.setFigure(new Point(0, 2), Figure.O);
            field.setFigure(new Point(1, 0), Figure.O);
            field.setFigure(new Point(1, 1), Figure.X);
            field.setFigure(new Point(1, 2), Figure.O);
            field.setFigure(new Point(2, 0), Figure.O);
            field.setFigure(new Point(2, 1), Figure.X);
            field.setFigure(new Point(2, 2), Figure.O);
            assertNull(currentMoveController.currentMove(field));
        }
    }
}