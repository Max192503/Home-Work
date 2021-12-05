package by.overone.lesson28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Scientist {

    private int collectedRobots;

    private HashSet<RobotDetails> robot = new HashSet<>();

    private List<RobotDetails> robotDetails = new ArrayList<>();

    public List<RobotDetails> getRobotDetails() {
        return robotDetails;
    }

    public int getCollectedRobots() {
        return collectedRobots;
    }

    public void transferOfParts(Minion minion) {
        for (int i = minion.getSpareParts().size() - 1; i >= 0; i--) {
            robotDetails.add(minion.getSpareParts().get(i));
            minion.getSpareParts().remove(i);
        }
    }

    public void assemblingTheRobot(List<RobotDetails> robotDetails) {
        for (int i = robotDetails.size() - 1; i >= 0; i--)
            if (robot.add(robotDetails.get(i))) {
                robotDetails.remove(i);
            }
        if (robot.size() != 9) {
        } else {
            collectedRobots++;
            robot = new HashSet<>();
        }
    }


}
