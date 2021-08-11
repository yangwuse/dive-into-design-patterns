package structural.bridge.bookcode;

import structural.bridge.bookcode.devices.Device;
import structural.bridge.bookcode.devices.Radio;
import structural.bridge.bookcode.devices.TV;
import structural.bridge.bookcode.removes.AdvancedRemote;
import structural.bridge.bookcode.removes.BasicRemote;
import structural.bridge.bookcode.removes.Remote;

// 通过远端控制类控制远端设备

public class Main {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }
    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        Remote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        Remote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
