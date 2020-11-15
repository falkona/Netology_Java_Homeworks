package ru.netology3_1.task_1;

public class Book {

    private Status status;
    private String title;

    public Book(Status status, String title) {
        this.status = status;
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
