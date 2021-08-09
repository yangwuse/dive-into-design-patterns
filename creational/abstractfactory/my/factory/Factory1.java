package creational.abstractfactory.my.factory;

import creational.abstractfactory.my.product.*;

// 工厂1 
// 生成产品套件: A1 B1

public class Factory1 implements AbstractFactory{

    @Override
    public ProductA createProductA() {
       return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
       return new ProductB1();
    }
    
}
