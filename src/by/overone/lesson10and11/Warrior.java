package by.overone.lesson10and11;

public class Warrior extends Hero {

    private int health;

    public Warrior(String name, int health) {
        this.health = health;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        System.out.println("Hero dodged blows, damage reduced");
        health = health - damage / 2;
        System.out.println(health + " The hero has health left");
    }

    public void healthStatus() {
        if (health <= 0) {
            System.out.println("The hero died");
        } else System.out.println("Health level " + health);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("The Warrior attacks the enemy and deals damage ");
        enemy.takeDamage(25);

    }
}

