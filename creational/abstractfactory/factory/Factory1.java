package creational.abstractfactory.factory;

import creational.abstractfactory.product.ProductA;
import creational.abstractfactory.product.ProductA1;
import creational.abstractfactory.product.ProductB;
import creational.abstractfactory.product.ProductB1;

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
