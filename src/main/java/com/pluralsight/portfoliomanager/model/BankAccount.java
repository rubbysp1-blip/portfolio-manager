package com.pluralsight.portfoliomanager.model;

import java.math.BigDecimal;

public class BankAccount extends Account {

    public BankAccount(int accountNumber, String name, BigDecimal balance) {
        super(accountNumber, name, balance);
    }

    public void deposit(BigDecimal amount) {
        // TODO: add the amount to the balance
        setBalance(getBalance().add(amount));
    }

    public void withdraw(BigDecimal amount) {
        // TODO: take the amount out of the balance
        setBalance(getBalance().subtract(amount));
    }

//    @Override
//    public String toString() {
//        return "BankAccount| " + getValue();
//    }
}
