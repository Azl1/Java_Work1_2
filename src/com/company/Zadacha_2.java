package com.company;

import java.util.Scanner;

public class Zadacha_2 {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности в сантиметрах:");
        int radius = sc.nextInt();
        calculateCircleArea();
        double area = calculateCircleArea();
        calculateCircleLength();
        double length = calculateCircleLength();
    //    double value2 = 3.14;
    //    double value3 = 62.8;

        System.out.println("Площадь круга: " + area +  " см.кв.");
        System.out.println("Длина окружности: " + length +  " см.");

    }



    public static double calculateCircleArea(int radius) {
        return PI * radius * radius;
    }

    public static double calculateCircleLength(int radius) {
        return 2 * PI * radius;
    }
}
