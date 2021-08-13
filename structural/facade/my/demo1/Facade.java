package structural.facade.my.demo1;

// 系统入口
// 隐藏调用细节

public class Facade {
    private SubSystem1 obj1 = new SubSystem1();
    private SubSystem2 obj2 = new SubSystem2();
    private SubSystem3 obj3 = new SubSystem3();

    public void run() {
        obj1.run();
        obj2.run();
        obj3.run();
    }
}
