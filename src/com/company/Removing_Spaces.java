package com.company;

import java.util.Scanner;

public class Removing_Spaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String input = scanner.nextLine().trim();
        extraTrim(input);
        System.out.println("Пробелы удалены:");

    }

    static String extraTrim(String input) {
        String result = input.replaceAll("\\s+"," ");
        System.out.println(result);
        return result;
    }
}
