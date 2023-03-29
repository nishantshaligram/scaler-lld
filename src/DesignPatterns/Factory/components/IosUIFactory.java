package DesignPatterns.Factory.components;

import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.button.Iosbutton;
import DesignPatterns.Factory.components.dropdown.DropDown;
import DesignPatterns.Factory.components.dropdown.IosDropDown;
import DesignPatterns.Factory.components.menu.IosMenu;
import DesignPatterns.Factory.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public Button createButton() {
        return new Iosbutton();
    }
}
