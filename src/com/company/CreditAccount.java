package com.company;

public class CreditAccount extends Account{


    public CreditAccount(int schet, int amount) {
        super(schet, amount);
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
    public void transfer( Account account, int amount) {
        if (this.amount > amount) {
            this.amount = this.amount - amount;
            account.amount = account.amount + amount;
            System.out.println("Произведен перевод с счета " + schet + " на счет " + account.schet + " на сумму " + amount);
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
        return "CreditAccount{" +
                "amount=" + amount +
                '}';
    }
}
