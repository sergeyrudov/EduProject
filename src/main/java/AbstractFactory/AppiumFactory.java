package AbstractFactory;

public interface AppiumFactory {

    AppiumWEBDriver getWebDriver();

    AppiumAndroidDriver getAndroidDriver();

    AppiumIOSDriver getIOsDriver();
}
