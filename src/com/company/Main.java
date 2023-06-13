package com.company;

import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    Wishlist wishlist = new Wishlist();
    TreeSet<Wishlist> treeSet = new TreeSet<>();

    public static void main(String[] args) {


            try {
                System.out.println("Выберите тип сортировки для Wishlist\n" +
                        "1. Сортировка по убыванию цены\n" +
                        "2. Сортировка по возрастанию цены\n" +
                        "3. Сортировка по приоритету от самого важного\n" +
                        "4. Сортировка по приоритету от низкого приоритета\n");
                System.out.println("Введите идентификатор сортировки:");
                String input = scanner.nextLine();

                switch (input) {
                    case ("1"):
                TreeSet<Wishlist> treeSet1 = new TreeSet<>(Comparator.comparing(Wishlist::getPrice, Comparator.reverseOrder()));
                addItem(treeSet1);
                    break;
                    case ("2"):
                TreeSet<Wishlist> treeSet2 = new TreeSet<>(Comparator.comparing(Wishlist::getPrice));
                addItem(treeSet2);
                        break;
                    case ("3"):
                TreeSet<Wishlist> treeSet3 = new TreeSet<>(Comparator.comparing(Wishlist::getPriority, Comparator.reverseOrder()));
                addItem(treeSet3);
                        break;
                    case ("4"):
                TreeSet<Wishlist> treeSet4 = new TreeSet<>(Comparator.comparing(Wishlist::getPriority));
                addItem(treeSet4);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Неверно введены данные");
        }
    }
    public static void addItem(TreeSet<Wishlist> treeSet) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите что бы вы хотели купить (введите END для выхода):");
            System.out.println("Название");
            String name = scanner.nextLine();
            if(name.equals("END")){
                printWishlist(treeSet);
                break;
            }
            System.out.println("Короткое название");
            String shortDescription = scanner.nextLine();
            System.out.println("Цена в рублях");
            String price = scanner.nextLine();
            System.out.println("Где купить");
            String URLAddress = scanner.nextLine();
            System.out.println("Приоритет важности");
            String priority = scanner.nextLine();
            treeSet.add(new Wishlist(name, shortDescription, Double.parseDouble(price), URLAddress, Integer.parseInt(priority)));

        }
    }
    static void printWishlist(Set<Wishlist> wishlists ){
        for (Wishlist wishlist: wishlists) {
            System.out.println(wishlist);
        }
    }
}
