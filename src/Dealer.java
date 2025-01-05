import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Dealer {
    Player player;
    DarkForrest darkForrest = null;

    public Dealer(Player player) throws InterruptedException {
        this.player = player;
    }

    public void talk() throws InterruptedException {
        System.out.println(" " + " " + " " + "X" + " " + " " + " " + "\n" +
                " " + " " + "X" + "X" + "X" + " " + " " + "\n" +
                " " + "X" + "X" + "X" + "X" + "X" + " " + "\n" + "\n");
        System.out.println("Чего желаешь, незнакомец?");
        sleep(1000);
        System.out.println("Моё имя " + player.getName() + ". Что ты продаешь?");
        sleep(1000);
        System.out.println("1. Целебное зелье" + "\n" + "2. Броня" + "\n" +
                "Чтобы отправиться в путешествие, нажми 0");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String key = scanner.nextLine();
            switch (key) {
                case "1":
                    HealingPotion healingPotion = new HealingPotion();
                    healingPotion.healthPlus();
                    player.setGold(player.getGold() - healingPotion.price);
                    System.out.println("Ты приобрел целебное зелье");
                    break;
                case "2":
                    Armor armor = new Armor();
                    armor.protectionPlus();
                    player.setGold(player.getGold() - armor.price);
                    System.out.println("Ты приобрел броню");
                    break;
                case "0":
                    darkForrest = new DarkForrest(player);
                    darkForrest.journeyForrest();
                    break;
                default:
                    break;
            }
            /*if (scanner.nextLine().equals("0")) {
                darkForrest = new DarkForrest(player);
                darkForrest.journeyForrest();
                break;
            }*/
        }
    }

    class HealingPotion {
        int price = 50;

        void healthPlus() {
            player.setLife(player.getLife() + 50);
        }
    }

    class Armor {
        int price = 250;

        void protectionPlus() {
            player.setLife(player.getLife() + 100);
        }
    }
}