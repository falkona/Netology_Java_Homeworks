package ru.netology1;

import java.util.Scanner;

public class Main {

    private static final double Pi = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        int radius = scanner.nextInt();
        double circumference = getCircumference(radius);
        double circleArea = getCircleArea(radius);
        System.out.println("Длина окружности = " + circumference);
        System.out.println("Площадь круга = " + circleArea);
    }

    static double getCircumference (int radius) {
        return 2 * Pi * radius;
    }

    static double getCircleArea (int radius) {
        return Pi * Math.pow(radius, 2);
    }
}
