package pl.oneApp.automatedtests.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pl.oneApp.automatedtests.utils.AppiumHelper;
import pl.oneApp.automatedtests.utils.DriverFactory;
import pl.oneApp.automatedtests.utils.Scroll;

import java.net.MalformedURLException;
import static pl.oneApp.automatedtests.utils.DriverFactory.getDriver;

public class NewTransferSmart {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[2]/android.widget.FrameLayout")
    private WebElement newTransferSmartButton;

    @FindBy(id = "com.santander.one.pl.zt2:id/oneIcnBack")
    private WebElement backButton;

    @FindBy(id = "com.santander.one.pl.zt2:id/icnPlusWhite")
    private WebElement moreShortcutsButton;

    @FindBy(id = "com.santander.one.pl.zt2:id/toolbar_pg_san_logo")
    private WebElement logoSantander;

    @FindBy(id = "compose:id/bottomBar_home_icon")
    private WebElement desktopButton;

    @FindBy(id = "compose:id/bottomBar_offer_icon")
    private WebElement offerButton;

    @FindBy(id = "compose:id/bottomBar_sendMoney_label")
    private WebElement sendMoneyButton;

    @FindBy(id = "compose:id/bottomBar_more_label")
    private WebElement moreButton;



    public NewTransferSmart(AndroidDriver driver) {  //constructor
        PageFactory.initElements(driver, this);
    }

    public void newTransferSmartView() throws MalformedURLException {
        AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/toolbar_drawer_image_view"));
        newTransferSmartButton.click();
        AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/toolbarPrimaryTitle"));
        Assert.assertTrue(backButton.isDisplayed());
        backButton.click();
    }
}
