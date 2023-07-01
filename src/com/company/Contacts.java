package com.company;

import java.util.*;

public class Contacts {

    Map<String, Contact> contacts = new HashMap<>();

    public void addingContact() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Добавление контакта (имя, фамилия, номер телефона, группа контакта: Работа, Друзья, Семья);");
            String name = scanner.nextLine();
            String[] parse = name.split(", ");
            String names = parse[0];
            String surname = parse[1];
            String phoneNumber = parse[2];
            String contactGroup = parse[3];
            //contacts.put(getnew Contact(names, surname, phoneNumber, contactGroups));
            Contact contact = new Contact(names, surname, phoneNumber, contactGroup);
            contacts.put(name, contact);
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
        }
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contacts=" + contacts + '}';
    }

    static void printContacts(Set<Contacts> contacts ){
        for (Contacts contacts1: contacts) {
            System.out.println(contacts1);
        }
    }
}
