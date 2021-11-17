package by.overone.lesson25;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("This index does not exist in the array");
        }
    }
}
