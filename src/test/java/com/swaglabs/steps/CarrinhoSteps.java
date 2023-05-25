package com.swaglabs.steps;

import com.swaglabs.Utils;
import com.swaglabs.pages.CarrinhoPage;
import com.swaglabs.pages.LoginPage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CarrinhoSteps {

    LoginPage loginPage = new LoginPage();
    CarrinhoPage carrinhoPage = new CarrinhoPage();

    @Dado("que o usuario realize o login")
    public void que_o_usuario_realize_o_login() throws Throwable{
        loginPage.efetuarLogin();
        loginPage.cliarLogin();
        

    }

    @Quando("o usuario está na tela de produto")
    public void o_usuario_está_na_tela_de_produto() throws Throwable{
        Utils.wait(5);
        loginPage.verificarTexto();
    }

    @Quando("seleciono um produto clicando no botao add to cart")
    public void seleciono_um_produto_clicando_no_botao_add_to_cart() throws Throwable{
        carrinhoPage.clicoBotaoAdd();
    }

    @Quando("clico no carrinho")
    public void clico_no_carrinho() throws Throwable {
        carrinhoPage.clicarBotaoCarrinho();
    }

    @Quando("clico no botao checkout")
    public void clico_no_botao_checkout() throws Throwable{
        carrinhoPage.clicarBotaoCheckout();
    }

    @Quando("o usuario preenche suas informacoes")
    public void o_usuario_preenche_suas_informacoes() throws Throwable{
        carrinhoPage.preencherInformacoes();
    }

    @Quando("clica em continuar")
    public void clica_em_continuar() throws Throwable{
        carrinhoPage.clicarBotaoContinuar();
    }

    @Entao("valido o valor total da compra")
    public void valido_o_valor_total_da_compra() throws Throwable{
        carrinhoPage.validarTextoTotal();
    }

    @Entao("clico no botao finish")
    public void clico_no_botao_finish() throws Throwable{
        carrinhoPage.clicarBtaoFinish();
    }

    @Entao("valido a mensagem Thank you for your order!")
    public void valido_a_mensagem_thank_you_for_your_order() throws Throwable{
        carrinhoPage.validarMensagemCompleta();
    }

}
