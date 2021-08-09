package creational.abstractfactory.bookcode;

import creational.abstractfactory.bookcode.factories.GUIFactory;
import creational.abstractfactory.bookcode.products.buttons.Button;
import creational.abstractfactory.bookcode.products.checkbox.Checbox;

public class Application {
    private Button button;
    private Checbox checbox;
    public Application(GUIFactory factory) {
        button = factory.createButton();
        checbox = factory.createChecbox();
    }    
    public void paint() {
        button.paint();
        checbox.paint();
    }
}
