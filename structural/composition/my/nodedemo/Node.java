package structural.composition.my.nodedemo;

// 透明组合模式
// 抽象节点包含子类全部操作

public interface Node {
    // 容器节点操作
    void add(Node node);
    void remove(Node node);
    
    // 元素节点和容器节点共有操作
    void print();

}
