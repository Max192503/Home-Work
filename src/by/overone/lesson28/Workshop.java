package by.overone.lesson28;

public class Workshop {
    public static void main(String[] args) throws InterruptedException {

        Factory factory = new Factory();
        Minion minion = new Minion();
        Dump dump = new Dump();
        Scientist scientist = new Scientist();
        Night night = new Night();
        for (int i = 0; i < 20; i++) {
            dump.dump(factory);
        }
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(() -> night.afterTheNight(factory, minion, dump));
            thread.start();
            Thread.sleep(100);
            scientist.transferOfParts(minion);
            scientist.assemblingTheRobot(scientist.getRobotDetails());
        }
        System.out.println("Collected robots" + scientist.getCollectedRobots());

    }
}
