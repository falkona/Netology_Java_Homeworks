package ru.netology1_4;

import java.util.Scanner;

public class Main2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = "";
        while (true) {
            System.out.println("Введите ASCII код (end для вывода результата):");
            String octalString = scanner.nextLine();
            if (octalString.equals("end")) {
                break;
            }
            input += (char) Integer.parseInt(octalString,8);
        }
        System.out.println(input);
    }
}
