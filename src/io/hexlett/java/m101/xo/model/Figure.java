package io.hexlett.java.m101.xo.model;

public class Figure {
    private String figure;

    public Figure(final String figure) {

        assert figure != null;

        this.figure = figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    @Override
    public String toString() {
        return this.figure;
    }
}
