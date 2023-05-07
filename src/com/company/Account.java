package com.company;

public abstract class Account {

    int amount;

    public Account(int amount ) {
        this.amount = amount;

    }

    public abstract void pay(Account account4, int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(Account account6, int amount);


}
