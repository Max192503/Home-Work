package by.overone.lesson8;

import java.util.Scanner;

public class Time1 {
    public static void main(String[] args) {
        Time time = new Time();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hours");
        time.setHour(scanner.nextInt());

        System.out.println("Enter minutes");
        time.setMinutes(scanner.nextInt());

        System.out.println("Enter seconds");
        time.setSecond(scanner.nextInt());

        System.out.println("Your time " + time.getHour() + "h:" + time.getMinutes() + "m:" + time.getSecond() +
                "s in second it " + time.justSecond());
    }
}
