package creational.builder.my.builders;

import creational.builder.my.Product;
import creational.builder.my.components.*;

// product2 的构造对象 builder2 
// 只包含组件 A D

public class Builder2 implements Builder {
    private String name;
    private A a;
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
    }

    @Override
    public void setC(C c) {
    }

    @Override
    public void setD(D d) {
        this.d = d;        
    }

    // 从构造对象返回产品2对象
    // 不需要的组件初始化为默认值
    public Product getResult() {
        return new Product(name, a, null, null, d);
    }
}
