package by.overone.lesson21;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercise {

    // Задание 1

    public static int countUnique(ArrayList<Integer> integers) {
        HashSet<Integer> mySet = new HashSet<>();
        for (int x : integers) {
            mySet.add(x);
        }
        return mySet.size();
    }

    //Задание 2

    public static String words(ArrayList<String> strings) {
        HashSet<String> word = new HashSet<>();
        for (String s : strings) {
            word.add(s);
        }
        return String.valueOf(word);
    }
}
