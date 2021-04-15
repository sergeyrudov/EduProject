package AbstractFactory;

import AbstractFactory.MFM.DriverFactory;

public class Demo {
    public static void main(String[] args) {
        AppiumFactory appiumFactory = new DriverFactory();

        AppiumAndroidDriver appiumAndroidDriver = appiumFactory.getAndroidDriver();

        AppiumIOSDriver appiumIOSDriver = appiumFactory.getIOsDriver();

        AppiumWEBDriver appiumWEBDriver = appiumFactory.getWebDriver();

        System.out.println("--------Starting appium instance----------");
        appiumAndroidDriver.getAndroidDriver();
        appiumIOSDriver.getIOSDriver();
        appiumWEBDriver.getWebDriver();



    }
}
