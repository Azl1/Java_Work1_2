package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Contacts {

    Map<String, Contact> contacts = new HashMap<>();

    public void addingAContact() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Добавление контакта (имя, фамилия, номер телефона, группа контакта: работа, друзья, семья);");
            String name = scanner.nextLine();
            if (name.equals("")) {
                printCandidate(contacts);
                break;
            }
            String[] parse = name.split(", ");
            String names = parse[0];
            String surname = parse[1];
            String phoneNumber = parse[2];
            String contactGroup = parse[3];

            contacts.add(new Contacts(names, surname, phoneNumber, contactGroup);
        }
    }

    public void deletingAContact() {

    }

    public void сontactSearch() {

    }

    @Override
    public String toString() {
        return "Contacts{" +
                "contacts=" + contacts +
                '}';
    }


    static void printCandidate(Set<Contacts> contacts ){
        for (Contacts contacts1: contacts) {
            System.out.println(contacts1);
        }
    }
}
