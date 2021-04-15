package AbstractFactory.MFM;

import AbstractFactory.AppiumAndroidDriver;
import AbstractFactory.AppiumFactory;
import AbstractFactory.AppiumIOSDriver;
import AbstractFactory.AppiumWEBDriver;
import AbstractFactory.WEB.WEBDriver;

public class DriverFactory implements AppiumFactory {

    @Override
    public AppiumWEBDriver getWebDriver() {
        return new WEBDriver();
    }

    @Override
    public AppiumAndroidDriver getAndroidDriver() {
        return new AndroidNative();
    }

    @Override
    public AppiumIOSDriver getIOsDriver() {
        return new iOSNative();
    }
}
