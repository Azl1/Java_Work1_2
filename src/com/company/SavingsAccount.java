package com.company;

public class SavingsAccount extends Account{
    public SavingsAccount(int amount, Account account) {
        super(amount, account);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата невозможна ");
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Возможен перевод: " + this.amount);
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Полполнение счета: " + this.amount);
    }
}
