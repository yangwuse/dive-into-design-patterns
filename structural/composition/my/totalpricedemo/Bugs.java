package structural.composition.my.totalpricedemo;

import java.util.ArrayList;
import java.util.List;

public class Bugs implements Products{
    private String name;
    private float price;
    private List<Products> ls;
    public Bugs(String name, float price) {
        this.name = name;
        this.price = price;
        ls = new ArrayList<>();
    }
    public void add(Products p) {
        ls.add(p);
    }
    @Override
    public void show() {
        System.out.println(name + "(价格: " + price + ")");
        for (Products p : ls)
            p.show();
    }
    @Override
    public float getPrice() {
        float sum = price;
        for (Products p : ls)
            sum += p.getPrice();
        return sum;
    }
}
