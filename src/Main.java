import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import Beings.Enemy;
import Beings.Player;

public class Main {
    public static void main(String[] args) {
        System.out.println("Help");
        Random rand = new Random();
        Enemy currentEnemy = new Enemy();
        Player player = new Player();
        Scanner in =new Scanner(System.in);
        while(!player.checkAlive()){
            player.action(in,currentEnemy);
            currentEnemy.takeDamage(player.equippedWeapon.getDamage());
            System.out.println(currentEnemy.toString());
            if(currentEnemy.checkAlive()) {
                System.out.println("You have killed the enemy....");
                System.out.println("New enemy spawned.");
                currentEnemy = currentEnemy.enemies[rand.nextInt(currentEnemy.enemies.length)];
                // now we are hitting shit that I am not sure how to do
                currentEnemy.setHealth(10*player.getLevel());
                currentEnemy.setDamage(5* player.getLevel());
                System.out.println(currentEnemy.toString());
            }
            player.takedamage(currentEnemy);
            if(player.checkAlive()) {
                System.out.println("Would you like to play again?");
                System.out.println("Yes");
                System.out.println("No");
                if (Objects.equals(in.nextLine(), "Yes")) {
                    player.setHealth(100);
                    currentEnemy.setHealth(15);
                }
            }
            System.out.println(player.toString());
        }
        System.out.println("You have died, Game over");
    }
}