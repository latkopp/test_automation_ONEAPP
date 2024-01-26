package pl.oneApp.automatedtests.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pl.oneApp.automatedtests.utils.AppiumHelper;

import java.net.MalformedURLException;

public class ShortcutsViewSmart {
    @FindBy(id = "com.santander.one.pl.zt2:id/icnPlusWhite")
    private WebElement moreShortcutsButton;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Centrum\n" + "pomocy\"]")
    private WebElement helpCentreButtonShortcutsViewSmart;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Oferta\"]")
    private WebElement offerButtonShortcutsViewSmart;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Zostaw\n" + "opinię\"]")
    private WebElement shareYourOpinionButtonShortcutsViewSmart;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Bankomaty \n" + "i oddziały\"]")
    private WebElement atmAndBranchesButtonShortcutsViewSmart;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Twoje\n" + "sprawy\"]")
    private WebElement accountServicesButtonShortcutsViewSmart;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"eWyciągi\"]")
    private WebElement eStatmentsButtonShortcutsViewSmart;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Ślad węglowy\"]")
    private WebElement carbonFootprintButtonShortcutsViewSmart;

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Rabaty\"]")
    private WebElement discountsButtonShortcutsViewSmart;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Poradnik\n" + " cenowy\"]")
    private WebElement priceAdvisorButtonShortcutsViewSmart;

    public ShortcutsViewSmart(AndroidDriver driver) {  //constructor
        PageFactory.initElements(driver, this);

        }
        public void moreShortcutsView () throws MalformedURLException {
            AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/icnPlusWhite"));
            moreShortcutsButton.click();
            AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/pg_title_modalFrequentOperative"));
            Assert.assertTrue(helpCentreButtonShortcutsViewSmart.isDisplayed());
            Assert.assertTrue(offerButtonShortcutsViewSmart.isDisplayed());
            Assert.assertTrue(shareYourOpinionButtonShortcutsViewSmart.isDisplayed());
            Assert.assertTrue(atmAndBranchesButtonShortcutsViewSmart.isDisplayed());
            Assert.assertTrue(accountServicesButtonShortcutsViewSmart.isDisplayed());
            Assert.assertTrue(eStatmentsButtonShortcutsViewSmart.isDisplayed());
            Assert.assertTrue(carbonFootprintButtonShortcutsViewSmart.isDisplayed());
            Assert.assertTrue(discountsButtonShortcutsViewSmart.isDisplayed());
            Assert.assertTrue(priceAdvisorButtonShortcutsViewSmart.isDisplayed());

        }
    }
