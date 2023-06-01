package com.company;

import java.util.*;

public class PhoneBook {

    Scanner scanner = new Scanner(System.in);
    HashMap<String, ArrayList<Contact>> hashMap = new HashMap<>();
    List<String> groups = new ArrayList<>();
    Map<String, Contact> note = new HashMap<>();



    public void addGroupContact() {
        System.out.println("Создать группу контактов (введите по форме: Имя Номер Группа)?");
        String input = scanner.nextLine();
        String [] parse = input.split(" ");
        Contact contact = new Contact(parse[0], parse[1]);
        ArrayList<Contact> contacts = hashMap.get(parse[2]);
        if(contacts != null) {
            hashMap.get(parse[2]).add(contact);
        } else {
            ArrayList <Contact> newContacts = new ArrayList<>();
            newContacts.add(contact);
            hashMap.put(parse[2], newContacts);
        }
        printContactGroup();
//        groups.add(input);
    }

    public void addContact() {
        System.out.println("Создать контакт (введите по форме: Имя Номер)?");
        String input = scanner.nextLine();
        String [] parse = input.split(" ");
        String name = parse[0];
        String number = parse[1];
//        String group = parse[2];
        Contact contact = new Contact(name, number);
 //       ArrayList<Contact> contacts = hashMap.get(parse[2]);
//        if(contacts != null) {
//            hashMap.get(parse[2]).add(contact);
//        } else {
//            ArrayList <Contact> newContacts = new ArrayList<>();
//            newContacts.add(contact);
//            hashMap.put(parse[2], newContacts);
//        }
        printContact(name);

    }

    public void printContact(String name) {
        for (String name1 : hashMap.keySet()) {
            System.out.println(name1);
            for (Contact contact : hashMap.get(name)) {
                System.out.println(contact);

            }
        }
    }

    public void printContactGroup() {
        for (String name : hashMap.keySet()) {
            System.out.println(name);
            for (Contact contact : hashMap.get(name)){
                System.out.println(contact);
            }
            System.out.println();
        }
    }


    public void toStringList() {
        System.out.println(groups.toString());
    }
}
