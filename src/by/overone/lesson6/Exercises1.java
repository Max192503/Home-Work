package by.overone.lesson6;

import java.util.Random;

public class Exercises1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        int evenNum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0 && array[i] > 0) {
                evenNum++;
            }
        }
        System.out.println();
        System.out.print(evenNum);
    }
}
