package com.company;

import static com.company.Status.AVAILABLE;

public class Book {

    String title;
    Status status;

    public Book(String title) {
        this.title = title;
        this.status = AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
