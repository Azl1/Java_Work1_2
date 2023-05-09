package com.company;

public abstract class Account {

    int schet;
    int amount;

    public Account(int amount ) {
        this.amount = amount;

    }

    public int getSchet() {
        return schet;
    }

    public void setSchet(int schet) {
        this.schet = schet;
    }

    public abstract void pay(int amount);
    public abstract void transfer(int schet, Account account, int amount);
    public abstract void addMoney( int amount);


}
