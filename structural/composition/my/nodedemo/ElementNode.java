package structural.composition.my.nodedemo;

public class ElementNode implements Node{
    private String name;
    public ElementNode(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("元素节点: " + name);
    }

    @Override
    public void add(Node node) {
        
    }
    @Override
    public void remove(Node node) {
        
    }
}
