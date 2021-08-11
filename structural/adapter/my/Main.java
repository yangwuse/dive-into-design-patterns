package structural.adapter.my;

// 场景: 用户需要使用 B 接口, 但只有 A 接口

public class Main {
    public static void main(String[] args) {
        // 1. 创建 servide 对象
        A a = new A();
        // 2. 创建适配器对象 将 A 接口转化为 B 接口
        Adapter adapter = new Adapter(a);
        // 3. 客户使用适配器转换接口
        adapter.runB();
    }
}
