package structural.facade.my.malldemo;

// 运输系统

public class Deliver {
    public void deliver(Goods goods) {
        System.out.println("商品: " + goods.getName() + " 订单编号是 888, 正在派单");
    }    
}
