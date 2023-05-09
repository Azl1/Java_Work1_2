package com.company;

public class SavingsAccount extends Account{


    public SavingsAccount(int schet, int amount) {
        super(schet, amount);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата невозможна ");
    }

    @Override
    public void transfer( Account account, int amount) {
        if (this.amount > amount) {
            this.amount = this.amount - amount;
            account.amount = account.amount + amount;
            System.out.println("Произведен перевод с счета " + schet + " на счет " + account + " на сумму " + amount);
        } else {
            System.out.println("Недостаточно средств ");
        }
    }

    @Override
    public void addMoney(int amount) {
        this.amount += amount;
        System.out.println("Полполнение счета: " + this.amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "amount=" + amount +
                '}';
    }
}
