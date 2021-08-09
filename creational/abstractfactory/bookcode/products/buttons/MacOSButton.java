package creational.abstractfactory.bookcode.products.buttons;

public class MacOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("Created MacOSButton.");
    }
    
}
