package by.overone.lesson6;

public class Sdf {
    public static void main(String[] args)
            throws java.io.IOException {
        char b = 'g';
        char hy ,d;
        do {
            System.out.println("Задуманая буква в диапозоне a=z;");
            System.out.println("ведите букву");
            hy = (char) System.in.read();
            do {
                 d=(char) System.in.read();
            }   while (d!='\n') ;
            if (hy == b) {
                System.out.println("Правильно");
            } else {
                System.out.println("Нужна другая буква");
                if (hy > b) {
                    System.out.println("Буква ближе к концу ");
                } else
                        System.out.println("Буква ближе к началу");
                System.out.println("повторите попытку ");
            }
        }while (hy!=b);

    }
}