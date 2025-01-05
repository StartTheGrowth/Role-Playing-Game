import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Battle {
    private MonsterGoblin monsterGoblin;
    private MonsterSkeleton monsterSkeleton;
    private Player player;
    private DarkForrest darkForrest;
    Random random = new Random();

    public Battle(MonsterGoblin monsterGoblin, MonsterSkeleton monsterSkeleton, Player player) {
        this.monsterGoblin = monsterGoblin;
        this.monsterSkeleton = monsterSkeleton;
        this.player = player;
        this.darkForrest = new DarkForrest(player);
    }

    public void battleGoblin() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String key = scanner.nextLine();
            if (key.equals("1")) {
                int rnd = random.nextInt(10) + 1;
                monsterGoblin.setLife(monsterGoblin.getLife() - (player.getImpactForce()) / rnd);
                if (monsterGoblin.getLife() <= 0) {
                    monsterGoblin.setLife(0);
                }
                System.out.println("игрок нанес удар, жизни монстра осталось " + monsterGoblin.getLife());
                if (rnd > 8) player.voice();
            }
            if (monsterGoblin.getLife() <= 0) {
                System.out.println("O-o-o");
                player.setGold(player.getGold() + monsterGoblin.getGold());
                System.out.println(monsterGoblin.getType() + " " + monsterGoblin.getName() +
                        " повержен. У вас золота " + player.getGold() + " монет");
                darkForrest.journeyForrest();
                break;
            }
            sleep(500);
            monsterGoblin.hit();
            if (player.getLife() <= 0) {
                System.out.println("Вы проиграли!!!");
                break;
            }
        }
    }

    public void battleSkeleton() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String key = scanner.nextLine();
            if (key.equals("1")) {
                int rnd = random.nextInt(10) + 1;
                monsterSkeleton.setLife(monsterSkeleton.getLife() - (player.getImpactForce()) / rnd);
                if (monsterSkeleton.getLife() <= 0) {
                    monsterSkeleton.setLife(0);
                }
                System.out.println("игрок нанес удар, жизни монстра осталось " + monsterSkeleton.getLife());
                if (rnd > 8) player.voice();
            }
            if (monsterSkeleton.getLife() <= 0) {
                System.out.println("O-o-o");
                player.setGold(player.getGold() + monsterSkeleton.getGold());
                System.out.println(monsterSkeleton.getType() + " " + monsterSkeleton.getName() +
                        " повержен. У вас золота " + player.getGold() + " монет");
                darkForrest.journeyForrest();
                break;
            }
            sleep(500);
            monsterSkeleton.hit();
            if (player.getLife() <= 0) {
                player.setLife(0);
                System.out.println("Вы проиграли!!!");
                break;
            }
        }
    }
}