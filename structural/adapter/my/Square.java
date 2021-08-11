package structural.adapter.my;

public class Square implements AdaperInterface{
    private int width;
    public Square(int w) { width = w; }
    public int getWidth() { return width; }
    @Override
    public boolean fit(Circle c) {
        return getWidth() * (int) Math.sqrt(2) / 2 <= c.getRadius();
    }
}
