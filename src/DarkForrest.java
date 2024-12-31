import java.util.Random;

import static java.lang.Thread.sleep;

public class DarkForrest {
    Player player;
    MonsterGoblin monsterGoblin;
    MonsterSkeleton monsterSkeleton;

    public DarkForrest(Player player/*, MonsterGoblin monsterGoblin, MonsterSkeleton monsterSkeleton*/) {
        this.player = player;
        this.monsterGoblin = new MonsterGoblin();
        this.monsterSkeleton = new MonsterSkeleton();
    }

    Random random = new Random();
    private int x;

    void journeyForrest() throws InterruptedException {
        System.out.println("Иди сквозь темный лес");
        while (true) {
            x++;
            System.out.print("X");
            sleep(500);
            int rnd = random.nextInt(29) + 1;
            if (rnd % 5 == 0) {
                System.out.println("\n" + "На твоём пути противник " + monsterGoblin.toString() + ".\n" +
                        " Для нанесения удара нажми клавишу 1");
                Battle battle = new Battle(monsterGoblin, monsterSkeleton, player);
                battle.battle();
                break;
            }
        }
    }
}