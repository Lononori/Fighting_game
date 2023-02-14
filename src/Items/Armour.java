package Items;

public class Armour extends Item {
    private String name;
    private int damageReduction;
    public Armour(){
        name = "Chef's outfit";
        damageReduction = 0;
    }
    public Armour(String name, int damageReduction){
        this.name = name;
        this.damageReduction = damageReduction;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
