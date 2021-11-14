package by.overone.lesson10and11;

public class Mage extends Hero {

    public Mage(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        health = health - damage;
        System.out.println(health + " The hero has health left");
    }

    public int getHealth() {
        return health;
    }

    public void healthStatus() {
        if (health <= 0) {
            System.out.println("The hero died");
        } else System.out.println("Health level " + health);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("The Mage attacks the enemy and deals damage");
        enemy.takeDamage(10);

    }

    public void treatment(Warrior warrior) {
        warrior.setHealth(health + 25);
        System.out.println("Еhe wizard heals the hero " + warrior.getHealth());
    }

}
