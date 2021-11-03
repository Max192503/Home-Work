package by.overone.lessons10and11;


public class BattleGround {
    public static void main(String[] args) {

        Enemy enemy = new Enemy(100);
        Dracula dracula = new Dracula(100);
        Warrior warrior = new Warrior("Warrior", 100);
        Mage mage = new Mage("Mage", 100);

        while (enemy.getHealth() >= 0 && warrior.getHealth() > 0 && dracula.getHealth() > 0) {

            System.out.println("\n" + warrior.getName() + " " + warrior.getHealth() + " health");
            warrior.attackEnemy(enemy);
            enemy.attackHero(warrior);

            if (enemy.getHealth() <= 0) {
                enemy.isAlive();
                break;
            } else if (warrior.getHealth() <= 0) {
                warrior.healthStatus();
                break;
            }

            System.out.println("\n" + warrior.getName() + " " + warrior.getHealth() + " health");
            warrior.attackEnemy(dracula);
            dracula.attackHero(warrior);

            if (warrior.getHealth() <= 0) {
                warrior.healthStatus();
                break;
            } else if (dracula.getHealth() <= 0) {
                dracula.isAlive();
                break;
            }
            if (mage.health > 0) {
                mage.treatment(warrior);
                enemy.attackMage(mage);
                dracula.attackMage(mage);

                if (mage.getHealth() <= 0) {
                    System.out.println("Mage dead");
                }
            }
        }
    }
}




