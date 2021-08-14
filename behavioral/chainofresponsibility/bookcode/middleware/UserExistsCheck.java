package behavioral.chainofresponsibility.bookcode.middleware;

import behavioral.chainofresponsibility.bookcode.Server;

// 具体处理器
// 检查用户是否存在

public class UserExistsCheck extends Middleware {
    private Server server;
    public UserExistsCheck(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password");
            return false;
        }
        return checkNext(email, password);
    }
    
}
