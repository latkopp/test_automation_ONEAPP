package pl.oneApp.automatedtests.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pl.oneApp.automatedtests.utils.AppiumHelper;
import pl.oneApp.automatedtests.utils.Scroll;

import java.net.MalformedURLException;

import static pl.oneApp.automatedtests.utils.DriverFactory.getDriver;

public class QuickAccessViewSmart {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.FrameLayout")
    private WebElement quickAccessSmartButton;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Nowy\n" + "przelew\"]")
    private WebElement newTransferGpSmartView;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"BLIK\"]")
    private WebElement blikButtonQuickAccessSmartView;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Kantor\n" + "Santander\"]")
    private WebElement cantorSantanderButtonQuickAccessSmartView;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Transport, Bilety, Usługi\"]")
    private WebElement mcommerceButtonQuickAccessSmartView;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Poradnik\n" + " cenowy\"]")
    private WebElement priceGuideButtonQuickAccessSmartView;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Alerty24\"]")
    private WebElement alerts24ButtonQuickAccessSmartView;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Dodaj bank\"]")
    private  WebElement addBankQButtonQuickAccessSmartView;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Płatności mobilne\"]")
    private WebElement mobilePaymantButtonQuickAccessSmartView;

    @FindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Moje \n" + "cele\"]")
    private WebElement myGoalsButtonQuickAccessSmartView;

    @FindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Załóż\n" + "lokatę\"]")
    private WebElement newDepositButtonQuickAccessSmartView;

    @FindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Kredyt gotówkowy\"]")
    private WebElement cashLoanButtonQuickAccessSmartView;
    @FindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Program Poleceń\"]")
    private WebElement financeAssistantQuickAccessSmartView;

    @FindBy(id = "com.santander.one.pl.zt2:id/operateBtnClose")
    private WebElement closeButtonOnQuickAccess;

    public QuickAccessViewSmart(AndroidDriver driver) {  //constructor
        PageFactory.initElements(driver, this);
    }
    public void quickAccessView() throws MalformedURLException {
        AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/toolbar_pg_san_logo"));
        quickAccessSmartButton.click();
        AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/operateLabelTitle"));
        Assert.assertTrue(newTransferGpSmartView.isDisplayed());
        Assert.assertTrue(blikButtonQuickAccessSmartView.isDisplayed());
        Assert.assertTrue(cantorSantanderButtonQuickAccessSmartView.isDisplayed());
        Assert.assertTrue(mcommerceButtonQuickAccessSmartView.isDisplayed());
        Assert.assertTrue(priceGuideButtonQuickAccessSmartView.isDisplayed());
        Assert.assertTrue(alerts24ButtonQuickAccessSmartView.isDisplayed());
        Assert.assertTrue(addBankQButtonQuickAccessSmartView.isDisplayed());
        Assert.assertTrue(mobilePaymantButtonQuickAccessSmartView.isDisplayed());
        Assert.assertTrue(myGoalsButtonQuickAccessSmartView.isDisplayed());
        Assert.assertTrue(newDepositButtonQuickAccessSmartView.isDisplayed());
        Assert.assertTrue(cashLoanButtonQuickAccessSmartView.isDisplayed());
//        DriverFactory.getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(“Program”))"));
        Scroll scroll = new Scroll(getDriver());
        scroll.swipeVertical();
        Assert.assertTrue(financeAssistantQuickAccessSmartView.isDisplayed());
        closeButtonOnQuickAccess.click();
    }
}
