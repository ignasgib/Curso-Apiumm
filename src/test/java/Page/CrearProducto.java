package Page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.model.Status;
import org.openqa.selenium.support.PageFactory;

import static Report.Report.addStep;
import static Utils.Utils.esperarObjeto;

public class CrearProducto {

    private static MobileElement boxNombreProducto;
    private AppiumDriver driver;
    public CrearProducto(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    /**
     * Objetos
     */
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Más opciones\"]")
    private MobileElement options;
    @AndroidFindBy (id = "com.rodrigo.registro:id/nombre_producto")
    private MobileElement boxNombreProducto;
    @AndroidFindBy (id = "com.rodrigo.registro:id/precio")
    private MobileElement boxPrecio;
    @AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]")
    private MobileElement btnBack;
    @AndroidFindBy (id = "com.rodrigo.registro:id/confirmar")
    private MobileElement btnConfirmar;

    public void crearProducto(String nombre, String precio){
        if (esperarObjeto(boxNombreProducto,5)){
            boxNombreProducto.sendKeys(nombre);
            addStep("Nombre del producto rellenado",true, Status.PASSED,false);
        }
        else addStep("Nombre del producto rellenado",true, Status.FAILED,false);
        if (esperarObjeto(boxPrecio,5)){
            boxPrecio.sendKeys(precio);
            addStep("Precio del producto rellenado",true, Status.PASSED,false);
        }
        else addStep("Precio del producto rellenado",true, Status.FAILED,false);
        if (esperarObjeto(btnConfirmar,5)){
            btnConfirmar.click();
            addStep("Click en confirmar",true, Status.PASSED,false);
        }
        else addStep("Click en confirmar",true, Status.FAILED,false);
    }
    public static boolean validarCrearProducto(){
        return esperarObjeto(boxNombreProducto, 5);
    }


}
