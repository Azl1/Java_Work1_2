package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Products {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productNumber = 0;
        int productCount = 0;
        int sumProducts = 0;

        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};

        while (true){
            System.out.println("Список возможных товаров для покупки");
            System.out.println("1. Молоко 50 руб/шт");
            System.out.println("2. Хлеб 14 руб/шт");
            System.out.println("3. Гречневая крупа 80 руб/шт\n");
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            Integer.parseInt(input);
            if ("end".equals(input) || sumProducts > 0){
                System.out.println("Программа завершена");
                break;
            }

            sumProducts=+1;

            for (int i = 0; i < products.length; i++) {
                System.out.println(Arrays.toString(products));
            }
            for (int i = 0; i < prices.length; i++) {
                System.out.println(Arrays.toString(prices));
            }

        }


    }



}
