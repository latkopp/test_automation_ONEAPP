package pl.oneApp.automatedtests;

import org.testng.annotations.Test;
import pl.oneApp.automatedtests.pages.*;

import java.net.MalformedURLException;



public class LoginTest extends BaseTest {

    @Test
    public void logInTestSantander() throws MalformedURLException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setPin(2, 2);
        loginPage.tapOK();
        MenuPage menuPage = new MenuPage(driver);
        if (menuPage.isSmartViewValid()) {
            menuPage.setSmartView();
        }
        GlobalPositionSmart globalPositionSmart = new GlobalPositionSmart(driver);
        globalPositionSmart.smartViewGlobalPosition();
        NewTransferSmart newTransferSmart = new NewTransferSmart(driver);
        newTransferSmart.newTransferSmartView();
        QuickAccessViewSmart quickAccessViewSmart = new QuickAccessViewSmart(driver);
        quickAccessViewSmart.quickAccessView();
        ShortcutsViewSmart shortcutsViewSmart = new ShortcutsViewSmart(driver);
        shortcutsViewSmart.moreShortcutsView();
    }
}
