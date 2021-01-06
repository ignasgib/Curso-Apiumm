package TestClases;

import Page.CarruselPage;

public class TestCarrusel {


    CarruselPage carruselpage = new CarruselPage();

    public void validaciones(){
        carruselpage.ValidarVistaDesplegada();
        carruselpage.ValidarVistaBtn();
    }

}
