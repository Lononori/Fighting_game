package Items;

public class Useable extends Item {
    private String name;

    private enum type {
        HEAL,
        THROWABLE,
        BUFF,
        ROCKETLAUNCHER
    }

    private type item;
    private int damage;
    private int heal;

    public Useable(String name, type item) {
        this.name = name;
        this.item = item;
    }
}
//TODO Jump off a cliff at this fucking rate
//TODO have a entire pack of cigs
