package by.overone.lesson21;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> num = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            num.add(random.nextInt(10) + 1);
        }
        System.out.println(num);
        System.out.println(Exercise.countUnique(num));


        ArrayList<String> words = new ArrayList<>();
        words.add("Aa");
        words.add("ww");
        words.add("ii");
        words.add("rr");
        words.add("ww");
        words.add("dd");
        words.add("rr");
        System.out.println( Exercise.words(words));
    }
}
