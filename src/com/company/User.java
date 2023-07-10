package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class User {
    int id;
    String surname;
    String name;
    String patronymic;
    String address;
    String residence;

    public User() {
    }

    public User(int id, String surname, String name, String patronymic, String address, String residence) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.residence = residence;
    }

    public void scanner() throws FileNotFoundException {
        File file = new File("1.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line); //вывод данных из файла (пример)
        }
    }
}