package by.overone.lesson8;

public class Point {

    private double coordinatesX;
    private double coordinatesY;

    public double getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(double coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public double getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(double coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public double distance() {
        return Math.sqrt(coordinatesX * coordinatesX + coordinatesY * coordinatesY);
    }
}

