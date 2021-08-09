package creational.factorymethod.factory;

import creational.factorymethod.product.Product;

// 抽象工厂

public abstract class Factory {
    public void report() {
        Product product = createProduct();
        product.name();
    }

    // 抽象方法
    abstract Product createProduct();
}
