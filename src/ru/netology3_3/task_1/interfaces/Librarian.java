package ru.netology3_3.task_1.interfaces;

import java.util.List;

public interface Librarian extends BasicUser {

    public void orderBooks(List<String> books, Supplier supplier);

}
