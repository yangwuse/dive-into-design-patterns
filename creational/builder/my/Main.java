package creational.builder.my;

import creational.builder.my.builders.*;

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
    }
}
