package testSuites;

import Report.Report;
import TestClases.AgregarClienteCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static  conexion.DriverContext.setUp;

public class RegistroDeUsuario {


    @BeforeMethod
    public void IniciarSession(){

    }

    @AfterMethod
    public void cerrarSession(){
        Report.finalassert();
        DriverContext.quitDriver();
    }


    @Test
    public void agegarcliente(){
        AgregarClienteCase test = new AgregarClienteCase();
        test.flujo();
    }
}
