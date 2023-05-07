package com.company;

public class SavingsAccount extends Account{
    public SavingsAccount(int amount) {
        super(amount);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата невозможна ");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (this.amount > amount) {
            this.amount = this.amount - amount;
            System.out.println("Возможен перевод: " + this.amount);
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
