package behavioral.memonto.my;

// 应用类
// 创建备忘录对象 并将自身状态保存在备忘录对象中

public class Originator {
    private String state;
    
    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // 存储状态
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    // 恢复状态
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
