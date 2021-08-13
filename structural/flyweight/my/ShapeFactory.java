package structural.flyweight.my;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// 工厂: 管理缓存池

public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();
    private static Random rand = new Random();
    public static Shape getCircle(String color) {
        Shape res = circleMap.get(color);
        if (res == null) {
            System.out.println("creating color: " + color);
            res = new Circle(rand.nextInt(100), rand.nextInt(100), 10, color);
            circleMap.put(color, res);
        }
        return res;
    }
        
}
