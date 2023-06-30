package com.company;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


            try {
                System.out.println("Меню:\n" +
                        "1. Добавить контакт\n" +
                        "2. Добавить пропущенный вызов\n" +
                        "3. Вывести все пропущенные вызовы\n" +
                        "4. Очистить пропущенные вызовы\n" +
                        "5. Выход\n" +
                        "Выберите пункт из меню (1-4):");

            } catch (Exception e) {
                System.out.println("Неверно введены данные");
        }
    }

}
