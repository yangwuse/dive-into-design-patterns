package structural.adapter.my;

// 矩形适配圆形

public class SquareAdapter extends Circle {
    private Square square;
    public SquareAdapter(Square s) {
        square = s;
    }
    @Override
    public int getRadius() {
        return square.getWidth() * (int) Math.sqrt(2.0) / 2;
    }
}
