import java.util.Random;

public class MonsterSkeleton extends Person implements Hit {
    Player player;

    public MonsterSkeleton(Player player) {
        super("BoneMan", String.valueOf(MonsterType.SKELETON), 120, 50, 10, 10, 30,
                VoiceOfPerson.MOAN);
        this.player = player;
    }

    public void hit() {
        Random random = new Random();
        int rnd = random.nextInt(20) + 1;
        if (rnd > 15) {
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
        System.out.print(getVoiceOfPerson().MOAN.getTitle());
    }

    @Override
    public String toString() {
        return getType() + " " + getName() + " уровень жизни " + getLife();
    }
}