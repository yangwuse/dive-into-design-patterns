package creational.factorymethod;

import creational.factorymethod.factory.Dialog;
import creational.factorymethod.factory.HtmlDialog;
import creational.factorymethod.factory.WindowsDialog;


public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    // 根据配置或者环境选择具体工厂
    static void configure() {
        if (System.getProperty("os.name").equals("Window 10")) 
            dialog = new HtmlDialog();
        else 
            dialog = new WindowsDialog();
    }

    // 客户端依赖抽象类或接口 不关心具体工厂和具体产品
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
