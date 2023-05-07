package com.company;

public class CheckingAccount extends Account{

    public CheckingAccount(int amount, Account account) {
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
