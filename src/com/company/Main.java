package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Выберите пункт меню: ");
            System.out.println("1: Создание группы контактов");
            System.out.println("2: Создание контакта");
            System.out.println("3: Добавление контакта в разные группы");
            System.out.println("4: Поиск контактов по группе");
            System.out.println("5: Поиск контакта по номеру");
            System.out.println("0: Выход");

            String input = scanner.nextLine();
            if ("0".equals(input)) break;
            switch (input) {
                case ("1"):
                    phoneBook.addGroupContact();
                    break;
                case ("2"):
                    phoneBook.addContact();
                    break;
                case ("3"):
                    phoneBook.addInGroups();
                    break;
                case ("4"):
                    phoneBook.findFromGroup();
                    break;
                case ("5"):
                    phoneBook.findNumber();
                    break;
            }

        }
        phoneBook.toStringList();
    }
}
