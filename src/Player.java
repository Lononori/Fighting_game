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
}

