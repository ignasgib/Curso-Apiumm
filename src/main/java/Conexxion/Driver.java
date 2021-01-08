package Conexxion;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private AppiumDriver driver;
    private URL server = null;
    private DesiredCapabilities cap = new DesiredCapabilities();


    public void iniciarSession(String deviceName, String platformName, String appRoute, String uDID, Boolean emulador) {

        try {
            server = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("platformName", "android");
        cap.setCapability("app", "C:\\Users\\Juan.Sierra\\Desktop\\Appium\\registroDeUsuarios.apk");
        //cap.setCapability("udid","emulador-5554");

        driver = new AndroidDriver(server, cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    protected AppiumDriver getDriver() {
        return driver;


    }
}
