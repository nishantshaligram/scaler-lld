package DesignPatterns.Calendly;

public class Calendly {
    private PlatformAdapter platformAdapter;

    public Calendly() {
    }

    public String createMeeting(PlatformAdapter platformAdapter){
        return platformAdapter.generateLink();
    }
}
