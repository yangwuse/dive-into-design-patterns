package structural.facade.my.malldemo;

// 商品类

public class Goods {
    private String name;
    private float price;
    public Goods(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
}
