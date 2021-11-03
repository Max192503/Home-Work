package by.overone.lessons10and11;

public class Dracula extends Enemy {

    public Dracula(int health) {
        super(health);
    }

    public void attackHero(Warrior warrior) {
        System.out.println("\n" + "Dracula attacks");
        warrior.takeDamage(40);
        setHealth(getHealth() + 20);
        System.out.println("\n" + "Dracula drinks blood, health replenishment " + getHealth());
    }

}
