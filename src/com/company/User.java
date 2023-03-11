package com.company;

public class User {
    static int totalOnline;

    public static void main(String[] args) {
        Author author = new Author("Black", "Jake");
        Book book1 = new Book(author, "Blabla1", 2019);
        totalOnline++;
        Book book2 = new Book(author, "Blabla2", 2021);
        totalOnline++;
        Book book3 = new Book(author, "Blabla3", 2023);
        totalOnline++;

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println("Количество книг " + totalOnline);
    }
}
