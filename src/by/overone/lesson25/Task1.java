package by.overone.lesson25;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String variable=null;
        try {
            variable.toUpperCase(Locale.ROOT);
        } catch (NullPointerException exception){
            System.out.println("Initialize a variable");
        }
    }
}
