package by.overone.lesson28;

public class Night extends Thread {

    public void afterTheNight(Factory factory, Minion minion, Dump dump) {
        int random = (int) (1 + Math.random() * 4);
        for (int i = 0; i < random; i++) {
            Thread thread = new Thread(() -> factory.throwAway());
            thread.start();
            Thread thread1 = new Thread(() -> minion.sparePartsCollection(dump));
            thread1.start();
            dump.dump(factory);
        }

    }

}

