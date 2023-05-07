package com.company;

public class CreditAccount extends Account{
    public CreditAccount(int amount, Account account) {
        super(amount, account);
    }

    @Override
    public void pay(int amount) {
        if (this.amount > amount) {
            System.out.println("Вы пополнили " + amount);
            this.amount -= amount;
            System.out.println("Остаток на счете: " + this.amount);
        }   else {
            System.out.println("0 ");
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Возможен перевод: " + this.amount);
    }

    @Override
    public void addMoney(int amount) {
        if (this.amount > amount) {
            System.out.println("Вы пополнили " + amount);
            this.amount -= amount;
            System.out.println("Остаток на счете: " + this.amount);
        }   else {
            System.out.println("0 ");
        }
    }
}
