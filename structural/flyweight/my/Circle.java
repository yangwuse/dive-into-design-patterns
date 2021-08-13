package structural.flyweight.my;

public class Circle implements Shape{
    private int x;
    private int y;
    private String color;
    private int radius;
    public Circle(int x, int y, int radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("Circle: (" + "x = " + x + ", y = " + y + 
            ", radius = " + radius + ", color = " + color);
    }
    
}
