package by.overone.lesson15;

public class Task6 {
    public static void main(String[] args) {
        String str = "JJJjjaavvvvvvvvvvvaa";
        str = str.replaceAll("([a-zA-Z])\\1+", "$1");
        System.out.println(str);
    }
}

