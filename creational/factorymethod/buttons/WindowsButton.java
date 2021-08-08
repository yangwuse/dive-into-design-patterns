package creational.factorymethod.buttons;

import java.awt.*;
import javax.swing.*;

public class WindowsButton implements Button{
   

    @Override
    public void render() {
        System.out.println("<button>Window Button</button>"); 
        onClick();    
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
    
}
