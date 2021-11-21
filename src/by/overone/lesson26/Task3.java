package by.overone.lesson26;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        FileReader fileRead = new FileReader("1.txt");
        StringBuilder text2 = new StringBuilder();
        int symbol;
        while ((symbol = fileRead.read()) != -1) {
            text2.append((char) symbol);
        }
        fileRead.close();
        String text = new String(text2);
        List<String> list = new ArrayList<>();
        for (String line : text.split("[^a-zA-Z0-9]")) {
            list.add(line);
        }
        StringBuilder text1 = new StringBuilder();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).charAt(list.get(i).length() - 1) == list.get(i + 1).charAt(0)) {
                text1.append(list.get(i)).append(" ");
            }
        }
        System.out.println(text1);
    }
}

