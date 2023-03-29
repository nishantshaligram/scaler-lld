package DesignPatterns.Calendly;

import DesignPatterns.Calendly.Platforms.TeamsAPI;

public class TeamsAdapter implements PlatformAdapter{
    private TeamsAPI teamsAPI;

    public TeamsAdapter() {
        this.teamsAPI = new TeamsAPI();
    }

    @Override
    public String generateLink() {
        return teamsAPI.generateCallLink();
    }
}
