package ru.netology3_3.task_1.interfaces;

public interface Administrator extends BasicUser {

    public void findBook(String book);
    public void overdueNotification(String book, Reader reader);
}
