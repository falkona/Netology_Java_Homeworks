package ru.netology1_4;

import java.util.Scanner;

public class Main1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Операции над double/float" +
                                       System.lineSeparator() + "1. Сравнить" +
                                       System.lineSeparator() + "2. Округлить" +
                                       System.lineSeparator() + "3. Отбросить дробную часть");
            int operation = Integer.parseInt(scanner.nextLine());
            switch (operation) {
                case 1:
                    compareOperation();
                    break;
                case 2:
                    roundOperation();
                    break;
                case 3:
                    throwFractionalOperation();
                    break;
            }
        }
    }

    private static void compareOperation() {
        System.out.println("Введите первое число:");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Введите второе число:");
        double y = Double.parseDouble(scanner.nextLine());
        if (x > y) {
            System.out.println(x + " больше " + y);
        } else if (x < y) {
            System.out.println(x + " меньше " + y);
        } else {
            System.out.println("Числа равны");
        }
    }

    private static void roundOperation() {
        System.out.println("Введите число:");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println(String.format("Результат округления: %d", Math.round(x)));
    }

    private static void throwFractionalOperation() {
        System.out.println("Введите число:");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println(String.format("Целая часть числа: %d", (long) x));
    }
}