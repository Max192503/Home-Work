package by.overone.lesson5;

import java.util.Random;

public class Work2 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = 5;
        int max = 0;
        int temp = 0;
        int indexmax = 0;
        int indexmin = 0;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
            if (array[i] > array[indexmax]) {
                indexmax = i;
            } else if (array[i] < array[indexmin]) {
                indexmin = i;
            }
            temp = array[indexmax];
            array[indexmax] = array[indexmin];
            array[indexmin] = temp;
        }
        System.out.println(array[indexmax]);
        System.out.println(array[indexmin]);
        System.out.println(indexmax);
        System.out.println(indexmin);
    }
}
