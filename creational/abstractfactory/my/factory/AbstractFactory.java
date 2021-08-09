package creational.abstractfactory.my.factory;

import creational.abstractfactory.my.product.ProductA;
import creational.abstractfactory.my.product.ProductB;

// 抽象工厂

public interface AbstractFactory {
    // 模板方法
    default void reportProducFamilies() {
        ProductA productA = createProductA();
        ProductB productB = createProductB();
        productA.reportName();
        productB.reportName();
    }
    ProductA createProductA();
    ProductB createProductB();
}
