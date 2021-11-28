package by.overone.lesson27work;

import java.io.*;

public class task1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Dog dog= new Dog("tyzik");

        FileOutputStream fileOutputStream =new FileOutputStream("1.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(dog);
        outputStream.close();

        FileInputStream fileInputStream = new FileInputStream("1.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Dog dog1 = (Dog) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(dog);
    }
}
