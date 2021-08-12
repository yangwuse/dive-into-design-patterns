package structural.composition.my.filedemo;

// 安全组合模式 
// 抽象节点只包含元素节点和容器节点的公共操作

public abstract class File {
    protected String name;
    public File(String n) { name = n; }
    abstract void display();
}
