package structural.facade.my.malldemo;

// 门面模式本质 = 包装 + 代理
// 后端整合系统内部接口 向前端提供一个调用接口

public class Main {
    public static void main(String[] args) {
        Goods pen = new Goods("凌美钢笔", 150);
        Facade f = new Facade();
        f.buy(pen);
    }
}
