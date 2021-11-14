package by.overone.lesson20;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orang");
        fruits.add("Banan");
        fruits.add("Apple");
        System.out.println(fruits);
        Iterator<String> iterator = fruits.iterator();
          while (iterator.hasNext()){
              System.out.println(iterator.next());
              iterator.remove();
              System.out.println(fruits);
          }
            }
        }

