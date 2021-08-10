package creational.prototype.bookcode.shape;

public class Circle extends Shape{
    public int radius;
    public Circle() {}
    // 克隆构造器
    public Circle(Circle target) {
        // 调用父类克隆构造器 克隆父类字段
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }
    @Override
    public Shape clone() {
        // 自己克隆自己
        return new Circle(this);
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle) || !super.equals(o)) return false;
        Circle c = (Circle) o;
        return c.radius == radius;
    }
    
}
