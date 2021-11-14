package by.overone.lesson22;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Unique {

    public static boolean isUnique(Map<String, String> unique) {

        Set<String> set = new HashSet<String>();
        for (Map.Entry<String, String> value : unique.entrySet()) {
            set.add(value.getValue());
        }
        System.out.println(set);
        if (set.size() == unique.size()) {
            return true;
        } else {
            return false;
        }
    }
}

