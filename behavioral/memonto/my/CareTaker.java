package behavioral.memonto.my;

import java.util.ArrayList;
import java.util.List;


// 备忘录管理类
// 存取备忘录对象性

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
