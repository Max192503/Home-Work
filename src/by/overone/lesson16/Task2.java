package by.overone.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String str = "My phone number +375552356849 MTS";
        Pattern pattern = Pattern.compile("(\\+*)\\d{12}");
        Matcher matcher = pattern.matcher(str);
        matcher.find();
        System.out.println(matcher.group());
        String str2 = matcher.group();
        StringBuilder stringBuilder = new StringBuilder(str2);
        stringBuilder.insert(4, "(");
        stringBuilder.insert(7, ")");
        System.out.println(stringBuilder);
    }
}
