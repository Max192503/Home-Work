package by.overone.lesson5;

import java.util.Random;

public class Work1 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 5;
        int negative = 0;
        int positive = 0;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
            if (array[i] < 0) {
                negative += 1;
            } else if (array[i] > 0) {
                positive += 1;
            }
        }
        int zero = array.length - negative - positive;

        System.out.println("Positive " + positive);
        System.out.println("Negative " + negative);
        System.out.println("Zero " + zero);
    }
}
