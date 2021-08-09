package creational.factorymethod.factory;

import creational.factorymethod.product.AProduct;
import creational.factorymethod.product.Product;

// A 工厂生产 A 产品

public class AFactory extends Factory{
    @Override
    Product createProduct() {
       return new AProduct();
    }
}
