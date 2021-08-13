package structural.facade.my.malldemo;

// 支付系统

public class Pay {
    public boolean pay(Goods goods) {
        System.out.println("商品: " + goods.getName() + " 支付成功");
        return true;
    }
}
