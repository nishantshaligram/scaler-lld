package DesignPatterns.Calendly;

import DesignPatterns.Calendly.PlatformAdapter;
import DesignPatterns.Calendly.Platforms.GoogleMeetAPI;

public class GoogleMeetAdapter implements PlatformAdapter {
    private GoogleMeetAPI googleMeetAPI;

    public GoogleMeetAdapter() {
        this.googleMeetAPI = new GoogleMeetAPI();
    }

    @Override
    public String generateLink() {
        return googleMeetAPI.generateEventLink();
    }
}
