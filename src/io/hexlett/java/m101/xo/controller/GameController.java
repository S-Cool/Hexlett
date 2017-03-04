package io.hexlett.java.m101.xo.controller;

import io.hexlett.java.m101.xo.model.Board;
import io.hexlett.java.m101.xo.model.Figure;
import io.hexlett.java.m101.xo.model.Player;

import java.util.stream.IntStream;

public class GameController {

    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = 3;


    private final String gameName;

    private final Board board;

    private final Player[] players;

    public GameController(final String gameName, final Player[] players, final Board board) {
        this.board = board;
        this.players = players;
        if (gameName == null || gameName.isEmpty()) {
            this.gameName = "XO";
        } else {
            this.gameName = gameName;
        }
    }

//    public Player currentPlayer() {
//        //BEGIN
//        final<String, Integer>countCalculator=(figure) =>IntStream.range(0, 3).map(row = >
//                (int) IntStream.range(0, 3).filter(column ->
//                                board.getFigure(row, column) != null &&
//                                        board.getFigure(row, column).getFigure().equals(figure)
//                ).count()
//        ).sum();
//        final int countX = countCalculator.apply("X");
//        final int count0 = countCalculator.apply("0");
//        final boolean xMove = countX == count0;
//        if (players[0].getFigure().getFigure().equals("X")) {
//            if (xMove)
//                return players[0];
//            else
//                return players[1];
//        } else {
//            if (xMove)
//                return players[1];
//            else
//                return players[0];
//        }
//        //END
//    }

//    public Player winner() {
//        //BEGIN
//        for (int i = 0; i < 3; i++) {
//            if (board.getFigure(i, 0) == board.getFigure(1, i) &&
//                    board.getFigure(i, 0) == board.getFigure(1, 2)) {
//                if (players[0].getFigure() == board.getFigure(i, 0)) return players[0];
//                return players[1];
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            if (board.getFigure(0, 1) == board.getFigure(1, i) &&
//                    board.getFigure(0, i) == board.getFigure(2, 1)) {
//                if (players[0].getFigure() == board.getFigure(0, i)) return players[0];
//                return players[1];
//            }
//        }
//
//            if (board.getFigure(0, 0) == board.getFigure(1, 1) &&
//                    board.getFigure(0, 0) == board.getFigure(2, 2)) {
//                if (players[0].getFigure() == board.getFigure(1, 1)) return players[0];
//                return players[1];
//
//        }
//            if (board.getFigure(0, 2) == board.getFigure(1, 1) &&
//                    board.getFigure(0, 2) == board.getFigure(2, 0)) {
//                if (players[0].getFigure() == board.getFigure(1, 1)) return players[0];
//                return players[1];
//
//        }
//        return null;
//        //END
//    }


    public Board getBoard() {
        return board;
    }


    public String getGameName() {
        return gameName;
    }

    public boolean move(final int x, final int y) {

        assert x >= 0;
        assert y >= 0;

        if (!checkCoordinate(x) == false || !checkCoordinate(y) == false) {
            return false;
        }

        return true;

    }

    public Player[] getPlayers() {
        return players;
    }

    private static boolean checkCoordinate(final int coordinate) {
        if (coordinate < MIN_COORDINATE || coordinate > MAX_COORDINATE) return false;
        return true;
    }

}
