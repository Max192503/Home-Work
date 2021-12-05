package by.overone.lesson27;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    public static void main(String[] args) {

        System.out.println("Task1");
        IShape iShape = a -> a * a;
        double squareArea = iShape.getSquare(3.4);
        System.out.println(squareArea);
        IShape iShape1 = a -> Math.sqrt(2 * (a * a));
        double sqyareDiogonal = iShape1.getSquare(2);
        System.out.println(sqyareDiogonal);

        System.out.println("Task2");
        Task2 task2 = (a, b) -> {
            if (a < b) {
                System.out.println(a);
            } else if (b < a) {
                System.out.println(b);
            } else {
                System.out.println(0);
            }
        };
        task2.task2(2, 3);

        System.out.println("Task3");
        String[] str01 = {"xxx", "XXdf", "dfkXX", "dlgf", "XXlrs"};
        Pattern pattern2 = Pattern.compile("^XX");
        Arrays.stream(str01)
                .filter(pattern2.asPredicate()).forEach(System.out::println);

        System.out.println("Task4");
        Integer[] num = {1, -3, 4, -6, 0, 67, -98};
        Predicate<Integer> positiveNumber = x -> x > 0;
        for (Integer integer : num) {
            if (positiveNumber.test(integer)) {
                System.out.print(integer + ",");
            }
        }

        System.out.println("\nTask5");
        Integer[] num2 = {1, 3, 4, 6, 8, 67, 98};
        UnaryOperator<Integer> squareNumber = x -> x * x;
        for (Integer integer : num2) {
            System.out.print(squareNumber.apply(integer) + ",");
        }
        System.out.println();
        List<String> list = new ArrayList<>();
        list.add(" Hello");
        list.add(" Java");
        list.add(" Hello");
        list.add(" Word");
        BinaryOperator<String> phrase = (a, b) -> a + b;
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(phrase.apply(list.get(i), list.get(i + 1)) + ",");
        }

        System.out.println("\nTask6");
        Function<String, Double> dollarExchange = string -> {
            StringBuilder stringBuilder = new StringBuilder();
            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                stringBuilder.append(matcher.group());
            }
            String d = new String(stringBuilder);
            Double aDouble = Double.valueOf(d);
            System.out.println(aDouble / 2.5 + " $");
            return aDouble;
        };
        dollarExchange.apply("BYN 10");
        dollarExchange.apply("100 BYN");

        System.out.println("Task7");
        Consumer<String> euroExchange = string1 -> {
            StringBuilder stringBuilder = new StringBuilder();
            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(string1);
            while (matcher.find()) {
                stringBuilder.append(matcher.group());
            }
            String d = new String(stringBuilder);
            Double aDouble = Double.valueOf(d);
            System.out.println(aDouble / 2.8 + " EURO");
        };
        euroExchange.accept("280 BYN");
        euroExchange.accept("BYN 140");

        System.out.println("Task8");
        Supplier<String> str = () -> {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            StringBuilder str1 = new StringBuilder();
            for (int i = string.length() - 1; i >= 0; i--) {
                str1.append(string.charAt(i));
            }
            return String.valueOf(str1);
        };
        System.out.println(str.get());

        System.out.println("Task9");
        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("sdaa");
        strings.add("aaaalkd");
        strings.add("kfld");
        Pattern pattern = Pattern.compile("^aa");
        strings.stream().filter(pattern.asPredicate()).forEach(System.out::println);

        System.out.println("Task10");
        Tester tester = new Tester(2, "ddi");
        Tester tester1 = new Tester(4, "fghj");
        Tester tester2 = new Tester(3, "ddbhjj");
        Tester tester3 = new Tester(5, "ddpoi");
        List<Tester> testers = new ArrayList<>();
        testers.add(tester);
        testers.add(tester1);
        testers.add(tester2);
        testers.add(tester3);
        Pattern pattern1 = Pattern.compile("^dd");
        testers.stream()
                .filter(id -> id.getId() > 3)
                .map(name -> name.getName())
                .filter(pattern1.asPredicate())
                .forEach(System.out::println);

        System.out.println("Task11");
        testers.stream().map(name -> name.getName()).forEach(System.out::println);
    }
}