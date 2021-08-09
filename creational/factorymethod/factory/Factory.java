package creational.factorymethod.factory;

import creational.factorymethod.product.Product;

// 工厂方法类

public abstract class Factory {
    // 将产品创建和产品使用分离
    public void report() {
        // 产品创建延迟到子类进行
        Product product = createProduct();
        product.name();
    }

    // 抽象工厂方法「类型延迟绑定」
    abstract Product createProduct();
}
