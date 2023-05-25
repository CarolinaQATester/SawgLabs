package com.swaglabs.pages;

import org.openqa.selenium.support.PageFactory;

import com.swaglabs.TestRule;
import com.swaglabs.elements.CarrinhoElementsMaps;

public class CarrinhoPage extends CarrinhoElementsMaps {

    public CarrinhoPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void clicoBotaoAdd() {
        btnAddCard.click();
    }

    public void clicarBotaoCarrinho() {
        btnCarrinho.click();
    }

    public void clicarBotaoCheckout() {
        btnCheckout.click();
    }

    public void preencherInformacoes() {
        firtName.sendKeys("Teste");
        lastName.sendKeys("Automatizado");
    }

    public void clicarBotaoContinuar() {
        btnContinue.click();
    }

    public boolean validarTextoTotal() {
        try {
            synchronized (TestRule.getDriver()) {
                TestRule.getDriver().wait(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String texto = textoTotal.getText();
        System.out.println("Texto exibido: " + texto);
        if (texto.contains("Total: $32.39")) {
            return true;
        } else {
            return false;
        }
    }

    public void clicarBtaoFinish() {
        btnFinish.click();
    }

    public boolean validarMensagemCompleta() {
        try {
            synchronized(TestRule.getDriver()){
                TestRule.getDriver().wait(3000);
            }
        } catch (InterruptedException e) {
           e.printStackTrace(); 
        }
        String mensagem = mensagemCompraCompleta.getText();
        System.out.println("Exibir mensagem: " + mensagem);
        if (mensagem.contains("Thank you for your order!")){
            return true;
        }else{
            return false;
        }
    }
}
