package structural.bridge.bookcode.removes;

import structural.bridge.bookcode.devices.Device;

// 包含高级功能的远端类

public class AdvancedRemote extends BasicRemote{
    public AdvancedRemote(Device d) {
        super.device = d;
    }
    // 覆盖接口中的默认方法 静音
    public void mute() {
        device.setVolume(0);
    }
}
