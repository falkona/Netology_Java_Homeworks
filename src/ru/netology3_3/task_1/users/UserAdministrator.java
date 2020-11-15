package ru.netology3_3.task_1.users;

import ru.netology3_3.task_1.interfaces.Administrator;
import ru.netology3_3.task_1.interfaces.Reader;

public class UserAdministrator extends User implements Administrator {

    public void findBook(String book) {
        System.out.println(String.format("Найдена книга '%s'", book));
    }

    public void overdueNotification(String book, Reader reader) {
        System.out.println(String.format("Пользователю %s направлено оповещение о просрочке книги '%s'", reader.getFullName(), book));
    }

    public UserAdministrator(String fullName) {
        super(fullName);
    }

}
