package ru.netology3_3.task_1.users;

import ru.netology3_3.task_1.interfaces.Administrator;
import ru.netology3_3.task_1.interfaces.Librarian;
import ru.netology3_3.task_1.interfaces.Reader;
import ru.netology3_3.task_1.interfaces.Supplier;

import java.util.List;

public class UserLibrarianAdministrator extends User implements Librarian, Administrator {

    public void orderBooks(List<String> books, Supplier supplier) {
        System.out.println(String.format("Сформирован заказ книг '%s' у поставщика '%s'", books, supplier.getFullName()));
    }

    public void findBook(String book) {
        System.out.println(String.format("Найдена книга '%s'", book));
    }

    public void overdueNotification(String book, Reader reader) {
        System.out.println(String.format("Пользователю %s направлено оповещение о просрочке книги '%s'", reader.getFullName(), book));
    }

    public UserLibrarianAdministrator(String fullName) {
        super(fullName);
    }

}
