package ru.netology3_4.task_1;

import ru.netology3_4.task_1.exceptions.AccessDeniedException;
import ru.netology3_4.task_1.exceptions.UserNotFoundException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User currentUser = getUserByLoginAndPassword(login, password);
        validateUser(currentUser);

        System.out.println("Доступ представлен");
    }

    public static List<User> getUsers() {
        return Arrays.asList(
                new User("Harley_Quinn", "12345", "hq@dc.com", 25),
                new User("Ivy", "24680", "ivy@dc.com", 17)
        );
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        List<User> users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException(String.format("User '%s' not found", login));
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException(String.format("Access is denied! User '%s' is under 18 years old", user.getLogin()));
        }
    }

}
