public class MonsterSkeleton extends Person {
    public MonsterSkeleton() {
        super("BoneMan", String.valueOf(MonsterType.SKELETON), 120, 50, 10, 10, 30, VoiceOfPerson.MOAN);
    }

    @Override
    public void voice() {
        System.out.println(getVoiceOfPerson().MOAN.getTitle());
    }

    @Override
    public String toString() {
        return getType() + " " + getName() + " уровень жизни " + getLife();
    }
}