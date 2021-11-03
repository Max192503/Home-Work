package by.overone.lessons10and11;

public class Enemy implements Mortal {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health = health - damage;
        System.out.println(health + " Health remained at the enemy");
    }

    public void attackHero(Warrior warrior) {
        System.out.println("\n" + "Enemy attacks");
        warrior.takeDamage(40);
    }

    public void attackMage(Mage mage) {
        System.out.println("\n" + "Enemy attacks");
        mage.takeDamage(30);
    }


    @Override
    public void isAlive() {
        if (this.health > 0) {
            System.out.println("\n" + "The enemy is alive");
        } else System.out.println("The enemy is dead");
    }
}
