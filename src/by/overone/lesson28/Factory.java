package by.overone.lesson28;

public class Factory extends Thread {

    private Object Details;

    public void setDetails(Object details) {
        Details = details;
    }

    public RobotDetails throwAway() {
        int random = (int) (Math.random() * 9);
        switch (random) {
            case (0):
                setDetails(RobotDetails.HEAD);
                break;
            case (1):
                setDetails(RobotDetails.BODY);
                break;
            case (2):
                setDetails(RobotDetails.CPU);
                break;
            case (3):
                setDetails(RobotDetails.HDD);
                break;
            case (4):
                setDetails(RobotDetails.RAM);
                break;
            case (5):
                setDetails(RobotDetails.LEFT_HAND);
                break;
            case (6):
                setDetails(RobotDetails.RIGHT_HAND);
                break;
            case (7):
                setDetails(RobotDetails.LEFT_LEG);
                break;
            case (8):
                setDetails(RobotDetails.RIGHT_LEG);
                break;
        }
        return (RobotDetails) Details;
    }
}

