package by.overone.lesson26;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        FileReader fileRead = new FileReader("1.txt");
        StringBuilder text = new StringBuilder();
        int symbol;
        while ((symbol = fileRead.read()) != -1) {
            text.append((char) symbol);
        }
        fileRead.close();
        String text1 = new String(text);
        List<String> list = new ArrayList<>();
        for (String line : text1.split("\n")) {
            for (String i : line.split(" ")) {
                if (i.substring(0, 1).matches("[AaEeUuIiOoYy]")) {
                    list.add(i);
                }
            }
        }
        System.out.println(list);
    }
}








