package com.company;

import java.util.*;

public class Contacts {

    Map<String, Contact> contacts = new HashMap<>();

    public void addingContact() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Добавление контакта (имя, фамилия, номер телефона, группа контакта: Работа, Друзья, Семья);");
            String name = scanner.nextLine();
            if (name.equals("")) {
                printContacts((Set<Contacts>) contacts);
                System.out.println("Выход ");
                break;
            }
            String[] parse = name.split(", ");
            String names = parse[0];
            String surname = parse[1];
            String phoneNumber = parse[2];
            Group contactGroup = Group.valueOf(parse[3]);
            //contacts.put(getnew Contact(names, surname, phoneNumber, contactGroups));
            contacts.put(names, new Contact(names, surname, phoneNumber, contactGroup));

        }
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contacts=" + contacts +
                '}';
    }

    static void printContacts(Set<Contacts> contacts ){
        for (Contacts contacts1: contacts) {
            System.out.println(contacts1);
        }
    }
}
