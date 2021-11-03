package by.overone.lesson4;

import java.util.Random;

public class Exercises2 {
    public static void main(String[] args) {
        double[] array = new double[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble();
        }
        double max = array[0];
        double min = array[0];
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            mean += array[i] / array.length;
        }
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        System.out.println("mean=" + mean);
    }
}
