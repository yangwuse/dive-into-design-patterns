package creational.prototype.bookcode.cache;

import creational.prototype.bookcode.shape.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeCache cache = new ShapeCache();
        Shape shape1 = cache.get("Green Circle");
        Shape shape2 = cache.get("Blue Rectangle");
        Shape shape3 = cache.get("Blue Rectangle");
        System.out.println(shape1 == shape2);
        System.out.println(shape2 == shape3);
    }
}
