package creational.builder.my;

import creational.builder.my.builders.*;
import creational.builder.my.components.X;
import creational.builder.my.products.Product;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // 初始化产品1的 builder1 对象
        Builder1 builder1 = new Builder1();
        director.createProduct1(builder1);
        // 通过 builder1 对象构造产品1
        Product p1 = builder1.getResult();
        System.out.println(p1);

         // 初始化产品2的 builder2 对象
         Builder2 builder2 = new Builder2();
         director.createProduct2(builder2);
         // 通过 builder1 对象构造产品1
         Product p2 = builder2.getResult();
         System.out.println(p2);

         // 通过构造器注入新增组件 X
         Builder3 builder3 = new Builder3(new X("Component X"));
         director.createProductx(builder3);
         Product p3 = builder3.getResult();
         System.out.println(p3);
    }
}
