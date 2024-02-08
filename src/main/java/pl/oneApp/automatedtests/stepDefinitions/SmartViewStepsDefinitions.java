package pl.oneApp.automatedtests.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import pl.oneApp.automatedtests.BaseTest;
import pl.oneApp.automatedtests.GlobalPositionSmart;
import pl.oneApp.automatedtests.pages.*;

import java.net.MalformedURLException;
import java.util.Map;

public class SmartViewStepsDefinitions extends BaseTest {

    @Autowired
    GlobalPositionSmart globalPositionSmart;
    NewTransferSmart newTransferSmart;
    QuickAccessViewSmart quickAccessViewSmart;
    ShortcutsViewSmart shortcutsViewSmart;



    @When("Wybrany klient jest zalogowany i widzi pulpit na skórce smart")
    public void logowanieDoAplikacji() throws MalformedURLException, InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setPin(2, 2);
        loginPage.tapOK();
        MenuPage menuPage = new MenuPage(driver);
        if (menuPage.isSmartViewValid()) {
            menuPage.setSmartView();
        }
    }

    @Then("Na ekranie \"Pulpit\" wyświetlone są następujące elementy:")
    public void smartGlobalPosition(Map<String, String> dataTable) throws MalformedURLException {
        GlobalPositionSmart globalPositionSmart = new GlobalPositionSmart(driver);
        globalPositionSmart.smartViewGlobalPosition(dataTable);
    }
//
//    @When("Klient na ekranie \"Pulpit\" klika \"Nowy przelew\"")
////    @Then ("Wyświetlony jest ekran \"Nowy przelew\"")
////    @And ("Klient na ekranie \"Nowy przelew\" klika \"Strzałka wstecz\"")
//    public void newTransfer() throws MalformedURLException {
//        NewTransferSmart newTransferSmart = new NewTransferSmart(driver);
//        newTransferSmart.newTransferSmartView();
//    }
//
//
//    @Then("Wyświetlony jest ekran \"Pulpit\"")
////    @When("Klient na ekranie \"Pulpit\" klika \"Szybki dostęp\"")
////    @When("Klient na ekranie \"Szybki dostęp\" klika \"przycisk zamknij\"")
//    public void szybkiDostęp() throws MalformedURLException {
//        QuickAccessViewSmart quickAccessViewSmart = new QuickAccessViewSmart(driver);
//        quickAccessViewSmart.quickAccessView();
//    }
//
//    @When("Klient na ekranie \"Pulpit\" klika przycisk skróty \"+\"")
//    public void wiecejSkrotow() throws MalformedURLException {
//        ShortcutsViewSmart shortcutsViewSmart = new ShortcutsViewSmart(driver);
//        shortcutsViewSmart.moreShortcutsView();
//    }

}
