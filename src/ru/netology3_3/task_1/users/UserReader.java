package ru.netology3_3.task_1.users;

import ru.netology3_3.task_1.interfaces.Administrator;
import ru.netology3_3.task_1.interfaces.Reader;

public class UserReader extends User implements Reader {

    public void getBook(String book, Administrator administrator) {
        System.out.println(String.format("Взяла книгу '%s' у администратора %s", book, administrator.getFullName()));
    }

    public void returnBook(String book, Administrator administrator) {
        System.out.println(String.format("Вернула книгу '%s' администратору %s", book, administrator.getFullName()));
    }

    public UserReader(String fullName) {
        super(fullName);
    }

}
