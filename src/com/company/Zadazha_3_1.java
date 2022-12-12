package com.company;

import java.util.Scanner;

public class Zadazha_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int points = 0;

        while (true) {
            System.out.println("Введите год в формате: " + "yyyy" + "и количество дней: ");
            int inputYear = sc.nextInt();
            int inputDay = sc.nextInt();
            amountOfDays(inputYear, inputDay);

        }
    }


    public static int amountOfDays(int inputYear, int inputDay) {
        Scanner sc = new Scanner(System.in);

        if (inputYear % 400 == 0) {
            System.out.println("Количество дней: 366");
        } else if (inputYear % 4 == 0 && inputYear % 100 != 0) {
            System.out.println("Количество дней: 366");
        } else {
            System.out.println("Количество дней: 365");

        }
        return inputYear;
    }
}
