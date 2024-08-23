package org.example.steps;

import org.example.screens.CarritoScreen;

public class CarritoSteps {
    CarritoScreen carritoScreen;

    public void SeleccionarProducto(){
       carritoScreen.SeleccionarProducto();
    }
    public void Agregar(){
        carritoScreen.Agregar();
    }
    public void ingresarCantidad(String cantidad){
        carritoScreen.ingresarCantidad(cantidad);
    }
}
