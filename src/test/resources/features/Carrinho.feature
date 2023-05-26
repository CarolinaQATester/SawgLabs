#language: pt
@tag
Funcionalidade: Carrinho de Compra

  @CompraSucesso
  Cenario: Realizar uma compra com sucesso
    Dado que o  usuario realize o login
    Quando clico no botao login
    Entao devo acessar o sistema na tela produto
    E seleciono um produto clicando no botao add to cart
    E clico no carrinho
    E clico no botao checkout
    E o usuario preenche suas informacoes
    E clica em continuar
    E valido o valor total da compra
    E clico no botao finish
    E valido a mensagem Thank you for your order!

  @RemoverProduto
  Cenario: CT002. 002 – Remover uma compra com sucesso
    Dado que o  usuario realize o login
    Quando clico no botao login
    Entao devo acessar o sistema na tela produto
    E seleciono um produto clicando no botao add to cart
    E clico no carrinho
    E clico no botao remover
    E clico no botao checkout
    E o usuario preenche suas informacoes
    E clica em continuar
    E valido o valor total da compra esta zerado
    E clico no botao finish
    E valido a mensagem Thank you for your order!

  @AdicionarProduto
  Cenario: CT003.003 – Adicionar mais de um produto no carrinho
    Dado que o  usuario realize o login
    Quando clico no botao login
    Entao devo acessar o sistema na tela produto
    E seleciono dois produto clicando no botao add to cart
    E clico no carrinho
    E clico no botao checkout
    E o usuario preenche suas informacoes
    E clica em continuar
    E valido o valor total da compra de dois produtos
    E clico no botao finish
    E valido a mensagem Thank you for your order!

  @CampoObrigatorio
  Cenario: CT003.004 – Validar informacao sem preencher o campo nome
    Dado que o  usuario realize o login
    Quando clico no botao login
    Entao devo acessar o sistema na tela produto
    E seleciono um produto clicando no botao add to cart
    E clico no carrinho
    E clico no botao remover
    E clico no botao checkout
    E o usuario nao preenche suas informacoes
    E clica em continuar
    E valido a mensagem obrigatoria Error: First Name is required
