package by.overone.lesson20;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>();
        country.add("America");
        country.add("Russia");
        country.add("Mexico");
        System.out.println(country);
        country.set(1,"Belarus") ;
        System.out.println(country);
        country.remove(1);
        System.out.println(country);
        country.remove("Mexico");
        System.out.println(country);
        System.out.println(country.indexOf("America"));
        System.out.println(country.contains("America"));
    }
}
