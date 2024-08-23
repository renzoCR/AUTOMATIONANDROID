package com.nttdata.steps;

import com.nttdata.screens.CarritoScreen;
import net.thucydides.core.annotations.Step;

public class CarritoSteps {

    CarritoScreen carritoScreen;

    /*@Step("Click en cerrar")
    public void clickClose(){
        carritoScreen.clickClose();
    }

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
        searchScreen.clickSearchInput();
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickFirstOption();
        searchDetailsScreen.clickNext();
        searchDetailsScreen.clickSearch();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return searchScreen.getResultText();
    }
    */
    public void ingresoExitoso(){
        carritoScreen.IngresoExitoso();
    }

    public void SeleccionarProducto(){
        carritoScreen.SeleccionarProducto();
    }
    public void Agregar(){
        carritoScreen.Agregar();
    }
    public void ingresarCantidad(int cantidad){
        carritoScreen.ingresarCantidad(cantidad);
    }
    public void appSccess(){
        carritoScreen.AppSucces();
    }



    public void VerificarCompra(){
        carritoScreen.VerificarCompra();
    }
    public void compraSucces(){
        carritoScreen.CompraSucces();
    }
}
