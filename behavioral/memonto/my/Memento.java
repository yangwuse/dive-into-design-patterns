package behavioral.memonto.my;

// 备忘录类
// 包含要恢复的对象状态

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
