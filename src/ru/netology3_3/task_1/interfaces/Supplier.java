package ru.netology3_3.task_1.interfaces;

import java.util.List;

public interface Supplier extends BasicUser {

    public void supply(List<String> books, Librarian librarian);

}
