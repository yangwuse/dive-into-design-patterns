package creational.abstractfactory.bookcode.products.buttons;

public class WinOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("Created WinOSButton.");        
    }
    
}
