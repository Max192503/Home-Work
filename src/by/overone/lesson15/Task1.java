package by.overone.lesson15;

import java.time.ZonedDateTime;

public class Task1 {
    public static void main(String[] args) {

        String str = " Hello World ";
        String str1 = " Hello Java ";
        long before = ZonedDateTime.now().toInstant().toEpochMilli();
        for (int i = 0; i < 10000; i++) {
            str += str1;
            System.out.println(str);
        }
        long after = ZonedDateTime.now().toInstant().toEpochMilli();


        StringBuilder stringBuilder = new StringBuilder(str);
        long before1 = ZonedDateTime.now().toInstant().toEpochMilli();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(str1);
            System.out.println(stringBuilder);
        }
        long after1 = ZonedDateTime.now().toInstant().toEpochMilli();
        long time = after - before;
        long time1 = after1 - before;

        if (time < time1) {
            System.out.println(" Addition operator is faster than method ");
        } else if (time > time1) {
            System.out.println(" The method is faster than the tracking operator ");
        } else {
            System.out.println(" Same execution time for the method\n " +
                    " and the addition operator ");
        }
        System.out.println(" Run-time addition operator " + time);
        System.out.println(" Method execution time " + time1);
    }
}

