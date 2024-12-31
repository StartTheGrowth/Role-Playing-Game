import static java.lang.Thread.sleep;

public class Dealer {
    Player player;
    StartGame startGame;
    public Dealer(Player player) {
        this.player = player;
    }

    public void talk() throws InterruptedException {
        System.out.println(" " + " " + " " + "X" + " " + " " + " " + "\n" +
                " " + " " + "X" + "X" + "X" + " " + " " + "\n" +
                " " + "X" + "X" + "X" + "X" + "X" + " " + "\n" + "\n");
        System.out.println("Чего желаешь, незнакомец?");
        sleep(2000);
        System.out.println("Моё имя " + player.getName() + ". Что ты продаешь?");
        sleep(2000);
        System.out.println("Прости, мой друг, торговец в отпуске!!!");
        this.startGame = new StartGame();
    }
}