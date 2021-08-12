package structural.composition.my.totalpricedemo;

public class Goods implements Products{
    private String name;
    private float unitPrice;
    private int nums;
    public Goods(String name, float unitPrice, int nums) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.nums = nums;
    }
    @Override
    public void show() {
        System.out.println(name + "(单价: " + unitPrice + ", 数量: " + nums +
        ", 总计: " + getPrice() + ")");
    }

    @Override
    public float getPrice() {
        return unitPrice * nums;
    }
    
}
