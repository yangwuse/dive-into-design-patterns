package creational.builder.my.builders;

import creational.builder.my.Product;
import creational.builder.my.components.*;

// product1 的构造对象 builder1
// 包含组件 A B C D

public class Builder1 implements Builder {
    private String name;
    private A a;
    private B b;
    private C c;
    private D d;
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setA(A a) {
        this.a = a;
    }

    @Override
    public void setB(B b) {
        this.b = b;        
    }

    @Override
    public void setC(C c) {
        this.c = c;
    }

    @Override
    public void setD(D d) {
        this.d = d;        
    }

    // 从构造对象返回产品1对象
    public Product getResult() {
        return new Product(name, a, b, c, d);
    }

    
}
