package by.overone.lesson15;

public class Task3 {
    public static void main(String[] args) {
        String str = "to be or not to be";
        String str1 = "to";
        boolean startSt = str.startsWith(str1);
        boolean endSt = str.endsWith(str1);
        System.out.println(startSt);
        System.out.println(endSt);
    }
}
