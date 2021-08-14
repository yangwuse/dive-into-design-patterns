package behavioral.chainofresponsibility.bookcode.middleware;

// 中间件
// 负责链接成职责链 类似于单链表中的 Node 节点

public abstract class Middleware {
    private Middleware next;

    // 构造职责链 （单链表）
    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    // 子类实现自己的职责功能 check 
    public abstract boolean check(String email, String password);

    // 传递请求到下一个处理器直到链尾
    protected boolean checkNext(String email, String password) {
        // 此处默认到达链尾即处理成功
        // 有时整个链都不能处理
        if (next == null)
            return true;
        return next.check(email, password);
    }

}
