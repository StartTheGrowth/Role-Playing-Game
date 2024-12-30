public enum VoiceOfPerson {
    SCREAM("AAAAAA!!!"),
    GROWL("RGHAAA!!!"),
    VOICE_OF_PLAYER("Получи, гад!!!"),
    MOAN("OOOOOHHH");
    private String title;

    VoiceOfPerson(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}