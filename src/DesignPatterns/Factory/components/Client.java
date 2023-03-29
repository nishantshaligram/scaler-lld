package DesignPatterns.Factory.components;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.DropDown;
import DesignPatterns.Factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UIFactory uiFactory = flutter.createUIFactory();

        Menu Menu = uiFactory.createMenu();
        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();

    }
}
