package testSuites;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class EjercicioTestNG {

    private static SoftAssert softAssert = new SoftAssert();

    @BeforeSuite
    public void metodo1(){
        System.out.println("Inicio de Suite");
    }

    @AfterSuite
    public void metodo2(){
        System.out.println("Termino de Suite");

    }

    @Test(priority = 1)
    public void metodo3(){
        System.out.println("Test 1");
        System.out.println("Test 1 ");
    }

    @Test(priority = 2)
    public void metodo4(){
        System.out.println("Test 2");
        Assert.fail();

    }

    @AfterMethod
    public void metodo5(){
        System.out.println("Test 3");

    }
}




