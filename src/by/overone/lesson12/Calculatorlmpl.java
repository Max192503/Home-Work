package by.overone.lesson12;

public class Calculatorlmpl implements Calculator {

    int a;
    int b;


    public Calculatorlmpl(int a, int b) {
        this.b = b;
        this.a = a;
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double divide(double a, int b) {
        return a / b;
    }

    @Override
    public double multiply(int a, int b) {
        return a * b;
    }
}
