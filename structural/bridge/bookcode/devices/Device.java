package structural.bridge.bookcode.devices;

// 远端设备接口
// 定义所有设备的公共操作

public interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
    void printStatus();
}
