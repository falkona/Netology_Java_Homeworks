package ru.netology3_3.task_1;

import ru.netology3_3.task_1.users.User;
import ru.netology3_3.task_1.users.UserAdministrator;
import ru.netology3_3.task_1.users.UserLibrarian;
import ru.netology3_3.task_1.users.UserLibrarianAdministrator;
import ru.netology3_3.task_1.users.UserReader;
import ru.netology3_3.task_1.users.UserSupplier;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        UserReader userReader = new UserReader("Марго");
        UserLibrarian userLibrarian = new UserLibrarian("Левий Матвеев");
        UserAdministrator userAdministrator = new UserAdministrator("Иван Савельевич Варенуха");
        UserSupplier userSupplier = new UserSupplier("OOO Бегемот");
        UserLibrarianAdministrator userLibrarianAdministrator = new UserLibrarianAdministrator("Степа Лиходеев");

        userReader.getBook("Желтые цветы", userAdministrator);
        userLibrarian.orderBooks(Arrays.asList("Путеводитель по Ялте", "Сумерки"), userSupplier);
        userAdministrator.overdueNotification("Рукописи горят", userReader);
        userSupplier.supply(Arrays.asList("Путеводитель по Ялте", "Сумерки"), userLibrarian);
        userLibrarianAdministrator.findBook("Мертвые даши. Том 3");
    }

}
