package creational.abstractfactory.bookcode.factories;

import creational.abstractfactory.bookcode.products.buttons.Button;
import creational.abstractfactory.bookcode.products.checkbox.Checbox;

// 抽象工厂
// 生产一套抽象产品

public interface GUIFactory {
    Button createButton();
    Checbox createChecbox();
}
