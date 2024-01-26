package pl.oneApp.automatedtests.utils;


import io.qameta.allure.Attachment;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.net.MalformedURLException;
import java.time.Duration;

public class AppiumHelper {
    public static void  waitForElementToBeClickable(By locator) throws MalformedURLException {
        Wait wait = new FluentWait<>(DriverFactory.getDriver()).ignoring(NoSuchElementException.class, StaleElementReferenceException.class).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void clickFewTimesOnElement(int numberOfClicks, WebElement element){
        for (int i =0; i < numberOfClicks; i++) {
            element.click();
        }
    }


}

