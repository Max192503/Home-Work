package by.overone.lesson7;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 8;
        int[] array = new int[num];
        boolean flag = false;
        int num1 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    num1 = array[i];
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print("\n" + num1 + " leader ");
                flag = false;
            }
        }
        System.out.println("\n" + array[array.length - 1] + " leader ");
    }
}