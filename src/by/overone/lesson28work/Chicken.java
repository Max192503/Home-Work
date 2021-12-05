package by.overone.lesson28work;

public class Chicken extends Thread {
    public void run() {
        System.out.println("chicken");

    }

    public static void main(String[] args) throws InterruptedException {
        Chicken chicken = new Chicken();
        Thread egg1 = new Thread(new Egg());
        Thread egg2 = new Thread(new Egg());
        Thread egg3 = new Thread(new Egg());


        egg3.start();
        egg1.start();
        egg2.start();
        chicken.start();


    }


}

class Egg implements Runnable {

    @Override
    public void run() {
        System.out.println("egg");
    }
}