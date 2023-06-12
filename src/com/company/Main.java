package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Wishlist wishlist = new Wishlist();
        TreeSet<Wishlist> treeSet = new TreeSet<>();

        while (true) {
            try {
                System.out.println("Выберите тип сортировки для Wishlist\n" +
                        "1. Сортировка по убыванию цены\n" +
                        "2. Сортировка по возрастанию цены\n" +
                        "3. Сортировка по приоритету от самого важного\n" +
                        "4. Сортировка по приоритету от низкого приоритета\n");
                System.out.println("Введите идентификатор сортировки:");
                String input = scanner.nextLine();
                if ("end".equals(input)) {
                    System.out.println("Ваш список:");
                    printWishlist(treeSet);
                }

                switch (input) {
                    case ("1"):
                sortByPriceDescending();
                    break;
                    case ("2"):
                sortByPriceAscending();
                        break;
                    case ("3"):
                sortByPriorityFromMostImportant();
                        break;
                    case ("4"):
                sortByPriorityFromLowPriority();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Неверно введены данные");
            }
        }
    }

    static void printWishlist(Set<Wishlist> wishlists ){
        for (Wishlist wishlist: wishlists) {
            System.out.println(wishlist);
        }
    }
}
