package behavioral.chainofresponsibility.bookcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import behavioral.chainofresponsibility.bookcode.middleware.*;


// 入口类

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@123", "123");
        server.register("user@123", "123");

        // 用户使用中间件自定义职责链
        Middleware middleware = new FailedLoginCheck(2);
        middleware.linkWith(new UserExistsCheck(server))
            .linkWith(new RoleCheck());

        // 服务器接受职责链
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success = false;

        while (!success) {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        }
    }

}
