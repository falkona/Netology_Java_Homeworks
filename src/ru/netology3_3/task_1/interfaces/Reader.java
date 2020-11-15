package ru.netology3_3.task_1.interfaces;

public interface Reader extends BasicUser {

    public void getBook(String book, Administrator administrator);
    public void returnBook(String book, Administrator administrator);

}
