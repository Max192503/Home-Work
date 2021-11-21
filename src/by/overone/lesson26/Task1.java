package by.overone.lesson26;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {

        FileReader fileRed = new FileReader("1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileRed);
        StringBuilder text = new StringBuilder();
        for (String line = ""; line != null; line = bufferedReader.readLine()) {
            text.append(line).append("\n");
        }
        fileRed.close();
        System.out.println(text);
    }
}
