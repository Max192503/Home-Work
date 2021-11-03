package by.overone.lesson3;

public class Exercise3 {
    public static void main(String[] args) {
        int min = 39;
        if (min >= 0 && min <= 14) {
            System.out.println("Попадет в первую четверть");
        } else if (min >= 15 && min <= 29) {
            System.out.println("Попадает в вторую четверть");
        } else if (min >= 30 && min <= 44) {
            System.out.println("Попадает в третью четверть ");
        } else if (min >= 45 && min <= 59) {
            System.out.println("Попадает в четвертую четверть");
        }
    }
}
