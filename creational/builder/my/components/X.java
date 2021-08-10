package creational.builder.my.components;

// 新添加的组件

public class X {
    private String name;
    public X(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
