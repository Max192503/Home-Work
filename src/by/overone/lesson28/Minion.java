package by.overone.lesson28;

import java.util.ArrayList;
import java.util.List;

public class Minion extends Thread {

    private List<RobotDetails> spareParts = new ArrayList<>();

    public List<RobotDetails> getSpareParts() {
        return spareParts;
    }


    public void sparePartsCollection(Dump dump) {
        int random = (int) (1 + Math.random() * 4);
        for (int i = 0; i < random; i++) {
            int random1 = (int) (Math.random() * dump.getListDetails().size());
            if (dump.getListDetails().size() == 0) {
            } else {
                spareParts.add(dump.getListDetails().get(random1));
                dump.getListDetails().remove(random1);
            }
        }
    }
}
