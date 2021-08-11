package structural.adapter.my;

// 适配器将 A 接口转换为 B 接口

public class Adapter implements B{
    // 持有 A 对象
    private A a;
    public Adapter(A a) { this.a = a; }
    @Override
    public void runB() {
        // 委托请求
        a.runA();
    }
}
