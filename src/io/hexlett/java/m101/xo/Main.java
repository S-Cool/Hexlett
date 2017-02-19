package io.hexlett.java.m101.xo;

public class Main {
    public static void main(String[] args) {

        final Board board = new Board();

        final ThreePlayersGame threePlayersGame = new ThreePlayersGame("Slava", "Max", "Oleg");

        printGameNameAndBoard(threePlayersGame, board );
    }

    private static void printGameNameAndBoard(final Game game, final Board board) {
        game.pringGameName();
        System.out.println("=================");
        board.printBoard();
    }
}
