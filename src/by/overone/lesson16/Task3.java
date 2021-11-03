package by.overone.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(([0-1]?|[2-9]\\d|1\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}"
                + "([0-1]?|[2-9]\\d|1\\d\\d?|2[0-4]\\d|25[0-5])$");
        String str = "241.99.255.68";
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
    }
}
