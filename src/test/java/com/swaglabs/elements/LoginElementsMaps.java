package com.swaglabs.elements;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementsMaps {
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='login-button']")
    public  WebElement login_button;
    @FindBy(xpath = "//span[contains(text(),'Products')]")
    public WebElement titulo;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]")
    public WebElement mensagemBloqueada;
    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    public WebElement btnMenu;
    @FindBy(linkText = "Logout")
    public WebElement linkLogout;
    
}
