public class Player extends Person {

    public Player(String name) {
        super(name, "Player", 100, 20, 20, 500, VoiceOfPerson.VOICE_OF_PLAYER);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println(getVoiceOfPerson().VOICE_OF_PLAYER.getTitle());
    }

    @Override
    public String toString() {
        return "Игрок " + getName();
    }
}