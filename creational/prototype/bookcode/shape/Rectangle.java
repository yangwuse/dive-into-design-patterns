package creational.prototype.bookcode.shape;

public class Rectangle extends Shape{
    public int width;
    public int height;
    public Rectangle() {}
    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            width = target.width;
            height = target.height;
        }
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Shape) || !super.equals(o)) return false;
        Rectangle r = (Rectangle) o;
        return r.width == width && r.height == height;
    }
    
}
