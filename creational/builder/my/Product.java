package creational.builder.my;

import creational.builder.my.components.*;

// 最复杂的产品原型
// 包含组件 A B C D

public class Product {
    private String name;
    private A a;
    private B b;
    private C c;
    private D d;
    public Product(String name, A a, B b, C c, D d) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(": ");
        if (a != null)
            sb.append(a).append(", ");
        if (b != null)
            sb.append(b).append(", ");
        if (c != null)
            sb.append(c).append(", ");
        if (d != null)
            sb.append(d).append(",  ");
        return sb.substring(0, sb.length() - 3);
    } 
}
