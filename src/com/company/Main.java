package com.company;

public class Main {
    public static void main(String[] args) {
        Account account1 = new CheckingAccount(5000);
        Account account2 = new CheckingAccount(10000);
        System.out.println(account1);
        System.out.println(account2);
        account1.transfer(1000);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println();
        Account account3 = new CreditAccount(8000);
        Account account4 = new CreditAccount(12000);
        System.out.println(account3);
        System.out.println(account4);
        account3.pay(3000);
        System.out.println(account3);
        System.out.println(account4);
        System.out.println();
        Account account5 = new SavingsAccount(12000);
        Account account6 = new SavingsAccount(15000);
        System.out.println(account5);
        System.out.println(account6);
        account5.addMoney(5000);
        System.out.println(account5);
        System.out.println(account6);
    }
}
