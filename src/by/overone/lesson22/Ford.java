package by.overone.lesson22;

public class Ford extends Car {

    public Ford(String brand, String model, String vinNumber, int yearOfIssue, String carBody) {
        super(brand, model, vinNumber, yearOfIssue, carBody);
    }

    @Override
    public String toString() {
        return "Ford{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
