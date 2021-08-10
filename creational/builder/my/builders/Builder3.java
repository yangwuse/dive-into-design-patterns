package creational.builder.my.builders;

import creational.builder.my.components.*;
import creational.builder.my.products.*;

// 添加新的组件构造产品

public class Builder3 implements Builder{
    private String name;
    private X x;
    // 通过构造器注入新增组件
    public Builder3(X x) {
        this.x = x;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setA(A a) {
        
    }

    @Override
    public void setB(B b) {
        
    }

    @Override
    public void setC(C c) {
        
    }

    @Override
    public void setD(D d) {
        
    }
    // 返回更新后的产品
    public Product getResult() {
        return new ProductX(name, null, null, null, null, x);
    }
}
