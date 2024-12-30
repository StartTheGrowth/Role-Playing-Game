import java.util.Scanner;

public class StartGame {
    Scanner scanner = new Scanner(System.in);
    String name;
    Player player;
    MonsterSkeleton monsterSkeleton;
    MonsterGoblin monsterGoblin;
    DarkForrest darkForrest;
    Dealer dealer;

    public StartGame() throws InterruptedException {
        System.out.println("Как твоё имя?");
        name = scanner.nextLine();
        this.player = new Player(name);
        this.monsterSkeleton = new MonsterSkeleton("BoneMan");
        this.monsterGoblin = new MonsterGoblin("HellBoy");
        this.darkForrest = new DarkForrest(player, monsterGoblin, monsterSkeleton);
        this.dealer = new Dealer(player);
        choosingPath();
    }

    public void choosingPath() throws InterruptedException {

        System.out.println(name + " Игра началась! " + "\n" + "Выбери свой путь:" + "\n" +
                "1. К торговцу" + "\n" +
                "2. В тёмный лес" + "\n" +
                "3. Вернуться домой");
        int key;
        key = scanner.nextInt();
        switch (key) {
            case 1:
                dealer.talk();
                break;
            case 2:
                darkForrest.journeyForrest();
            case 3:
                System.out.println("Выход из игры");
                break;
            default:
                System.out.println("Неверный ввод");
                choosingPath();
        }
    }
}