package structural.flyweight.bookcode.tree;
import java.awt.*;
// 缓存类: 内存消耗型 状态不可变 重用

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }
    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.black);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }

}
