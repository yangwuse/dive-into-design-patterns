package creational.factorymethod.product;

// A 产品

public class AProduct implements Product {
    @Override
    public void name() {
        System.out.println("AProduce");
    }
}
