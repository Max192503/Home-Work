package by.overone.lesson5;

import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите сумму денег");
        int money = scanner.nextInt();
        if (money % 10 == 1 && money != 11) {
            System.out.println(money + "Рубль");
        } else if (money > 11 && money < 15) {
            System.out.println(money + "Рублей");
        } else if (money % 10 >= 2 && money % 10 <= 4) {
            System.out.println(money + "Рубля");
        } else {
            System.out.println(money + "Рублей");
        }
    }
}
