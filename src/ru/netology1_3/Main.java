package ru.netology1_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isLeap = false;
            System.out.println("Введите год в формате \"yyyy\"");
            int year = scanner.nextInt();
            if (year % 400 == 0) {
                isLeap = true;
            } else if (year % 4 == 0 && year % 100 != 0) {
                isLeap = true;
            }
            if (isLeap) {
                System.out.println("Количество дней 366");
            } else {
                System.out.println("Количество дней 365");
            }
        }
    }

}