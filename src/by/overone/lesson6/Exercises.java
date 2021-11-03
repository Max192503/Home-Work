package by.overone.lesson6;


public class Exercises {
    public static void main(String[] args) {

        int n = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                n++;
            }
        }
        int[] array = new int[n];
        for (int j = 0, a = 0; j <= 99; j++) {
            if (j % 2 != 0) {
                array[a] = j;
                System.out.print(array[a] + " ");
                a++;
            }
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}