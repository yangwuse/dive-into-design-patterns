package creational.builder.my.builders;

import creational.builder.my.components.*;

// 构造产品的公共步骤

public interface Builder {
    void setName(String name);
    void setA(A a);
    void setB(B b);
    void setC(C c);
    void setD(D d);
}
