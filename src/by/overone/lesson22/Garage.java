package by.overone.lesson22;

import java.util.HashMap;

public class Garage {

    HashMap<Car, Integer> garage = new HashMap();

    public void parking(Car car, int a) {
        if (garage.containsKey(car)) {
            garage.replace(car, garage.get(car) + a);
        } else {
            garage.put(car, a);
        }
        System.out.println(a + " " + car.getBrand() + " " + car.getModel() + " parked");
    }

    public void checkOut(Car car, int a) {

        if (garage.containsKey(car)) {
            garage.replace(car, garage.get(car) - a);
            if (garage.get(car) <= 0) {
                System.out.println("There are not so many cars in the garage");
            } else {
                System.out.println(a + " " + car.getBrand() + " " + car.getModel() + " set out");
            }
        } else {
            garage.replace(car, 0);
        }
    }

    public void amount(String car) {
        int amountCar = 0;
        for (HashMap.Entry<Car, Integer> item : garage.entrySet()) {
            if (item.getKey().getBrand().equals(car)) {
                amountCar += item.getValue();
                if (amountCar <= 0) {
                    amountCar = 0;
                }
            }
        }
        System.out.println("in garage " + amountCar + " " + car);
    }
}
