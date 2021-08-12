package structural.composition.my.nodedemo;

import java.util.ArrayList;
import java.util.List;

public class ContainerNode implements Node{
    private String name;
    private List<Node> children;
    private int level;
    public ContainerNode(String name, int level) {
        this.name = name;
        children = new ArrayList<>();
        this.level = level;
    }
    @Override
    public void add(Node node) {
        children.add(node);
    }
    @Override
    public void remove(Node node) {
        children.remove(node);
    }
    @Override
    public void print() {
        System.err.println("容器节点: " + name);
        for (Node node : children) {
            // 打印前缀空格
            for (int i = 0; i < level; i++)
                System.out.print("  ");
            node.print();
        }
    }
}
