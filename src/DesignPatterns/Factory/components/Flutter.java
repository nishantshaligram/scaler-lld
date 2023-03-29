package DesignPatterns.Factory.components;

public class Flutter {
    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting a theme rate for the app");
    }

    public void setRefreshRate(){
        System.out.println("Setting a refresh rate for the app");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(this.platform);
    }
}
