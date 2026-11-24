package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

// A credit card's balance is how much you owe.
public class CreditCard extends Account {

    public CreditCard(int accountNumber, String name, BigDecimal balance) {
        super(accountNumber, name, balance);
    }

    public void charge(BigDecimal amount) {
        // TODO: a charge adds to what you owe
        setBalance(getBalance().add(amount));
    }

    public void pay(BigDecimal amount) {
        // TODO: a payment takes away from what you owe
        setBalance(getBalance().subtract(amount));
    }

    // TODO: override getValue(). Money you owe is worth less than nothing,
    //       so a credit card's value is its balance as a negative number.
    @Override
    public BigDecimal getValue(){
        return getBalance().negate();
    }
}
