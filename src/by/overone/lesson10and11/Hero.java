package by.overone.lesson10and11;

public abstract class Hero {

    protected String name;
    protected int health;


    public String getName() {
        return name;
    }

    public void healthStatus() {
        if (health <= 0) {
            System.out.println("The hero died");
        } else System.out.println("Health level " + health);
    }

    public abstract void attackEnemy(Enemy enemy);
}
