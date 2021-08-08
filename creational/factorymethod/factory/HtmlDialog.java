package creational.factorymethod.factory;

import creational.factorymethod.buttons.Button;
import creational.factorymethod.buttons.HtmlButton;

// 具体工厂
// 创建 HtmlButton

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
