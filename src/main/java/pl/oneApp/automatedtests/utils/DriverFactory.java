package pl.oneApp.automatedtests.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AndroidDriver driver;

    public static AndroidDriver getDriver() throws MalformedURLException {
        if(driver==null){
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "TCL");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            caps.setCapability("appPackage", "com.santander.one.pl.zt2");
            caps.setCapability("appActivity", "es.bancosantander.apps.mobile.android.activities.PublicActivity");
            caps.setCapability(MobileCapabilityType.NO_RESET,true);
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        }
        return driver;
    }

//    public static void resetDriver(){
//        driver = null;
//    }

}
