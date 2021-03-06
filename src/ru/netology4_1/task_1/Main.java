package ru.netology4_1.task_1;

public class Main {

    public static void main(String args[]) {
        // параметризируем класс типом String
        Box<String> sample1 = new Box<>("Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer
        // Здесь ошибка, т.к. неверно указатель типа: String вместо Integer
        // Box<String> sample2 = new Box<>(1);
        Box<Integer> sample2 = new Box<>(1);
        System.out.println(sample2);
        // параметризируем класс типом Boolean
        Box<Boolean> sample3 = new Box<>(Boolean.TRUE);
        System.out.println(sample3);
    }

}
