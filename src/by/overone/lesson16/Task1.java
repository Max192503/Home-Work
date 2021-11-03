package by.overone.lesson16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z]\\w+(\\.com|\\.org)");
        String str = "hkij7889kfbg_fkk.org";
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
    }
}
