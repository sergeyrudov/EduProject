package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class base {
    public static AndroidDriver<AndroidElement> Capabilities(String device) throws IOException {

        File f = new File("src/main/java/appium/");
        File fs = new File(f, "ApiDemos-debug.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        if(device.equals("real")) {
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM_N975U1");
        } else {
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelText2");
        }
        capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AppiumDriverLocalService.buildDefaultService().start();



        AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        return driver;

}

}
