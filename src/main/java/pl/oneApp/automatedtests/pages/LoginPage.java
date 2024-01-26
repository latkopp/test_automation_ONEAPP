package pl.oneApp.automatedtests.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.oneApp.automatedtests.utils.AppiumHelper;


import java.net.MalformedURLException;


public class LoginPage {

    @FindBy(id = "com.santander.one.pl.zt2:id/pinLoginBtnNum1")
    private WebElement num1;

    @FindBy(id = "com.santander.one.pl.zt2:id/pinLoginBtnNum2")
    private WebElement num2;

    @FindBy(id = "com.santander.one.pl.zt2:id/login_keyboard_ok")
    private WebElement buttonOK;

    @FindBy(id = "com.santander.one.pl.zt2:id/toolbar_drawer_image_view")
    private WebElement hamburgerMenu;



    public LoginPage(AndroidDriver driver){  //constructor
        PageFactory.initElements(driver, this);
    }

    public void setPin(int pin1, int pin2) throws MalformedURLException {
        AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/pinLoginBtnNum1"));
        AppiumHelper.clickFewTimesOnElement(pin1, num1);
        AppiumHelper.clickFewTimesOnElement(pin2, num2);
    }


    public void tapOK() throws MalformedURLException {
        AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/login_keyboard_ok"));
        buttonOK.click();
    }

}
