package com.swaglabs.pages;


import org.openqa.selenium.support.PageFactory;

import com.swaglabs.TestRule;
import com.swaglabs.elements.LoginElementsMaps;



public class LoginPage extends LoginElementsMaps{

    public LoginPage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void efetuarLogin() {
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
    }
    public void efetuarLoginBloqueado(){
        username.sendKeys("locked_out_user");
        password.sendKeys("secret_sauce");
    }
    public void efetuarLoginComProblema() {
        username.sendKeys("problem_user");
        password.sendKeys("secret_sauce");
    }
  
    public void cliarLogin() {
        login_button.click();
    }

    public boolean verificarTexto() {

        try {
            synchronized(TestRule.getDriver()){
                TestRule.getDriver().wait(1000);
            }
        } catch (InterruptedException e) {
           e.printStackTrace(); 
        }
        String texto = titulo.getText();
        System.out.println("Texto exibido: " + texto);
        if (texto.contains("Products")){
            return true;
        }else{
            return false;
        }
       
    }
    public boolean mensagemBloqueada(){
        try {
            synchronized(TestRule.getDriver()){
                TestRule.getDriver().wait(3000);
            }
        } catch (InterruptedException e) {
           e.printStackTrace(); 
        }
        String mensagem = mensagemBloqueada.getText();
        System.out.println("Exibir mensagem: " + mensagem);
        if (mensagem.contains("Epic sadface: Sorry, this user has been locked out.")){
            return true;
        }else{
            return false;
        }
    }

    public void clicarMenu() {
        btnMenu.click();
    }

    public void clicarSubMenuLogout() {
        linkLogout.click();
    }

    public boolean elementoExiste() {
        Boolean existe = username.isDisplayed();
        return existe;
    }


}
