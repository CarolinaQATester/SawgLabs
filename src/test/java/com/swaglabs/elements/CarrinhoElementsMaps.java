package com.swaglabs.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoElementsMaps {

    @FindBy(xpath =  "//*[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement btnAddCard;
    @FindBy(xpath = "//*[@id='shopping_cart_container']/a")
    public WebElement btnCarrinho;
    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement btnCheckout;
    @FindBy(xpath = "//input[@id='first-name']")
    public WebElement firtName;
    @FindBy(xpath = "//input[@id='last-name']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='postal-code']")
    public WebElement zipPostCode;
    @FindBy(xpath = "//input[@id='continue']")
    public WebElement btnContinue;
    @FindBy(xpath = "//div[@id='']")
    public WebElement textoTotal;
    @FindBy(xpath = "//button[@id='finish']")
    public WebElement btnFinish;
    @FindBy(xpath="//h2[contains(text(),'Thank you for your order!')]")
    public WebElement mensagemCompraCompleta;
    
}
