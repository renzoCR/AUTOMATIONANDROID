package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CarritoScreen extends PageObject {


    @AndroidFindBy(xpath = "  //android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblTitulo;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement ImgProducto1;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAgregar;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement lblCantidad;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Displays number of items in your cart\"]/android.widget.ImageView\"]")
    private WebElement btnCarrito;
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemsTV\"]")
    private WebElement lblCanPrdSeleccionado;

    public boolean islblTituloAvailable(){
        waitFor(ExpectedConditions.visibilityOf(lblTitulo));
        return lblTitulo.isDisplayed();
    }
    public void IngresoExitoso(){
        Assert.assertTrue(islblTituloAvailable());
    }




    public void SeleccionarProducto(){

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(ImgProducto1));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        ImgProducto1.click();
    }
    public void Agregar(){

        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(btnAgregar));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnAgregar.click();
    }
    public void ingresarCantidad(int cantidad) {
        lblCantidad.sendKeys(String.valueOf(cantidad));
    }

    public boolean isProductEnable(){
        waitFor(ExpectedConditions.visibilityOf(ImgProducto1));
        return ImgProducto1.isDisplayed();
    }
    public void AppSucces(){
        Assert.assertTrue(isProductEnable());
    }




    public void VerificarCompra(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(btnCarrito));
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnCarrito.click();
    }
    public boolean isCantidadEnable(){
        waitFor(ExpectedConditions.visibilityOf(lblCanPrdSeleccionado));
        return lblCanPrdSeleccionado.isDisplayed();
    }
    public void CompraSucces(){
        Assert.assertTrue(isCantidadEnable());
    }
}
