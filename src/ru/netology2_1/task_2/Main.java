package ru.netology2_1.task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Matrix initialMatrix = new Matrix(8, true);

        System.out.println("Привет! Программа переворачивания матриц приветствует тебя! Я умею поворачивать матрицу по часовой стрелке на 90, 180 или 270 градусов");
        System.out.println("Исходная матрица: ");
        initialMatrix.print();

        System.out.println("На сколько повернуть? Введите угол поворота в градусах: 90 / 180 / 270");

        try {
            int angle = scanner.nextInt();
            if (angle % 90 == 0) {
                Matrix rotatedMatrix = initialMatrix.rotate(angle); // в качестве параметра передаем, на сколько поворачивать
                System.out.println();
                System.out.println("Готово!");
                rotatedMatrix.print();
            } else {
                System.out.println("Введено неверное число");
            }
        } catch (Exception e) {
            System.out.println("Введено неверное значение");
        }

    }



}

