package pl.oneApp.automatedtests.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.oneApp.automatedtests.utils.AppiumHelper;
import pl.oneApp.automatedtests.utils.DriverFactory;
import pl.oneApp.automatedtests.utils.Scroll;

import java.net.MalformedURLException;

public class MenuPage {

    @FindBy(id = "com.santander.one.pl.zt2:id/toolbar_drawer_image_view")
    private WebElement hamburgerMenu;

    @FindBy(id = "compose:id/sidebarNavigationListItem_personalisation_label")
    private WebElement personalisationMenu;
    @FindBy(id = "compose:id/interactiveListItem_GlobalPositionCustomization_description")
    private WebElement customizeGlobalPosition;
    @FindBy(id = "compose:id/pg_customize_save_btn")
    private WebElement saveViewButton;

    @FindBy(id = "compose:id/bottomBar_home_label")
    private WebElement homeButton;

    @FindBy (xpath = "//android.widget.LinearLayout[@content-desc=\"Szybki \n" + "dostęp\"]")
    private WebElement quickAccessButton;



    public MenuPage(AndroidDriver driver) {  //constructor
        PageFactory.initElements(driver, this);
    }

    public void menuView() throws MalformedURLException {
        AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/toolbar_drawer_image_view"));
        hamburgerMenu.click();
        AppiumHelper.waitForElementToBeClickable(By.id("compose:id/sidebarNavigationListItem_personalisation_label"));
        personalisationMenu.click();
        AppiumHelper.waitForElementToBeClickable(By.id("compose:id/interactiveListItem_GlobalPositionCustomization_description"));
        customizeGlobalPosition.click();

    }

    public void setSmartView() throws MalformedURLException {
        menuView();
        Scroll scrollToElement = new Scroll(DriverFactory.getDriver());
        scrollToElement.swipeCarouselToLeft();
        scrollToElement.swipeCarouselToLeft();
        saveViewButton.click();
    }

    public boolean isSmartViewValid(){
        try{
            AppiumHelper.waitForElementToBeClickable(By.id("com.santander.one.pl.zt2:id/toolbar_drawer_image_view"));
            homeButton.isDisplayed();
            return true;

        }catch(Exception e){
            //System.out.println(e);
            return false;
        }
    }
}