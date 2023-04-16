package com.company;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getTitle() +" " + book.getStatus());
        System.out.println();

        BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
        fromArchievedStatusMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getTitle() +" " + book.getStatus());
        System.out.println();

        BookMover fromBorrovedStatusMover = new FromBorrovedStatusMover();
        fromBorrovedStatusMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getTitle() +" " + book.getStatus());
        System.out.println();

        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
        fromOverduedStatusMover.moveToStatus(book, Status.ARCHIVED);
        System.out.println(book.getTitle() +" " + book.getStatus());
    }
}
