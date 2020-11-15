package ru.netology2_1.task_1;

import java.util.Scanner;

public class Main {

    private static String[] products;
    private static int[] prices;
    private static int[] cart; // для хранения истории ввода количества
    private static int total;

    public static void main(String[] args) {

        setProductsPrices();
        setCart();
        printAvailableProducts();
        fillCart();
        printCart();
    }

    private static void printAvailableProducts() {
        System.out.println("Список возможных товаров для покупки:");
        int i = 1;
        for (String product : products) {
            System.out.println(String.format("%d. %s - %d руб.", i, product, prices[i-1]));
            i++;
        }
    }

    private static void setProductsPrices() {
        products = new String[]{"Бананы", "Кокосы", "Апельсины"};
        prices = new int[]{50, 1000, 250};
    }

    private static void setCart() {
        cart = new int[products.length];  // для хранения истории ввода количества
    }

    private static void fillCart() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            input = scanner.nextLine();
            if (input.equals("end")) {
                break; // пользователь  закончил покупки
            }
            String[] parts = input.split(" ");
            int currentProduct = Integer.parseInt(parts[0]);
            int currentPrice = prices[Integer.parseInt(parts[0]) - 1];
            int currentQuantity = Integer.parseInt(parts[1]);
            if (currentQuantity == 0) {
                cart[currentProduct - 1] = 0;
            } else {
                cart[currentProduct - 1] += currentQuantity;
            }
            total += currentPrice * currentQuantity;
        }
    }

    private static void printCart() {
        System.out.println("Ваша корзина");
        System.out.println("Наименование товара" + '\t' + "Количество" + '\t' + "Цена/за.ед" + '\t' + "Общая стоимость");
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == 0) {
                continue;
            }
            System.out.println(String.format("%s \t %d \t %d \t %d", products[i], cart[i], prices[i], prices[i] * cart[i]));
        }
        System.out.println(String.format("Итого: %d", total));
    }

}
