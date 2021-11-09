package by.overone.lessons22work;

import java.util.HashMap;

public class Lessons22 {
    public static void main(String[] args) {


        HashMap<Integer, String> countr = new HashMap<>();
        countr.put(1, "Russia");
        countr.put(2, "Belatys");
        countr.put(3, "Germani");
        countr.put(4, "polsha");
        countr.put(5, "Latvia");
        System.out.println(countr);
        countr.remove(1);
        countr.remove(3);
        countr.remove(5);
        System.out.println(countr);
        System.out.println(countr.containsKey(2));
        System.out.println(countr.keySet());
        System.out.println(countr.get(4));
        System.out.println(countr.values());
    }

}
