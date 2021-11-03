package by.overone.lesson4;

public class Exercises1 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int num = 0;
        int num1 = 0;
        while (num <= 99) {
            num1++;
            if (num1 % 13 == 0 || num1 % 17 == 0) {
                array[num] = num1;
                num++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
   }
}   