package Utils;

import Conexxion.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.support.ui.ExpectedConditions;
import driver.DriverContext;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils {

    public static boolean esperarObjeto(MobileElement elemento, int segundos){
        try {
            System.out.println("Buscamos elemento:" + elemento + ",esperamos " + segundos + ", hasta que aparezca");
            WebDriverWait wait = new WebDriverWait(DriverContext.getDriver(), segundos);
            wait.until(ExpectedConditions.visibilityOf(elemento));
            System.out.println("se encontro el elemento (" + elemento + "),se retorna true");
            return true;
        }catch (Exception e){
            System.out.println("No se encontro el elemento (" + elemento + "),se retorna false");
            return false;
        }
    }
    public static void swipeAbajo(){


        int ancho = (int) (DriverContext.getDriver().manage().windows().getSize().width * 0.08D);
        int startpoint = (int) (DriverContext.getDriver().manage().windows().getSize.height * 0.9D);
        int endPoint = (int) (DriverContext.getDriver().manage().windows().getSize.height * 0.65D);

        TouchAction touchAction = new TouchAction(DriverContext.getDriver());
        touchAction.press(PointOption.point(ancho,startpoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(500l))).moveTo(PointOption.point(ancho,endPoint)).release() .perform();
        System.out.println("[Utils] swipe hacia abajo");

    }

}
