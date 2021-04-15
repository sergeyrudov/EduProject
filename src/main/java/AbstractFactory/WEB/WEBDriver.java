package AbstractFactory.WEB;

import AbstractFactory.AppiumWEBDriver;

public class WEBDriver implements AppiumWEBDriver {

    @Override
    public void getWebDriver() {
        System.out.println("Appium web driver start");
        System.out.println("WEB context activated");
    }
}
