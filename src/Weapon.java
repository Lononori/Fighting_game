public class Weapon extends Item{
    private int damage;
    private String name;
    private int critPercent;
    public Weapon(){
        name = "Wooden Sword";
        damage = 5;
        critPercent = 1;
    }

    public int getCritPercent() {
        return critPercent;
    }

    public void setCritPercent(int critPercent) {
        this.critPercent = critPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
