package creational.factorymethod.factory;

import creational.factorymethod.buttons.Button;
import creational.factorymethod.buttons.WindowsButton;

// 具体工厂
// 创建 WindowButton 

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
