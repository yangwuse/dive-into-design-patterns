package structural.flyweight.bookcode.forest;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import structural.flyweight.bookcode.tree.Tree;
import structural.flyweight.bookcode.tree.TreeFactory;
import structural.flyweight.bookcode.tree.TreeType;
import java.awt.*;
// 应用类
// context 对象容器

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();
    public void plantTree(int x, int y, String name, Color color, String otherData) {
        // 工厂方法查缓存池获取缓存对象
        TreeType type = TreeFactory.getTreeType(name, color, otherData);
        // 用缓存对象初始化(配置) context 对象
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }
    @Override
    public void paint(Graphics g) {
        // 由 context 对象处理
        for (Tree tree : trees)
            tree.draw(g);
    }
}
