package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
 //       Set<Contacts> contacts2 = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        Contacts contacts = new Contacts();
//        Contact contact = new Contact();
        MissedCalls missedCalls = new MissedCalls();

        while (true) {
            try {
                System.out.println("Меню:\n" +
                        "1. Добавить контакт\n" +
                        "2. Добавить пропущенный вызов\n" +
                        "3. Вывести все пропущенные вызовы\n" +
                        "4. Очистить пропущенные вызовы\n" +
                        "5. Выход\n" +
                        "Выберите пункт из меню (1-4):");
                String input2 = scanner.nextLine();

                if ("5".equals(input2)) {
//                    System.out.println("Список доавленных контактов ");
//                    contacts.printContacts(contacts2);
                    break;
                }
                switch (input2) {
                    case ("1"):
                        contacts.addingContact();
                        break;

                    case ("2"):

                        missedCalls.addMissedCall();
                        break;

                    case ("3"):
                        missedCalls.printMissedCall();

                        break;

                    case ("4"):
                        missedCalls.clearMissedCall();
                        break;
                }

            } catch (Exception e) {
                System.out.println("Неверно введены данные");
            }
        }
    }
}