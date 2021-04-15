package AbstractFactory.MFM;

import AbstractFactory.AppiumIOSDriver;

public class iOSNative implements AppiumIOSDriver {

    @Override
    public void getIOSDriver() {
        System.out.println("IOS Driver started");
        System.out.println("capabilities applied");
        System.out.println("--------------------");
    }
}
