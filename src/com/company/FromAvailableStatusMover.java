package com.company;

public class FromAvailableStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        super.moveToStatus(book, requestedStatus);
        if (book.getStatus() == Status.AVAILABLE && requestedStatus != Status.OVERDUED) {
            book.setStatus(requestedStatus);
        } else  {
            System.out.println("Проверти статус книги ");
        }
    }
}
