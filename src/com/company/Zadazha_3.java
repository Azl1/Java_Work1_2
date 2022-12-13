package com.company;

import java.util.Scanner;

public class Zadazha_3 {

   static int day = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int points = 0;

        while (true) {
            System.out.println("Введите год в формате: yyyy и количество-дней");
            int inputYear = sc.nextInt();
            int inputDay = sc.nextInt();

            if(amountOfDays(inputYear, inputDay)) {
                points++;
                System.out.println("В этом году " + day + " дней!");
            } else {
                System.out.println("В этом году " + day + " дней!");
                System.out.println("Набрано очков " + points);
                break;
            }
        }
    }

    public static boolean amountOfDays (int inputYear, int inputDay) {


        if (inputYear % 400 == 0) {
            day = 366;
            System.out.println("Результат вычисления " + day);
        } else if (inputYear % 4 == 0 && inputYear % 100 != 0) {
            day = 366;
            System.out.println("Результат вычисления " + day);
        } else {
            day = 365;
            System.out.println("Результат вычисления " + day);
        }
        return day == inputDay;
    }

}
