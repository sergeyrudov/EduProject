package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class basics extends base {

    public static void main(String[] args) throws IOException {
       AndroidDriver<AndroidElement> driver = Capabilities("real");

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Preference\"]").click();
    }
}
