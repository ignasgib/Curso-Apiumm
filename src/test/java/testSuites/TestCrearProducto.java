package testSuites;

import Page.CarruselPage;
import Page.CrearProducto;
import Page.Registro;
import conexion.DriverContext;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestCrearProducto {

    DriverContext driverContext;
    CarruselPage carruselPage;
    Registro registroPage;
    CrearProducto validarCrearProducto;
    private Object CrearProducto;


    @BeforeSuite
    public void iniciarSession(){
        driverContext = new DriverContext();
        driverContext.setUP("emulator-5554","Android","C:\\Users\\Gabriel.Marinan\\Downloads\\registroDeUsuarios.apk", "emulator-5554",true);
        System.out.println("Applicacion desplegada");
    }
    @org.testng.annotations.Test(priority = 1,description = "Validación carrusel")
    public void validarDespliegue(){
        carruselPage = new CarruselPage();
        carruselPage.ValidarVistaDesplegada();
        finalAssert();

    }
    @org.testng.annotations.Test(priority = 2,description = "Recorrer carrusel")
    public void carrusel(){
        carruselPage.recorrerCarrusel();
        Registro = new Registro();
        Assert.assertTrue(registroPage.validarRegistroPage());
        finalAssert();
    }
    @Test(priority = 3,description = "Ir a la page Crear Producto",enabled = false)
    public void irCrearProducto(){
        Registro.irCrearProducto();
        CrearProducto = new CrearProducto();
        Assert.assertTrue(CrearProducto.validarCrearProducto());
        finalAssert();
    }
    @org.testng.annotations.Test(priority = 4,description = "Crear un producto",enabled = false)
    public void crearProducto(){
        CrearProducto crearProducto = null;
        crearProducto.crearProducto("Producto1","55555");
        Assert.assertTrue(registroPage.validarRegistroPage());
        finalAssert();
    }
    @Test(priority = 5,description = "Validar si el producto se creó correctamente",enabled = true)
    public void validarProducto(){
        registroPage.clickProductos();
        Assert.assertTrue(registroPage.findProductByName("Producto1"));
        Assert.assertTrue(registroPage.findByPrice("55555"));
    }
    @AfterSuite
    public void cerrarSession(){
        driverContext.quitDriver();
    }

}
