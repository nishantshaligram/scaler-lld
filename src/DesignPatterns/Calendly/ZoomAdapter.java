package DesignPatterns.Calendly;

import DesignPatterns.Calendly.Platforms.ZoomAPI;

public class ZoomAdapter implements PlatformAdapter{
    private ZoomAPI zoomAPI;

    public ZoomAdapter() {
        this.zoomAPI = new ZoomAPI();
    }

    @Override
    public String generateLink() {
        return zoomAPI.generateMeetingLink();
    }

}
