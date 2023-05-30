package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            String input = scanner.nextLine();
            if ("нет".equals(input)) break;
            phoneBook.addGroup(input);

        }
        phoneBook.toStringList();
    }
}
