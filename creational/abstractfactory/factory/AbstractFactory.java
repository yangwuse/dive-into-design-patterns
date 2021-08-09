package creational.abstractfactory.factory;

import creational.abstractfactory.product.ProductA;
import creational.abstractfactory.product.ProductB;

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
