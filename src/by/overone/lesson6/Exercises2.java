package by.overone.lesson6;

import java.util.Random;

public class Exercises2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                array[j] = 0;
            }
            System.out.print(array[j] + " ");
        }
    }
}
