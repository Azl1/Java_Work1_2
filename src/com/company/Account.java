package com.company;

public abstract class Account {

    int schet;
    int amount;

    public Account(int schet, int amount ) {
        this.schet = schet;
        this.amount = amount;
    }


    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney( int amount);


}
