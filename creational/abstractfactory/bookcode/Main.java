package creational.abstractfactory.bookcode;

import creational.abstractfactory.bookcode.factories.GUIFactory;
import creational.abstractfactory.bookcode.factories.MacOSFactory;
import creational.abstractfactory.bookcode.factories.WinOSFactory;

// 运行入口
// 在运行时 应用选择具体工厂并创建对应工厂生产的一套产品
// 绑定时机

public class Main {
    // 根据环境配置具体工厂 产生对应一套产品
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.equals("mac os x")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WinOSFactory();
            app = new Application(factory);
        }
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
