package creational.abstractfactory.my.factory;

import creational.abstractfactory.my.product.*;

// 工厂2 
// 生产产品套件: A2 B2

public class Factory2 implements AbstractFactory{

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
    
}
