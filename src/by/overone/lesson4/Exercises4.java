package by.overone.lesson4;

public class Exercises4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            boolean ask = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    ask = false;
                    break;
                }

            }
            if (ask)
                System.out.println("Prime number=" + i);

        }
    }
}
