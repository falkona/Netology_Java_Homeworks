package ru.netology4_1_lists.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<String> tasksList = new ArrayList<>();

    public static void main(String args[]) {

        label:
        while (true) {
            System.out.println("Выберите действие:\n" +
                                       "1. Добавить задачу\n" +
                                       "2. Вывести список задач\n" +
                                       "3. Удалить задачу\n" +
                                       "0. Выход");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    while (true) {
                        if (!addTask()) {
                            break;
                        }
                    }
                    break;
                case "2":
                    printAllTasks();
                    break;
                case "3":
                    while (true) {
                        if (!deleteTask()) {
                            break;
                        }
                    }
                    break;
                case "0":
                    break label;
                default:
                    System.out.println("Не удалось распознать команду. Попробуйте еще раз");
                    break;
            }
        }
    }

    public static boolean addTask() {
        System.out.println("Введите название задачи (для завершения введите end)");
        String task = scanner.nextLine();
        if (task.equals("end")) {
            printAllTasks();
            return false;
        }
        tasksList.add(task);
        return true;
    }

    public static void printAllTasks() {
        if (tasksList.isEmpty()) {
            System.out.println("Список задач пуст");
        } else {
            System.out.println("В вашем списке следующие задачи:");
            for (int i = 0; i < tasksList.size(); i++) {
                System.out.println(String.format("%d. %s", i + 1, tasksList.get(i)));
            }
        }
    }

    public static boolean deleteTask() {
        printAllTasks();
        System.out.println("Введите порядковый номер задачи для удаления (для завершения введите finish)");
        String number = scanner.nextLine();
        if (number.equals("finish")) {
            printAllTasks();
            return false;
        }
        try {
            tasksList.remove(Integer.parseInt(number) - 1);
        } catch (RuntimeException e) {
            System.out.println(String.format("Задачи с номером '%s' не существует", number));
        }
        return true;
    }

}
