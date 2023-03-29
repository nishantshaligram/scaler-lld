package DesignPatterns.Calendly;

public class Client {
    public static void main(String[] args) {
        PlatformAdapter platformAdapter = new TeamsAdapter();
        Calendly calendly = new Calendly();
        String meetingLink = calendly.createMeeting(platformAdapter);
        System.out.println(meetingLink);
    }
}
