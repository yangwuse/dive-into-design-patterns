package behavioral.command.bookcode;

import java.util.Deque;
import java.util.LinkedList;

// 操作历史

public class CommandHistory {
    // 栈存储操作记录
    private Deque<Command> history = new LinkedList<>();
    
    // 暴露公共操作 push 
    public void push(Command c) {
        history.push(c);
    }

    // 暴露公共操作 pop
    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
