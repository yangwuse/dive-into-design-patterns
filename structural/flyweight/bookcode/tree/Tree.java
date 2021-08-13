package structural.flyweight.bookcode.tree;
import java.awt.*;

// 上下文类 
// 包装可变状态和缓存对象的引用

public class Tree {
    private int x;
    private int y;
    // 引用缓存对象而不是创建新的对象
    private TreeType type;
    public Tree(int x, int y, TreeType tyep) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    // 将可变状态传递给缓存对象 
    // 由缓存对象处理
    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}