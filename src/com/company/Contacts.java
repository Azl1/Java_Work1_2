package com.company;

import java.util.*;

public class Contacts {

    Map<String, Contact> contacts = new HashMap<>();

    public void addingContact() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добавление контакта (имя, фамилия, номер телефона, группа контакта: Работа, Друзья, Семья);");
        String name = scanner.nextLine();
        String[] parse = name.split(", ");
        String names = parse[0];
        String surname = parse[1];
        String phoneNumber = parse[2];
        String contactGroup = parse[3];

        Group group;
        switch (contactGroup) {
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
        Contact contact = new Contact(names, surname, phoneNumber, group);
        contacts.put(phoneNumber, contact);
        System.out.println(group);
        System.out.println("Добавлен");

    }

    public String getContactF10(String phone) {
        Contact contact = contacts.get(phone);
        if (contact != null) {
            return contact.name + " " + contact.surname;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contacts=" + contacts + '}';
    }

    void printContacts() {
        for (Map.Entry<String, Contact> contacts1 : contacts.entrySet()) {
                System.out.println(contacts1);
        }
    }
}