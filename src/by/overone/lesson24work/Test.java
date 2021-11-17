package by.overone.lesson24work;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Syper.values()));

        Scanner scanner=new Scanner(System.in);
         String hero = scanner.nextLine();
         Syper syper1=Syper.valueOf(hero.toUpperCase(Locale.ROOT));
        System.out.println(syper1.getPower());
        
    }
}
