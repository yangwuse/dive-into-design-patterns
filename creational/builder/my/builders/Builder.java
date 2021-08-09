package creational.builder.my.builders;

import creational.builder.my.components.*;

// 所有产品组件的构造
// 产品最多同时包含组件 A B C D

public interface Builder {
    void setName(String name);
    void setA(A a);
    void setB(B b);
    void setC(C c);
    void setD(D d);
}
