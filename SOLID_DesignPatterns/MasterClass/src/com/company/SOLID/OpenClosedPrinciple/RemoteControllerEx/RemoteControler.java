package com.company.SOLID.OpenClosedPrinciple.RemoteControllerEx;

public class RemoteControler {

    private static RemoteControler rcInstance = null;
    private Device device = null;

    void chooseDevice(Device aDevice) {

        this.device = aDevice;
        System.out.println("connected to " + device);

    }

    public RemoteControler() {

    }

    public static RemoteControler getInstance () {
        if (rcInstance == null) {
            rcInstance = new RemoteControler();
        }
        return rcInstance;
    }
}
