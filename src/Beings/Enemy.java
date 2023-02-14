package Beings;

import Items.Item;

import java.util.Random;

public class Enemy {
    private int health;
    private int damage;
    private int damagePercent;
    private String name;
    private Item drop;
    private Enemy karen = new Enemy("Karen",0,0,50) ;
    private Enemy fryingPan = new Enemy("Frying Pan",0,0,0);
    private Enemy ramsey = new Enemy("Gordon Ramsey",0,0,10);
    private Enemy goat = new Enemy("Goat",0,0,5);
    private Enemy starr = new Enemy("Andy Starr", 0, 0,25);

    public Enemy[] enemies = {karen,fryingPan,ramsey,goat,starr};
    Random rand = new Random();

    public Enemy(){
        name = "Karen";
        health = 15;
        damage = 50;
    }
    public Enemy (String name,int health,int damage,int damagePercent){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.damagePercent = damagePercent;
    }




    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health/2;
    }

    public Item getDrop() {
        return drop;
    }

    public void setDrop(Item drop) {
        this.drop = drop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage/2;
    }

    /**
     * This is my small function that works but also somehow doesnt.... Wait wheres my error gone
     * Dont vanish like that error that worries me
     *
     * @param playerDamage its the damage the player does based on thw equipped weapon
     */
    public void takeDamage(int playerDamage) {
        setHealth(health - playerDamage);
    }
    public boolean checkAlive(){
        return health <= 0;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                ", damage=" + damage +
                ", name='" + name + '\'' +
                ", drop=" + drop +
                '}';
    }
}
