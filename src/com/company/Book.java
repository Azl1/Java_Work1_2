package com.company;

public class Book {
    Author author;
    String bookName;
    int year;

    public Book(Author author, String bookName, int year) {
        this.author = author;
        this.bookName = bookName;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Автор книги " + author.name + ", фамилия автора " + author.surname + ", название книги " + bookName + ", год выпуски книги " + year;
    }
}
