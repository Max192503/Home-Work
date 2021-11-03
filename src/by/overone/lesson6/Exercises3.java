package by.overone.lesson6;

import java.util.Random;

public class Exercises3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[11];
        int num = 0;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(3) - 1;
            System.out.print(array[i] + " ");
            switch (array[i]) {
                case 1:
                    num++;
                    break;
                case 0:
                    num1++;
                    break;
                default:
                    num2++;
            }
        }
        System.out.println();
        if (num > num1 && num > num2) {
            System.out.print("More common 1 ");
        } else if (num1 > num && num1 > num2) {
            System.out.print("More common 0 ");
        } else if (num2 > num1 && num2 > num) {
            System.out.print("More common -1 ");
        }
    }
}
