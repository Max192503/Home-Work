package by.overone.lesson22;

public abstract class Car {

    private String brand;
    private String model;
    private String vinNumber;
    private int yearOfIssue;
    private String carBody;

    public Car(String brand, String model, String vinNumber, int yearOfIssue, String carBody) {
        this.brand = brand;
        this.model = model;
        this.vinNumber = vinNumber;
        this.yearOfIssue = yearOfIssue;
        this.carBody = carBody;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCarBody() {
        return carBody;
    }
}

