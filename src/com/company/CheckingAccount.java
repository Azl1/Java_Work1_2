package com.company;

public class CheckingAccount extends Account{

    public CheckingAccount(int amount, Account account) {
        super(amount, account);
    }

    @Override
    public void pay(int amount) {
        if (this.amount > amount) {
            System.out.println("Вы оплатили покупку на сумму " + amount);
            this.amount += amount;
            System.out.println("Остаток на счете: " + this.amount);
        }   else {
            System.out.println("Недостаточно средств ");
        }
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
