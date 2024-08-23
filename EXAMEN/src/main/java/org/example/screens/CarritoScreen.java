package org.example.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
public class CarritoScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement ImgProducto1;
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAgregar;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement lblCantidad;

    public void SeleccionarProducto(){
        ImgProducto1.click();
    }
    public void Agregar(){
        btnAgregar.click();
    }
    public void ingresarCantidad(String cantidad){
        lblCantidad.sendKeys(cantidad);
    }
    public boolean isProductEnable(){
        return ImgProducto1.isDisplayed();
    }
    public void AppSucces(){
        Assert.assertTrue(isProductEnable());
    }
}
