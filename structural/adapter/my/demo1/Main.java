package structural.adapter.my.demo1;

// 将 A 接口转换为 B 接口

public class Main {
    public static void main(String[] args) {
        // 1. 创建 servide 对象 
        A a = new A();
        // 2. 创建适配器对象 将 A 接口转化为 B 接口
        BAdapter adapter = new BAdapter(a);
        // 3. 客户使用适配器转换接口
        adapter.runB();
    }
}
