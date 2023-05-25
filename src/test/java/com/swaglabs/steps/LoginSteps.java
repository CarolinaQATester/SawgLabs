package com.swaglabs.steps;

import org.junit.Assert;

import com.swaglabs.Utils;
import com.swaglabs.pages.LoginPage;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Dado("que o  usuario realize o login")
    public void que_o_usuario_realize_o_login() {
        loginPage.efetuarLogin();
        Utils.logPrint("Dados para realizar login");
    }

    @Quando("clico no botao login")
    public void clico_no_botao_login() {
        loginPage.cliarLogin();
        // Utils.logPrint("Login realizado com sucesso!");
    }

    @Entao("^devo acessar o sistema na tela produto$")
    public void devo_acessar_o_sistema_na_tela_produto() throws Throwable {
        boolean exibiuTexto = loginPage.verificarTexto();
        if (exibiuTexto) {
            Utils.logPass("Usuario está na pagina de produtos");
        } else {
            Utils.logFail("Ocorreu algum erro ao tentar logar");
        }
        Assert.assertTrue("Não exibiu o texto correto", exibiuTexto);
    }

    @Dado("que o  usuario realize o login com bloqueado")
    public void que_o_usuario_realize_o_login_com_bloqueado() {
        loginPage.efetuarLoginBloqueado();
        Utils.logPrint("Dados para realizar login");
    }

    @Entao("valido a mensagem “Epic sadface: Sorry, this user has been locked out.”")
    public void valido_a_mensagem_epic_sadface_sorry_this_user_has_been_locked_out() throws Throwable {

        boolean mensagemBloqueada = loginPage.mensagemBloqueada();
        if (mensagemBloqueada) {
            Utils.logPass("Usuario está está bloqueado");
        } else {
            Utils.logFail("Ocorreu algum erro ao tentar logar");
        }
        Assert.assertTrue("Não exibiu o texto correto", mensagemBloqueada);
    }

    @Quando("o usuario esta na tela de produto")
    public void o_usuario_esta_na_tela_de_produto() throws Throwable {
        devo_acessar_o_sistema_na_tela_produto();
       
    }

    @Quando("clico no menu")
    public void clico_no_menu() throws Throwable{

        loginPage.clicarMenu();
    }

    @Quando("clica no submenu Logout")
    public void clica_no_submenu_logout() throws Throwable{
        loginPage.clicarSubMenuLogout();
    }

    @Entao("valido se o sistema retorna para a tela de login")
    public void valido_se_o_sistema_retorna_para_a_tela_de_login()throws Throwable{
        loginPage.elementoExiste();
    }

}
