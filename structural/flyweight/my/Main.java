package structural.flyweight.my;

import java.util.Random;

public class Main {
    static String[] colors = {  "Red", "Green", "Blue", "White", "Black" };
    static Random rand = new Random();
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            // 查缓存池
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[rand.nextInt(colors.length)];
    }
}
