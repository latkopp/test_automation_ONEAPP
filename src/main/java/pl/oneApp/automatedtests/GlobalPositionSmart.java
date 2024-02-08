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
import java.util.Map;

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


    /** Metoda sprawdzająca widoczność elementów interfejsu użytkownika na ekranie.
     * dataTable mapa zawierająca nazwy elementów i oczekiwane wartości widoczności*/
    public void smartViewGlobalPosition(Map<String, String> dataTable) throws MalformedURLException {
        // Iteracja po parach klucz-wartość w mapie
        for (Map.Entry<String, String> entry : dataTable.entrySet()) {
            try {
                WebElement element = getDriver().findElement(By.xpath("//*[@content-desc = '" + entry.getKey() + "']"));     // Znajdź element na podstawie jego opisu i pobierz wartość atrybutu "enabled"
                boolean enabled = Boolean.parseBoolean(element.getAttribute("enabled"));
                System.out.println(entry.getKey() + ": " + enabled);                                                                      // Wyświetl nazwę elementu oraz jego stan widoczności (true/false)
                if (enabled != Boolean.parseBoolean(entry.getValue())) {                                                                  // Sprawdź, czy oczekiwana wartość widoczności jest zgodna z rzeczywistą
                    System.out.println("Nieprawidłowa widoczność elementu: " + entry.getKey());                                           // Jeśli wartości nie są zgodne, wyświetl komunikat
                }
            } catch (NoSuchElementException e) {
                System.out.println(entry.getKey() + ": False");                                                                           // Jeśli element nie został znaleziony, wyświetl informację o braku widoczności
            }
        }
    }
}

