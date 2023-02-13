import Beings.Enemy;
import Beings.Player;

public class Main {
    public static void main(String[] args) {
        System.out.println("Help");
        Enemy currentEnemy = new Enemy();
        Player player = new Player();
        System.out.println(player.toString());
        player.takedamage(currentEnemy);
        System.out.println(player.toString());

    }
}