package com.company;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contacts contacts = new Contacts();
        MissedCalls missedCalls = new MissedCalls();
        String input = scanner.nextLine();

        Group group;
        switch (input){
            case "Семья":
                group = Group.FAMILY;
                break;
            case "Работа":
                group = Group.WORK;
                break;
            case "Друзья":
                group = Group.FRIENDS;
                break;
            default:
                group = Group.NO_GROUP;
        }
        System.out.println(group);

            try {
                System.out.println("Меню:\n" +
                        "1. Добавить контакт\n" +
                        "2. Добавить пропущенный вызов\n" +
                        "3. Вывести все пропущенные вызовы\n" +
                        "4. Очистить пропущенные вызовы\n" +
                        "5. Выход\n" +
                        "Выберите пункт из меню (1-4):");
                String input2 = scanner.nextLine();
                switch (input2){
                    case ("1"):
                    contacts.addingContact();
                    break;

                    case ("2"):
                    missedCalls.addMissedCall(contacts);
                        break;

                    case ("3"):
                   missedCalls.printMissedCall();
                        break;

                    case ("4"):
                    missedCalls.clearMissedCall();
                        break;

                    case ("5"):
                        contacts.addingContact();
                        break;
                }

            } catch (Exception e) {
                System.out.println("Неверно введены данные");
        }
    }

}
