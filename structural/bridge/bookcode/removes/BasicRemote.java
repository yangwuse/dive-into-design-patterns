package structural.bridge.bookcode.removes;

import structural.bridge.bookcode.devices.Device;

// 基本的远端类

public class BasicRemote implements Remote {
    // 保存设备引用
    protected Device device;
    public BasicRemote() {}
    public BasicRemote(Device d) { device = d; }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (device.isEnabled())
            device.disable();
        else
            device.enable();
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");        
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volumn up");        
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");        
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");        
        device.setChannel(device.getChannel() + 1);
    }
}
