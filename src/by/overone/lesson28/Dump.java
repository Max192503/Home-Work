package by.overone.lesson28;

import java.util.ArrayList;
import java.util.List;

public class Dump {

    private List<RobotDetails> listDetails = new ArrayList<>();

    public List<RobotDetails> getListDetails() {
        return listDetails;
    }

    public void dump(Factory factory) {
        listDetails.add(factory.throwAway());
    }

}


