package ru.netology1_5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int begin = 999;
        int end = 999;
        System.out.println("Введите название задачи и время на ее выполнение:");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d+");
        int startPos = input.indexOf("начинается в");
        String substr = input.substring(startPos);
        Matcher matcher = pattern.matcher(substr);
        while (matcher.find()) {
            int searchResult = Integer.parseInt(substr.substring(matcher.start(), matcher.end()));
            if (begin == 999) {
                begin = searchResult;
            } else {
                end = searchResult;
            }
        }
        if (isTimeCorrect(begin, end)) {
            System.out.println(String.format("На задачу потребуется: %d ч.", end - begin));
        } else {
            System.out.println(String.format("Формат введенных данных неверный"));
        }
    }

    private static boolean isTimeCorrect(int begin, int end) {
        if (begin < 0 || begin > 25) return false;
        if (end < 0 || end > 25) return false;
        return begin <= end;
    }
}
