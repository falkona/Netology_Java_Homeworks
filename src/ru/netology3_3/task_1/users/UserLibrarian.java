package ru.netology3_3.task_1.users;

import ru.netology3_3.task_1.interfaces.Librarian;
import ru.netology3_3.task_1.interfaces.Supplier;

import java.util.List;

public class UserLibrarian extends User implements Librarian {

    public void orderBooks(List<String> books, Supplier supplier) {
        System.out.println(String.format("Сформирован заказ книг '%s' у поставщика '%s'", books, supplier.getFullName()));
    }

    public UserLibrarian(String fullName) {
        super(fullName);
    }

}
