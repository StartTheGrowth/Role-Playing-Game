public class Person {
    private String name;
    private String type;
    private int life;
    private int strength;
    private int dexterity;
    private int impactForce;
    private int exp;
    private int gold;
    private VoiceOfPerson voiceOfPerson;

    public Person(String name, String type, int life, int strength, int dexterity, int exp, int gold, VoiceOfPerson voiceOfPerson) {
        this.name = name;
        this.type = type;
        this.life = life;
        this.strength = strength;
        this.dexterity = dexterity;
        this.exp = exp;
        this.gold = gold;
        this.voiceOfPerson = voiceOfPerson;
        this.impactForce = strength + dexterity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getImpactForce() {
        return impactForce;
    }

    public void setImpactForce() {
        this.impactForce = impactForce;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public VoiceOfPerson getVoiceOfPerson() {
        return voiceOfPerson;
    }

    public void setVoiceOfPerson(VoiceOfPerson voiceOfPerson) {
        this.voiceOfPerson = voiceOfPerson;
    }

    public void voice() {
        voiceOfPerson = VoiceOfPerson.SCREAM;
        System.out.println(voiceOfPerson.getTitle());
    }
}