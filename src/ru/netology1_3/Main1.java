package ru.netology1_3;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int smallestTime = Integer.MAX_VALUE;
        int biggestTime = 0;
        while (true) {
            System.out.println("Введите название задачи");
            scanner.nextLine();
            System.out.println("Сколько дней потребуется на выполнение?");
            int days = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько часов?");
            int hours = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько минут?");
            int minutes = Integer.parseInt(scanner.nextLine());
            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totalTime += currentTimeTask;
            if (currentTimeTask < smallestTime) {
                smallestTime = currentTimeTask;
            }
            if (currentTimeTask > biggestTime) {
                biggestTime = currentTimeTask;
            }
            System.out.println("Для завершения работы программы введите `end` / для продолжения нажмите enter");
            if (scanner.nextLine().equals("end")) {
                System.out.println(String.format("Всего потребуется: %d секунд", totalTime));
                System.out.println(String.format("Самая продолжительная задача займет: %d секунд", biggestTime));
                System.out.println(String.format("Самая короткая задача займет: %d секунд", smallestTime));
                break;
            }
        }
    }

    public static int convertToSeconds(int days, int hours, int minutes) {
        return days * 24 * 3600 + hours * 3600 + minutes * 60;
    }

}
