package structural.adapter.my;

public class Circle {
    private int radius;
    public Circle() {}
    public Circle(int r) { radius = r; }
    public int getRadius() { return radius; }
    // 大圆套小圆
    public boolean fit(Circle c) {
        return radius >= c.radius;
    }
}
