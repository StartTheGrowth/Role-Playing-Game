public class MonsterGoblin extends Person {
    public MonsterGoblin() {
        super("HellBoy", String.valueOf(MonsterType.GOBLIN), 80, 20, 15, 20, 50, VoiceOfPerson.GROWL);
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