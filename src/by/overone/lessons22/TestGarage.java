package by.overone.lessons22;

import java.util.HashMap;
import java.util.Map;

public class TestGarage {
    public static void main(String[] args) {

        Ford ford = new Ford("Ford", "Mustang", "34656fghk543",
                2003, "cabriolet");
        Dodge dodge = new Dodge("Dodge", "Challenger", "234775ghhfr98876hj5",
                1977, "coupe");
        Pontiac pontiac = new Pontiac("Pontiac", "Bonneville", "2356jhg345687",
                1965, "sedan");
        Ford ford1 = new Ford("Ford", "Ranger", "sdfg87fgdfg7",
                2020, "pickup");

        Garage garage = new Garage();
        garage.parking(dodge, 1);
        garage.parking(ford, 1);
        garage.parking(ford1, 1);
        garage.parking(ford, 1);
        garage.amount("Ford");
        garage.checkOut(ford, 1);
        garage.amount("Dodge");
        garage.amount("Ford");
        garage.checkOut(dodge, 2);
        garage.amount("Dodge");
        garage.amount("Ford");
        garage.parking(dodge, 2);
    }
}
