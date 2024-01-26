package pl.oneApp.automatedtests;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pl.oneApp.automatedtests.utils.DriverFactory;

import java.net.MalformedURLException;
import java.time.Duration;

public class BaseTest {
    protected AndroidDriver driver;

    public BaseTest() {
        try {
            setup();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeMethod
    public void setup() throws MalformedURLException, InterruptedException {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//    @AfterMethod
//    public void tearDown() {
//        DriverFactory.resetDriver();
//    }



}
