package ru.netology3_3.task_1.users;

import ru.netology3_3.task_1.interfaces.Librarian;
import ru.netology3_3.task_1.interfaces.Supplier;

import java.util.List;

public class UserSupplier extends User implements Supplier {

    public void supply(List<String> books, Librarian librarian) {
        System.out.println(String.format("Поставили книги '%s' библиотекарю %s", books, librarian.getFullName()));
    }

    public UserSupplier(String fullName) {
        super(fullName);
    }

}
