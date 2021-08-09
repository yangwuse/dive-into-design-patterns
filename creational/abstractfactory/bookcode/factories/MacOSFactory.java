package creational.abstractfactory.bookcode.factories;

import creational.abstractfactory.bookcode.products.buttons.Button;
import creational.abstractfactory.bookcode.products.buttons.MacOSButton;
import creational.abstractfactory.bookcode.products.checkbox.Checbox;
import creational.abstractfactory.bookcode.products.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checbox createChecbox() {
        return new MacOSCheckbox();
    }
    
}
