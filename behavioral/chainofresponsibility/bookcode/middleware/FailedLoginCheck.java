package behavioral.chainofresponsibility.bookcode.middleware;

// 具体处理器
// 检查是否进行了多次失败的登录请求

public class FailedLoginCheck extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public FailedLoginCheck(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    // 通过时间改变处理器执行顺序
    @Override
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("超出一分钟请求次数 请稍后重试!");
            Thread.currentThread().stop();
        }
        
        boolean res = checkNext(email, password);
        if (!res)
            System.out.println("请求失败! 剩余请求数: " + (requestPerMinute - request));
        return res;
    }
}
