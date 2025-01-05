import java.util.Random;

public class MonsterGoblin extends Person implements Hit {
    Player player;

    public MonsterGoblin(Player player) {
        super("HellBoy", String.valueOf(MonsterType.GOBLIN), 80, 20, 15, 20, 50,
                VoiceOfPerson.GROWL);
        this.player = player;
    }

    public void hit() {
        Random random = new Random();
        int rnd = random.nextInt(20) + 1;
        if (rnd > 5) {
            voice();
        }
        player.setLife(player.getLife() - (getImpactForce() / rnd));
        if (player.getLife() <= 0) {
            player.setLife(0);
        }
        System.out.println("монстр нанес удар, уровень вашей жизни " + player.getLife());
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println(getVoiceOfPerson().GROWL.getTitle());
    }

    @Override
    public String toString() {
        return getType() + " " + getName() + " уровень жизни " + getLife();
    }
}