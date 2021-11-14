package by.overone.lesson22;

import java.util.HashMap;
import java.util.Map;

public class TestUnique {
    public static void main(String[] args) {
        Map<String,String> list =new HashMap<>();
        list.put("aaa","sss");
        list.put("ggg","hhh");
       list.put("aag","sss");
       list.put("ccc","fff");
        System.out.println(list);
        System.out.println(Unique.isUnique(list));

    }
}
