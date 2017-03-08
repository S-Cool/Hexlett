package io.hexlett.java.m101.xo.nested;

public class Usage {

    public static void main(String[] args) {
        final Account myAccount = new Account("123qwert321", "Slava");
        final Account.Card myCard = myAccount.new Card("1111 2222 3333 4444");
        System.out.println(myAccount.getAmount());
        myCard.withdraw(-1000);
        System.out.println(myAccount.getAmount());
    }
}
