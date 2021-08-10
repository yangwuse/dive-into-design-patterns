package creational.prototype.bookcode.shape;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 10;
        c.y = 20;
        c.color = "red";
        c.radius = 2;
        Circle copy = (Circle) c.clone();
        System.out.println(c.equals(copy));
    }
}
