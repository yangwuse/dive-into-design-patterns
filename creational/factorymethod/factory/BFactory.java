package creational.factorymethod.factory;

import creational.factorymethod.product.BProduct;
import creational.factorymethod.product.Product;

// B 工厂生产 B 产品

public class BFactory extends Factory{
    @Override
    Product createProduct() {
        return new BProduct();
    }
}
