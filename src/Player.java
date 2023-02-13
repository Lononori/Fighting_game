import java.util.*;

public class Player {
    private int health;
    private int level;
    private long xp;
    private List<Useable> inventory = new ArrayList<>();
    private Weapon equippedWeapon;
    private Armour equippedArmour;
    public Player(){
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

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public void Attack(){
        int ouch = equippedWeapon.getDamage();
        Enemy.takeDamage(ouch);

    }
}
