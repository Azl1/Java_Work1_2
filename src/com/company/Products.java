package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Products {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] countProducts = new int[3];
        String[] products = {"Молоко", "Хлеб", "Гречневая крупа"};
        int[] prices = {100, 200, 300};

        while (true){
            System.out.println("Список возможных товаров для покупки");
            System.out.println("1. Молоко 50 руб/шт");
            System.out.println("2. Хлеб 14 руб/шт");
            System.out.println("3. Гречневая крупа 80 руб/шт\n");
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            if ("end".equals(input)){
                System.out.println("Ваша корзина");
                System.out.println("Наименование товара   Количество  Цена/за.ед  Общая стоимость ");
                for (int i = 0; i < 3; i++) {
                    if (countProducts[i] != 0) {
                        String text = products[i] + " " + countProducts[i] + " " + prices[i] + " " + prices[i] * countProducts[i];
                        System.out.println(text);
                    }
                }
                System.out.println("Программа завершена");
                break;
            }
            else {
                String[] inputMas = input.split(" ");
                int numberProduct = Integer.parseInt(inputMas[0]);
                int countProduct = Integer.parseInt(inputMas[1]);
                countProducts[numberProduct - 1] += countProduct;
            }
        }
    }
}
