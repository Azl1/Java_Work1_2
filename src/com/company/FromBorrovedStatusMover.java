package com.company;

public class FromBorrovedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (book.getStatus() == Status.ARCHIVED && book.getStatus() == Status.OVERDUED && book.getStatus() == Status.AVAILABLE) {
            book.setStatus(requestedStatus);
        } else  {
            System.out.println("Проверти статус книги ");
        }
    }
}
