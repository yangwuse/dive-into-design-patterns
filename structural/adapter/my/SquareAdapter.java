package structural.adapter.my;

// 矩形适配圆形

public class SquareAdapter implements AdaperInterface {
    private Square square;
    public SquareAdapter(Square s) {
        square = s;
    }
    @Override
    public boolean fit(Circle c) {
       return square.getWidth() <= c.getRadius();
    }
}
