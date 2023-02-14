package Beings;

import Items.Armour;
import Items.Useable;
import Items.Weapon;
import java.util.*;

public class Player {
    private int health;
    private int level;
    private long xp;
    private List<Useable> inventory = new ArrayList<>();
    public Weapon equippedWeapon;
    private Armour equippedArmour;

    public Player() {
        health = 100;
        level = 1;
        xp = 0;
        equippedWeapon = new Weapon();
        equippedArmour = new Armour();
    }

    public Armour getEquippedArmour() {
        return equippedArmour;
    }

    public void setEquippedArmour(Armour equippedArmour) {
        this.equippedArmour = equippedArmour;
    }

    public List<Useable> getInventory() {
        return inventory;
    }

    public void setInventory(List<Useable> inventory) {
        this.inventory = inventory;
    }

    public long getXp() {
        return xp;
    }

    public void setXp(long xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", level=" + level +
                ", xp=" + xp +
                ", inventory=" + inventory +
                ", equippedWeapon=" + equippedWeapon +
                ", equippedArmour=" + equippedArmour +
                '}';
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    /**
     * This is a terrible methord that doesnt fucking work and i really wish i knew how to program in java....
     * Its meant to take the attack by the player based on their equipped weapon and minus the damage from the health
     * of the current enemy It doesnt work
     * <p>
     * It works now, im happy.
     */
    public void attack(Enemy currentEnemy) {
        currentEnemy.takeDamage(equippedWeapon.getDamage());

    }

    /**
     * So this meathord gets the damage of the current enemy and defence stat of the current armour then minuses the
     * defence stat from the damage from the enemy
     * Fuck ive just noticed a error
     * What if the armour is better than the damage....
     * If statement time
     * @param currentEnemy this is the current enemy
     */
    public void takedamage(Enemy currentEnemy){
        if (currentEnemy.getDamage()>equippedArmour.getDamageReduction()) {
            health -= (currentEnemy.getDamage() - equippedArmour.getDamageReduction());
        }
    }
    public void action(Scanner in,Enemy currentEnemy){
        String ui = in.nextLine();
        switch (ui) {
            case "Attack" -> attack(currentEnemy);
            case "Usable" -> selectUsable();
            default ->
                    System.out.println("Well it seems you cant spell well enough to do anything... he coming for ya...");
        }
    }
    public boolean checkAlive(){
        return health <= 0;
    }
    public void selectUsable(){
        System.out.println("Please select usable");
    }
}
