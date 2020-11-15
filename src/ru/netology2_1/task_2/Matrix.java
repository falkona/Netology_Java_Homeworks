package ru.netology2_1.task_2;

import java.util.Arrays;
import java.util.Random;

public class Matrix {

    private int[][] colors;
    private int size;

    public Matrix(int SIZE, boolean fill) {

        this.size = SIZE;
        this.colors = new int[this.size][this.size];

        if (fill) {
            fillRandom();
        }

    }

    public int[][] getColors() {
        return this.colors;
    }

    public Matrix rotate(int angle) {

        Matrix rotatedMatrix = new Matrix(this.size, false);
        int[][] initColors = Arrays.copyOf(this.colors, this.colors.length); // копируем оригинальный массив, чтобы дальше работать с копией

        int rotationCounter = angle / 90; // считаем, сколько раз надо повернуть

        for (int c = 1; c <= rotationCounter; c++) {

            rotatedMatrix.colors = new int[this.size][this.size]; // очищаем массив в конечном объекте

            // первая строка исходной матрицы = последний столбец повернутой матрицы
            for (int i = 0; i < this.size; i++) {
                for (int j = 0; j < this.size; j++) {
                    int value = initColors[i][j]; // получили значение текущей ячейки
                    rotatedMatrix.colors[j][this.size - 1 - i] = value; // присвоили значение повернутой матрице
                }
            }

            initColors = Arrays.copyOf(rotatedMatrix.colors, rotatedMatrix.colors.length); // скопировали получившийся повернутый массив

        }

        return rotatedMatrix;
    }

    public void print() {

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", this.colors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    public void fillRandom() {

        Random random = new Random();
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                this.colors[i][j] = random.nextInt(256);
            }
        }
    }

}

