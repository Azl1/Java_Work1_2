package com.company;

public class FromArchievedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (book.getStatus() == Status.AVAILABLE && requestedStatus != Status.OVERDUED && requestedStatus != Status.BORROWED) {
            book.setStatus(requestedStatus);
        } else  {
            System.out.println("Проверти статус книги ");
        }
    }
}
