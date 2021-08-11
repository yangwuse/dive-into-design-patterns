package structural.bridge.my.cars;

import structural.bridge.my.engines.Engine;

// 顶层汽车抽象类
// 定义汽车公共方法

public abstract class Car {
    // 引用引擎对象
    protected Engine engine;
    
    public abstract void drive();    
}
