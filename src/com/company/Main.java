package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Student> hashSet = new HashSet();






        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
            String input = scanner.nextLine();
            String[] parse = input.split(", ");
            String name = parse[0];
            String group = parse[1];
            String studentId = parse[2];
            Student student = new Student(name, group, studentId);
            hashSet.add(student);
            System.out.println(student);
            if ("end".equals(input)) {
                System.out.println("Список студентов:");


            }


        }

    }
}
