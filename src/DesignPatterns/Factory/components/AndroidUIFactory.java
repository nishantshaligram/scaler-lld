package DesignPatterns.Factory.components;

import DesignPatterns.Factory.components.button.AndroidButton;
import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.AndroidDropDown;
import DesignPatterns.Factory.components.dropdown.DropDown;
import DesignPatterns.Factory.components.menu.AndroidMenu;
import DesignPatterns.Factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }

    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
