package com.company;

public class FromOverduedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if ( book.getStatus() == Status.ARCHIVED && book.getStatus() == Status.AVAILABLE && requestedStatus != Status.OVERDUED && requestedStatus != Status.BORROWED) {
            book.setStatus(requestedStatus);
        } else  {
            System.out.println("Проверти статус книги ");
        }
    }
}
