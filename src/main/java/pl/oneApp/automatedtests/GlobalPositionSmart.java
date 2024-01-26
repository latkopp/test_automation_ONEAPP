package pl.oneApp.automatedtests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pl.oneApp.automatedtests.utils.AppiumHelper;

import java.net.MalformedURLException;

import static pl.oneApp.automatedtests.utils.DriverFactory.getDriver;

public class GlobalPositionSmart {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.FrameLayout")
    private WebElement newTransferSmartButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.FrameLayout")
    private WebElement quickAccessSmartButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[4]/android.widget.FrameLayout")
    private WebElement historySmartButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[5]/android.widget.FrameLayout")
    private WebElement blikSmartButton;

    public GlobalPositionSmart(AndroidDriver driver) {  //constructor
        PageFactory.initElements(driver, this);
    }
    public void smartViewGlobalPosition() throws MalformedURLException {
        AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/toolbar_drawer_image_view"));
        Assert.expectThrows(NoSuchElementException.class, () -> getDriver().findElement(By.id("compose:id/bottomBar_home_icon")));
        Assert.expectThrows(NoSuchElementException.class, () -> getDriver().findElement(By.id("compose:id/bottomBar_offer_icon")));
        Assert.expectThrows(NoSuchElementException.class, () -> getDriver().findElement(By.id("compose:id/bottomBar_sendMoney_label")));
        Assert.expectThrows(NoSuchElementException.class, () -> getDriver().findElement(By.id("compose:id/bottomBar_more_label")));
        Assert.assertTrue(quickAccessSmartButton.isDisplayed());
        Assert.assertTrue(newTransferSmartButton.isDisplayed());
        Assert.assertTrue(historySmartButton.isDisplayed());
        Assert.assertTrue(blikSmartButton.isDisplayed());
    }
}
