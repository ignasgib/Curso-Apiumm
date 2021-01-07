package testSuites;

import Report.Report;
import TestClases.TestCarrusel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static conexion.DriverContext.setUp;

public class Test extends Report{
    @BeforeMethod
    public void iniciarSession(){


    }

    @AfterMethod
    public void cerrarSession(){
        Report.finalassert();
        DriverContext.quitDriver();
    }

    @org.testng.annotations.Test(description = "Validacion Carrusel")
    public void testCarrusel(){
        TestCarrusel test = new TestCarrusel();
        test.validaciones();
        finalassert();

    }



}
