#language: pt
@tag
Funcionalidade: Carrinho de Compra

@CompraSucesso
Cenario: Realizar uma compra com sucesso
    Dado que o usuario realize o login
    Quando clico no botao login
    E o usuario esta na tela de produto
    E seleciono um produto clicando no botao add to cart
    E clico no carrinho
    E clico no botao checkout
    E o usuario preenche suas informacoes
    E clica em continuar
    Entao valido o valor total da compra
    E clico no botao finish
    Entao valido a mensagem Thank you for your order!