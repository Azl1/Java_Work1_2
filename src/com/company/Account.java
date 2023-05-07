package com.company;

public abstract class Account {

    public static void main(String[] args) {

    }

    int amount;


    public Account(int amount, Account account) {
        this.amount = amount;
       \
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);


}
