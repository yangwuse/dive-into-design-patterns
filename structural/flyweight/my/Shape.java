package structural.flyweight.my;

import java.util.ArrayList;
import java.util.List;

public interface Shape {
    void draw();
    public static void main(String[] args) {
        List<Double> ls = new ArrayList<>();
        ls.add(1.0);
        ls.add(2.0);
        System.out.println(ls.stream().mapToDouble(i -> i).average().getAsDouble());
    }
}
