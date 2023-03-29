package DesignPatterns.Factory.components;
import DesignPatterns.Factory.components.button.Button;
import DesignPatterns.Factory.components.dropdown.DropDown;
import DesignPatterns.Factory.components.menu.Menu;
public interface UIFactory {
    Menu createMenu();
    DropDown createDropDown();
    Button createButton();
}
