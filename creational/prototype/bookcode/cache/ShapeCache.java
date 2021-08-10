package creational.prototype.bookcode.cache;

import java.util.HashMap;
import java.util.Map;
import creational.prototype.bookcode.shape.Circle;
import creational.prototype.bookcode.shape.Rectangle;
import creational.prototype.bookcode.shape.Shape;

public class ShapeCache {
    private Map<String, Shape> map = new HashMap<>();
    public ShapeCache() {
        Circle c = new Circle();
        c.x = 1;
        c.y = 1;
        c.radius = 1;
        c.color = "Green";

        Rectangle r = new Rectangle();
        r.x = 1;
        r.y = 1;
        r.width = 1;
        r.height = 1;
        r.color = "Blue";

        map.put("Green Circle", c);
        map.put("Blue Rectangle", r);
    }

    public Shape put(String s, Shape shape) {
        map.put(s, shape);
        return shape;
    }
    public Shape get(String s) {
        return map.get(s);
    }
    
}
