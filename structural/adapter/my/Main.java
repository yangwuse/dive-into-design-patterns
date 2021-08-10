package structural.adapter.my;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(4);
        // can't fit
        // System.out.println(c.fit(s));

        SquareAdapter adapter = new SquareAdapter(s);
        System.out.println(c.fit(adapter));
    }
}
