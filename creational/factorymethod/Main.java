package creational.factorymethod;

import creational.factorymethod.factory.AFactory;
import creational.factorymethod.factory.BFactory;
import creational.factorymethod.factory.Factory;

public class Main {
    // 引用工厂接口
    static Factory factory;
    public static void main(String[] args) {
        configure();
        reportProductName();
    }
    // 一般根据系统配置绑定工厂类型
    static void configure() {
        if (System.getProperty("os.name").equals("Mac OS X"))
            factory = new AFactory();
        else 
            factory = new BFactory();
    }
    // 业务逻辑
    static void reportProductName() {
        factory.report();
    }
}
