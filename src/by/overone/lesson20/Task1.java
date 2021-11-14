package by.overone.lesson20;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> country = new LinkedList<>();
        country.addFirst("RB");
        country.addFirst("USA");
        country.addFirst("RUS");
        country.addLast("TUR");
        country.addLast("G");
        country.addLast("SL");
        country.addLast("LV");
        System.out.println(country);
        country.removeFirst();
        country.removeLast();
        System.out.println(country);
        System.out.println(country.getFirst());
        System.out.println(country.getLast());
        System.out.println(country.get(2));
    }
}
