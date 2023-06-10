# language: pt

Funcionalidade: Verificar a entrada de texto no site Natural Readers

  Cenário: Inserir um texto e verificar o retorno
    Dado que estou na página inicial do Natural Readers
    Quando eu insiro o texto no campo de entrada
    E eu clico no botão de reprodução
    Então o texto é reproduzido corretamente
