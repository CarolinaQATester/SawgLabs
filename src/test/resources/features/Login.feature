#language: pt
@tag
Funcionalidade: Login

@lSucesso @regressivo
Cenario: CT001.001 – Login Com Sucesso
    Dado que o  usuario realize o login
    Quando clico no botao login
    Entao devo acessar o sistema na tela produto
@lBloqueado @regressivo
Cenario: CT001.002 – Login Com Usuário Bloqueado
    Dado que o  usuario realize o login com bloqueado
    Quando clico no botao login
    Entao valido a mensagem “Epic sadface: Sorry, this user has been locked out.”
@logout
Cenario: CT001.003 – Realizar o logout
    Dado que o  usuario realize o login
    Quando clico no botao login
    Entao devo acessar o sistema na tela produto
    E clico no menu
    E clica no submenu Logout
    E valido se o sistema retorna para a tela de login