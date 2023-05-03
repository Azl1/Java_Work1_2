package com.company;

public class User implements Librarian, Supplier{
    @Override
    public void orders_books() {
        System.out.println("Библиотекарь Вася заказал у поставщика Петя книгу Игра Престолов");
    }

    @Override
    public void brings_books_to_the_library() {

    }
}
