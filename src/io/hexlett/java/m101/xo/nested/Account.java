package io.hexlett.java.m101.xo.nested;

public class Account {
    double amount;
    String number;
    String owner;

    public Account(final String number, final String owner) {
        this.number = number;
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    private synchronized double withdraw (final double amountToWithDraw){
        if (amountToWithDraw > getAmount()){
            final double amountToReturn = getAmount();
            this.amount = 0;
            return amountToReturn;
        }
//        if (amountToWithDraw < 0) return .0;
        this.amount = this.amount - amountToWithDraw;
        return amountToWithDraw;
    }

    public class Card {
        private  final String number;

        public Card(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
        public double withdraw(final double amountToWithdraw){
            return Account.this.withdraw(amountToWithdraw);
        }
    }
}
