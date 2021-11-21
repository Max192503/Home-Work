package by.overone.lesson25work;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)throws IOException {
        Scanner scanner =new Scanner(System.in);
        byte[] baffer = scanner.nextLine().getBytes();
        OutputStream outputStream = new FileOutputStream("1.txt");
        outputStream.write(baffer,0,baffer.length);
        outputStream.close();

        InputStream inputStream = new FileInputStream("1.txt");
        StringBuilder text = new StringBuilder();
        int i;
        while ((i=inputStream.read())!=-1){
           text.append((char) i);

        }
        inputStream.close();
        System.out.println(text);
        }

    }

