package com.company;

import java.util.Scanner;

public class NewComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию над double/float");
            System.out.println("Сравнить");
            System.out.println("Округлить");
            System.out.println("Отбросить дробную часть");
            System.out.println("Выберите операцию : ");
            System.out.println();

            int number = scanner.nextInt();
            switch (number){
                case 1:
                    System.out.println("Введите первое число ");
                    double number1 = scanner.nextDouble();
                    System.out.println("Введите второе число ");
                    double number2 = scanner.nextDouble();
                    if (number1 == number2){
                        System.out.println("Числа равны ");
                        System.out.println();
                    }
                        System.out.println("Числа не равны ");
                        System.out.println();
                    break;
                case 2:
                    System.out.println("Введите первое число ");
                    double value = scanner.nextDouble();
                    double result = Math.round(value);
                    System.out.println(result);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Введите первое число ");
                    double value1 = scanner.nextDouble();
                    int value2 = (int) value1;
                    System.out.println(value2);
                    System.out.println();
                    break;

            }

        }
    }
}
