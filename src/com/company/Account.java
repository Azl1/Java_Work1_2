package com.company;

public abstract class Account {

    int amount;

    public Account(int amount ) {
        this.amount = amount;

    }

    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);


}
