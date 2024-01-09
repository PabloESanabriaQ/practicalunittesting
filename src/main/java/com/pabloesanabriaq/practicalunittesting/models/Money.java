package com.pabloesanabriaq.practicalunittesting.models;

/*
    First version of the class can be found in the book at page 20.
    Second version of the class (with exceptions) can be found in the book at page 28.
 */
public class Money {
    private final int amount;
    private final String currency;
    public Money(int amount, String currency) {
        if (amount < 0) {
            throw new IllegalArgumentException(
                    "illegal amount: [" + amount + "]");
        }
        if (currency == null || currency.isEmpty()) {
            throw new IllegalArgumentException(
                    "illegal currency: [" + currency + "]");
        }
        this.amount = amount;
        this.currency = currency;
    }
    public int getAmount() {
        return amount;
    }
    public String getCurrency() {
        return currency;
    }
    public boolean equals(Object anObject) {
        if (anObject instanceof Money) {
            Money money = (Money) anObject;
            return money.getCurrency().equals(getCurrency())
                    && getAmount() == money.getAmount();
        }
        return false;
    }
}
