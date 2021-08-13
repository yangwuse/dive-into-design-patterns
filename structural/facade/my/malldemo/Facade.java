package structural.facade.my.malldemo;

// 入口类
// 简化客户访问系统操作

public class Facade {
    ValidateGoods v = new ValidateGoods();
    Pay p = new Pay();
    Deliver d = new Deliver();

    // 入口类封装系统逻辑 向外提供统一访问入口 buy()
    public void buy(Goods goods) {
        if (v.validate(goods) && p.pay(goods)) {
            System.out.println("下单支付成功 准备发货");
        } 
        d.deliver(goods);
        System.out.println("在线购物完成");
    }
}
