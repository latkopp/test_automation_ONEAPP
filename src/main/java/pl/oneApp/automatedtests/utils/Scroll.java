package pl.oneApp.automatedtests.utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pl.oneApp.automatedtests.utils.DriverFactory;


import java.net.MalformedURLException;
import java.time.Duration;


import static pl.oneApp.automatedtests.utils.DriverFactory.getDriver;


public class Scroll {

    public Scroll(AndroidDriver driver) {  //constructor
        PageFactory.initElements(driver, this);
    }

    public void swipeHorizontal(double startPercentage, double finalPercentage, double heightPercentage) throws MalformedURLException {
        Dimension size = DriverFactory.getDriver().manage().window().getSize();
        int heightOfSwipe = (int) (size.height * heightPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * finalPercentage);
        TouchAction touchAction = new TouchAction(getDriver());
        touchAction.press(PointOption.point(startPoint, heightOfSwipe))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(endPoint, heightOfSwipe)).release().perform();

    }
    public void swipeCarouselToLeft() throws MalformedURLException {
        swipeHorizontal(0.8, 0.3, 0.25);
    }

    public void swipeVertical() throws MalformedURLException {
        TouchAction touchAction = new TouchAction(DriverFactory.getDriver());
        touchAction.press(PointOption.point(100,1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(100,100)).release().perform();
//        getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(“Program”))"));


    }

}


