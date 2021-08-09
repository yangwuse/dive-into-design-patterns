package creational.factorymethod.product;

// B 产品

public class BProduct implements Product {
    @Override
    public void name() {
        System.out.println("BProduct");
    }
}
