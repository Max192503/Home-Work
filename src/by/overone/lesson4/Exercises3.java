package by.overone.lesson4;

import java.util.Random;

public class Exercises3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        boolean ascending = true;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1]) {
                ascending = false;
            }
        }
        if (ascending) {
            System.out.println(" Ascending sequence");
        } else {
            System.out.println("Non ascending sequence");
        }
    }
}
