package TestClases;

import Page.CarruselPage;

public class AgregarClienteCase {

    CarruselPage carruselPage = new CarruselPage();

    public void flujo(){
        carruselPage.ValidarVistaBtn();
        carruselPage.recorrerCarrusel();
        carruselPage.botonHecho();
    }


}
