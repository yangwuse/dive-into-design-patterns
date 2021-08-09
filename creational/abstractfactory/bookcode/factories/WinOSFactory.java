package creational.abstractfactory.bookcode.factories;

import creational.abstractfactory.bookcode.products.buttons.Button;
import creational.abstractfactory.bookcode.products.buttons.WinOSButton;
import creational.abstractfactory.bookcode.products.checkbox.Checbox;
import creational.abstractfactory.bookcode.products.checkbox.WinOSCheckbox;

public class WinOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
       return new WinOSButton();
    }

    @Override
    public Checbox createChecbox() {
        return new WinOSCheckbox();
    }
    
}
