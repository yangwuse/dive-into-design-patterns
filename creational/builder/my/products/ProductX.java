package creational.builder.my.products;

import creational.builder.my.components.*;

public class ProductX extends Product {
    private X x;
    public ProductX(String name, A a, B b, C c, D d, X x) {
        super(name, a, b, c, d);
        this.x = x;
    }
    @Override 
    public String toString() {
        return super.toString() + x;
    }
}
