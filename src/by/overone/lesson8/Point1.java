package by.overone.lesson8;

import java.util.Scanner;

public class Point1 {
    public static void main(String[] args) {
        Point point = new Point();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates x ");
        point.setCoordinatesX(scanner.nextDouble());
        System.out.println("Initial coordinates x " + point.getCoordinatesX());

        System.out.println("Enter coordinates y ");
        point.setCoordinatesY(scanner.nextDouble());
        System.out.println("Initial coordinates y " + point.getCoordinatesY());

        System.out.println("Distance to coordinate " + point.distance());
    }
}