package by.overone.lesson19;

public class MesUtil  {

    public static <T extends Number> Number sum (Mes<T> number) {
        T num = number.getNum();
        T num1 = number.getNum1();
        if (num instanceof Integer) {
            return num.intValue() + num1.intValue();
        } else if (num instanceof Double) {
            return num.doubleValue() + num1.doubleValue();
        }
        else {
            return num.floatValue()+num1.floatValue();
        }
    }
}
