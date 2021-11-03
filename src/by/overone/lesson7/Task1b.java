package by.overone.lesson7;

import java.util.Random;

public class Task1b {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 7;
        int[] array = new int[num];
        int[] array1 = new int[num];
        System.out.println("Array");
        for (int i = 0; i < num; i++) {
            array[i] = random.nextInt(8);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array1");
        for (int i = 0; i < num; i++) {
            array1[i] = random.nextInt(8);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < num; i++) {
            if (array[i] != array1[i]) {
                System.out.println("Two arrays are not equal");
                break;
            } else {
                System.out.println("Two arrays are equal");
            }

        }
    }
}
 