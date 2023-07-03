package com.company;

public class Contact {

    String name;
    String surname;
    String phone;
    Group group;

    public Contact() {
    }

    public Contact(String phone) {
        this.phone = phone;
    }

    public Contact(String name, String surname, String phone, Group group) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.group = group;
    }

    public Contact(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }
}
