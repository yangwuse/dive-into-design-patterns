package creational.builder.my;

import creational.builder.my.builders.Builder;
import creational.builder.my.components.*;

// 初始化各个产品所需的组件

public class Director {
    // 初始化产品1 的各个组件 A1 B1 C1 D1
    public void  createProduct1(Builder builder) {
        builder.setName("P1");
        builder.setA(new A("Component A1"));
        builder.setB(new B("Component B1"));
        builder.setC(new C("Component C1"));
        builder.setD(new D("Component D1"));
    }
    // 初始化产品2 的各个组件 A2 B2
    public void createProduct2(Builder builder) {
        builder.setName("P2");
        builder.setA(new A("Component A2"));
        builder.setD(new D("Component B2"));
    }
}
