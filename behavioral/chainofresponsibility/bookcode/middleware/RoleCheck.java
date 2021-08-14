package behavioral.chainofresponsibility.bookcode.middleware;

// 具体处理器
// 检查用户角色

public class RoleCheck extends Middleware{

    @Override
    public boolean check(String email, String password) {
        // 管理员直接通过
        if (email.equals("admin@123")) {
            System.out.println("Hello admin!");
            return true;
        }
        // 用户需要进一步验证
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
    
}
