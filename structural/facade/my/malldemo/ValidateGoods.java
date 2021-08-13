package structural.facade.my.malldemo;

// 商品验证系统

public class ValidateGoods {
    public boolean validate(Goods goods) {
        System.out.println("验证商品: " + goods.getName() + 
                            ", 价格: " + goods.getPrice());
        return true;
    }
}
