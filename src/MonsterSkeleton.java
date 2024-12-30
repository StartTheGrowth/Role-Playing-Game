public class MonsterSkeleton extends Person {
    public MonsterSkeleton(String name) {
        super(name, String.valueOf(MonsterType.SKELETON), 120, 50, 10, 30, VoiceOfPerson.MOAN);
    }

    @Override
    public void voice() {
        System.out.println(getVoiceOfPerson().MOAN.getTitle());
    }

    @Override
    public String toString() {
        return "MonsterSkeleton" + getType() + " уровень жизни " + getLife();
    }
}