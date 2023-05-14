package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class ScannerInput {

    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    String input = "";
    int operation = 0;

    public void data(){
        while (true) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");
            input = scanner.nextLine();
           // operation = scanner.nextInt();

            if("0".equals(input)) {
                System.out.println("Программа завершена ");
                break;
            }
            operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите задачу для планирования: ");
                    input = scanner.nextLine();
                    arrayList.add(input);
                break;
                case 2:
                    System.out.println("Список задач: ");
                    for (String s: arrayList) {
                        System.out.println(s);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Удалить задачу: ");
                    input = scanner.nextLine();
                    int index = operation - 1;
              //      arrayList.get(index);
                    arrayList.remove(arrayList.get(index));
                    break;
                default:
                    System.out.println("Такой программы нет ");
            }
        }
    }

}
