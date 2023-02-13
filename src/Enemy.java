public class Enemy {
    private int health;
    private int damage;
    private String name;
    private Item drop;

    public Enemy(){
        name = "Karen";
        health = 15;
        damage = 5;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
        this.damage = damage;
    }

    public void takeDamage(int playerDamage){
        setHealth(health - playerDamage);
    }
}
