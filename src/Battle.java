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

    public void playerHit() {
        int rnd = random.nextInt(10) + 1;
        monsterGoblin.setLife(monsterGoblin.getLife() - (player.getImpactForce()) / rnd);
        if (monsterGoblin.getLife() < 0) {
            monsterGoblin.setLife(0);
        }
        System.out.println("игрок нанес удар, жизни монстра осталось " + monsterGoblin.getLife());
        if (rnd > 7) player.voice();
    }

    public void monsterDead() {
        System.out.println("O-o-o");
        player.setGold(player.getGold() + monsterGoblin.getGold());
        System.out.println("Монстр " + monsterGoblin.getType() + " " + monsterGoblin.getName() +
                " повержен. У вас золота " + player.getGold() + " монет");
    }

    public void monsterHit() {
        int rnd = random.nextInt(20) + 1;
        player.setLife(player.getLife() - (monsterGoblin.getImpactForce()) / rnd);
        if (player.getLife() < 0) {
            player.setLife(0);
        }
        System.out.println("монстр нанес удар, уровень вашей жизни " + player.getLife());
        if (rnd > 5) monsterGoblin.voice();
    }

    public void battle() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String key = scanner.nextLine();
            if (key.equals("1")) {
                playerHit();
            }
            if (player.getLife() <= 0) {
                System.out.println("Вы проиграли!!!");
                break;
            }
            if (monsterGoblin.getLife() <= 0) {
                monsterDead();
                darkForrest.journeyForrest();
                break;
            }
            sleep(500);
            monsterHit();
        }
    }
}