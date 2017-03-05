package io.hexlett.java.m101.xo;

import io.hexlett.java.m101.xo.controller.GameController;
import io.hexlett.java.m101.xo.model.Contact;
import io.hexlett.java.m101.xo.model.ContactBuilder;
import io.hexlett.java.m101.xo.view.AdvConsoleView;
import io.hexlett.java.m101.xo.view.ConsoleView;
import io.hexlett.java.m101.xo.view.MenuView;


public class Main {
    public static void main(String[] args) {

//        final Board board = new Board();
//        final GameController gameController = new GameController("XO", new Player[]{new Player("Slava", new Figure("O")), new Player("Gleb", new Figure("X"))}, board);
//        new ConsoleView(gameController).showPlayers();
//
//        MenuView menu = new MenuView();
//        menu.showMenuWithResult();

        final Contact contact = new ContactBuilder()
                .name("Slava")
                .surname("Koval")
                .mail("test@nmail.ru")
                .phone("5555555")
                .address("street")
                .build();
    }
//
//public static void testConsoleView(){
//    final GameController gameController = new GameController("XO", null, null);
//    final AdvConsoleView advConsoleView = new AdvConsoleView(gameController);
//    final ConsoleView consoleView = new ConsoleView(gameController);
//    startGame(advConsoleView);
//    startGame(consoleView);
//    try{
//        new ConsoleView(null);
//        throw new RuntimeException("assert is not working as expected");
//    } catch (AssertionError e) {}
//
//    try{
//        new AdvConsoleView(null);
//        throw new RuntimeException("assert is not working as expected");
//    } catch (AssertionError e) {}
//
//}


}
