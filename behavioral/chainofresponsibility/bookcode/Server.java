package behavioral.chainofresponsibility.bookcode;

import java.util.HashMap;
import java.util.Map;

import behavioral.chainofresponsibility.bookcode.middleware.Middleware;

// 服务器
// 管理用户邮箱、密码 

public class Server {
    private Map<String, String> users = new HashMap<>();
    // 由中间件组成的职责链
    private Middleware middleware;

    // 用户传递自定义职责链
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    // 服务器接收用户输入的账号、密码
    // 接着由职责链复制登录验证
    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("登录成功！！！");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }

}
