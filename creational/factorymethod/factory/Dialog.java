package creational.factorymethod.factory;

import creational.factorymethod.buttons.Button;

// 基类工厂 
// 包含一些核心业务逻辑 需要不同的产品

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
    // 子类覆盖该方法 产生具体产品对象
    public abstract Button createButton();
}
  