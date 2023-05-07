package com.company;

public abstract class Account {

    public static void main(String[] args) {
        Account account1 = (CheckingAccount) new CheckingAccount();
    }

    int amount;
    Account account;

    public Account(int amount, Account account) {
        this.amount = amount;
        this.account = account;
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
