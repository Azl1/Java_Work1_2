package com.company;

public class CreditAccount extends Account{
    public CreditAccount(int amount, Account account) {
        super(amount, account);
    }

    @Override
    public void pay(int amount) {

    }

    @Override
    public void transfer(Account account, int amount) {

    }

    @Override
    public void addMoney(int amount) {

    }
}
