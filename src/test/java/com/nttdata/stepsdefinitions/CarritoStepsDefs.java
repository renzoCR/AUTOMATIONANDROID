package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class CarritoStepsDefs {

    @Steps
    CarritoSteps steps;


    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        steps.ingresoExitoso();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        steps.appSccess();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(int arg0, String arg1) {
        steps.SeleccionarProducto();
        steps.ingresarCantidad(arg0);
        steps.Agregar();
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        steps.VerificarCompra();
        steps.compraSucces();
    }

}
