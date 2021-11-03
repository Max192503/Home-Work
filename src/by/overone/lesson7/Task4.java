package by.overone.lesson7;

public class Task4 {
    public static void main(String[] args) {
        int num = 0;
        int num1 = 1;
        int amt = 20;
        for (int i = 0; i <= amt; i++) {
            if (i % 2 == 0) {
                System.out.println(num + " total ");
                num += num1;
            } else {
                System.out.println(num1 + " total ");
                num1 += num;
            }

        }
    }
}
