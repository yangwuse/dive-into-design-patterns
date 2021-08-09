package creational.abstractfactory.my;

import creational.abstractfactory.my.factory.*;

// 客户段代码

public class Main {
    // 引用抽象工厂对象
    static AbstractFactory factory;
    public static void main(String[] args) {
        configure();
        businessLogic();
    }
    // 一般根据系统配置确定具体工厂
    static void configure() {
        // factory = new Factory1();
        factory = new Factory2();
    }
    // 业务逻辑
    public static void businessLogic() {
        factory.reportProducFamilies();
    }
}
