package by.overone.lessons18;

public class Solution<T extends Number> extends ClassForGenerics implements InterfaceForGenerics {
    T num;

    public Solution() {
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public static <T extends Number> Number multiply(Solution<T> number) {
        T num =  number.getNum();
        if (num instanceof Integer) {
            return num.intValue() * 2;
        } else if (num instanceof Double) {
            return num.doubleValue() * 2;
        } else {
            return num.floatValue() * 2;
        }
    }
}
