package structural.composition.my.nodedemo;

// 透明组合模式
// 统一使用 Node 接口

public class Main {
    public static void main(String[] args) {
        // root 包含 e1 e2 container
        Node root = new ContainerNode("root", 1);
        Node e1 = new ElementNode("e1");
        Node e2 = new ElementNode("e2");
        Node contianer = new ContainerNode("container", 2);

        // container 包含 e3 e4
        Node e3 = new ElementNode("e3");
        Node e4 = new ElementNode("e4");

        root.add(e1);
        root.add(e2);
        root.add(contianer);

        contianer.add(e3);
        contianer.add(e4);

        root.print();
    }
}
