package by.overone.lesson7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 9;
        double sum = 0;
        double mean = 0;
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 1; i < array.length - 1; i++) {
            int temp = array[i];
            sum += temp;
        }
        mean = sum / (array.length - 2);
        System.out.println("\n" + " sum " + sum + "\n" + " average number " + mean);
    }
}
