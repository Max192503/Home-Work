package by.overone.lesson5;

public class Exercises2 {
    public static void main(String[] args) {
        int[] array = {5, 4, 6, 8, 2};
        int num = 0;
        int num1 = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            array[i] = array[num1];
            array[num1] = num;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

