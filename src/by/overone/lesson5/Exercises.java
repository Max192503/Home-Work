package by.overone.lesson5;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int num = scanner.nextInt();
        int[] a = new int[num];
        System.out.println("Enter natural numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter number");
        int num1 = scanner.nextInt();
        int num2 = 0;
        for (int i = 0; i < a.length; i++) {
            int num3 = a[i];
            if (num3 % num1 == 0) {
                num2 += num3;
            }
        }
        System.out.println(num2);
    }
}