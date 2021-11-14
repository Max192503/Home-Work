package by.overone.lesson20;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> grade = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            grade.add(random.nextInt(10) + 1);
        }
        System.out.println(grade);

        Iterator<Integer> iterator = grade.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 4) {
                iterator.remove();
            }
        }
        System.out.println(grade);

        iterator = grade.iterator();
        int temp;
        int maxRating = 0;
        while (iterator.hasNext()) {
            temp = iterator.next();
            if (temp >= maxRating) {
                maxRating = temp;
            }
        }
        System.out.println(maxRating);

        Collections.reverse(grade);
        System.out.println(grade);

        ListIterator iterator1 = grade.listIterator(grade.size());
        while (iterator1.hasPrevious()) {
            System.out.println(iterator1.previous());
        }
    }
}
