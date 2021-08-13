package structural.facade.my.demo1;

// 客户通过门户访问整个系统
// 简化访问
// 本质是 包装 + 代理

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.run();
    }
}
