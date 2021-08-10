package creational.prototype.bookcode.shape;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;
    public Shape() {}
    // 克隆构造方法
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }
    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Shape)) return false;
        Shape s = (Shape) o;
        return s.x == x && s.y == y && Objects.equals(s.color, color);
    }
}
