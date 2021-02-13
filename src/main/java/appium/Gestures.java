package appium;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.time.Duration;

public class Gestures extends base{
    public static void main(String[] args) throws IOException {
        AndroidDriver<AndroidElement> driver = Capabilities("real");
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        TouchAction t = new TouchAction(driver);
        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");


        t.tap(TapOptions.tapOptions().withElement(ElementOption.element(expandList))).perform();
        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(pn)).
                withDuration(Duration.ofSeconds(2))).release().perform();
        System.out.println(driver.findElementById("android:id/title").isDisplayed());

    }
}
