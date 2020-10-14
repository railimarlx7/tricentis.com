#language:pt
#utf-8
@CT01
Funcionalidade: Envio de e-email de cotacao de veiculos 

			Objetivo: Preencher os formluarios solicitados na aplicacao, solicitar a cotacao por email e validar a mensagem de retorno.

  @CT01
  Esquema do Cenário: Realizar checkout de compra.
    Dado que acesso o site sampleapp.tricentis.com
    Quando preecho o formulario, aba Enter Vehicle Data
    E preecho o formulario, aba  Enter Insurant Data
    E preecho o formulario, aba  Enter Product Data
    E preecho o formulario, aba Select Price Option
    E preecho o formulario, aba Send Quote
    Entao verifico a mensagem "<mensagem>" na tela
    
    Exemplos: 
   						| mensagem            		|
    					| Sending e-mail success! |
