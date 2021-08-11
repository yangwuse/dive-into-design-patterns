package structural.bridge.bookcode.removes;

// 顶层远端接口
// 定义用户操作逻辑

public interface Remote {
    void power();
    void volumeDown();
    void volumeUp();
    void channelDown();
    void channelUp();
    // 添加新操作
    default void mute() {}
}
