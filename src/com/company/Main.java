package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int value1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int value2 = sc.nextInt();
        System.out.println("Введите третье число: ");
        int value3 = sc.nextInt();

        int result  = sum(value1, value2, value3);
        System.out.println("Сумма чисел = " + result);
    }
    public static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }
}
