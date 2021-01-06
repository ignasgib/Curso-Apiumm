package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.model.Status;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

import static Report.Report.addStep;

public class CarruselPage {

    private AppiumDriver driver;

    public CarruselPage(){

        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);

    }

   // Obejetos

    @AndroidFindBy(id="com.rodrigo.registro:id/imageView2")
    private MobileElement iconovista;

    @AndroidFindBy(id="com.rodrigo.registro:id/next")
    private MobileElement btnFlecha;

    public void ValidarVistaDesplegada(){
       if(iconovista.isDisplayed()){
           addStep("validar lista desplegada",true, Status.PASSED,false);
        } else{
           addStep("validar lista desplegada",true, Status.FAILED,true);
       }
    }
    public void ValidarVistaBtn(){
        if(btnFlecha.isDisplayed()){
            addStep("validar boton desplegar",true, Status.PASSED,false);
        } else{
            addStep("validar boton desplegadar",true, Status.FAILED,true);
        }
    }

}
