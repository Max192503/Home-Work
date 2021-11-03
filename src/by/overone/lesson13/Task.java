package by.overone.lesson13;

import java.math.BigDecimal;

public class Task {

    Integer num;
    Double num1;

    public Task(Integer num, Double num1) {
        this.num = num;
        this.num1 = num1;
    }


    public void example(int num) {
        BigDecimal bigDecimal = new BigDecimal(num);
        BigDecimal result = bigDecimal.add(BigDecimal.valueOf(num1));
        System.out.println(result);
    }

    public void example(double num1) {
        BigDecimal bigDecimal = new BigDecimal(num);
        BigDecimal result = bigDecimal.subtract(BigDecimal.valueOf(num1));
        System.out.println(result);
    }

    public void example(int num, double num1) {
        BigDecimal bigDecimal = new BigDecimal(num);
        BigDecimal result = bigDecimal.divide(BigDecimal.valueOf(num1));
        System.out.println(result);
    }

    public void example() {
        BigDecimal bigDecimal = new BigDecimal(num);
        BigDecimal result = bigDecimal.multiply(BigDecimal.valueOf(num1));
        System.out.println(result);
    }

}