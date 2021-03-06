package KotlinExperience

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated
import kotlin.contracts.contract


class Enums {
}

enum class WeekDays(private val mood: String) {


    MONDAY("bad"), TUESDAY("bad"),
    WEDNESDAY("so-so"), THURSDAY("so-so"),
    FRIDAY("good"), SATURDAY("great"),
    SUNDAY("good");





    override fun toString(): String {
        return mood
    }
}


fun main() {

    val screen = "test_"

    val element = "$screen${WeekDays.MONDAY}"

    val driver = ChromeDriver()

    driver.findElementsByXPath("$screen${WeekDays.MONDAY}")

    checkItemAvailability(driver, screen, WeekDays.MONDAY)


}


fun checkItemAvailability(driver: ChromeDriver,locator:String, days: WeekDays):Boolean {
    val s:String = "1231"
    val b:String = "23fwef"

    val c = s.plus(b)


    return driver.findElementsByXPath("$locator${days}").isNotEmpty()


}


