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
        String name = parse[0];
        String number = parse[1];
        String group = parse[2];
        Contact contact = new Contact(name, number);
        addInGroup(group, contact);
        printContactGroup();
//        groups.add(input);
    }

    public void addGroup(){
        System.out.println("Создать группу контактов (введите по форме: Группа)?");
        String input = scanner.nextLine();
        String group = input;
        if (hashMap.get(group) == null) {
            hashMap.put(group, new ArrayList<Contact>());
        }
        printContactGroup();
    }

    public void findNumber() {
        System.out.println("Поиск номера телефона ");
        String input = scanner.nextLine();
        String number = input;
        for (String name : hashMap.keySet()) {
            System.out.println(name);
            for (Contact contact : hashMap.get(name)){
                if (contact.number.equals(number)) {
                    System.out.println(contact);
                }
            }
        }
        printContactGroup();
    }

    public void findFromGroup() {
        System.out.println("Поиск группы ");
        String input = scanner.nextLine();
        String group = input;
        ArrayList<Contact> groupContact = hashMap.get(group);
        if (groupContact == null) {
            for (Contact contact : groupContact) {
                System.out.println(contact);
            }
        } else {
            System.out.println("Нет номер ");
        }
        printContactGroup();
    }
    public void addInGroups() {
        System.out.println("Создать группу контактов (введите по форме: Имя Номер Группа через пробел)?");
        String input = scanner.nextLine();
        String [] parse = input.split(" ");
        String name = parse[0];
        String number = parse[1];
        Contact contact = new Contact(name, number);
        for (int i = 2; i < parse.length; i++) {
            addInGroup(parse[i], contact);
        }
        printContactGroup();
    }
    public void addInGroup(String group, Contact contact) {
        ArrayList<Contact> contacts = hashMap.get(group);
        if(contacts != null) {
            hashMap.get(group).add(contact);
        } else {
            ArrayList <Contact> newContacts = new ArrayList<>();
            newContacts.add(contact);
            hashMap.put(group, newContacts);
        }
        printContactGroup();
    }

    public void addContact() {
        System.out.println("Создать контакт (введите по форме: Имя Номер)?");
        String input = scanner.nextLine();
        String [] parse = input.split(" ");
        String name = parse[0];
        String number = parse[1];
        Contact contact = new Contact(name, number);
        addInGroup(" ", contact);

       printContactGroup();
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
