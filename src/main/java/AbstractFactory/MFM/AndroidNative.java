package AbstractFactory.MFM;

import AbstractFactory.AppiumAndroidDriver;

public class AndroidNative implements AppiumAndroidDriver {

    @Override
    public void getAndroidDriver() {
        System.out.println("Android driver started");
        System.out.println("capabilities applied");
        System.out.println("--------------------");
    }
}
