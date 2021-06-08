

Feature: Redes Sociales 
  Yo Como mercaderista de DEMO
  Necesito Realizar la selección en línea de productos de tecnología
  Para Seleccionar   artículos de tecnología en línea para adicionar al canasto y luego realizar el pago.

  

  @tag1
  Scenario: Validar red facebook
    Given que el usuario se encuentra en la pagina principal de Advantage Demo
    When el selecciona la opcion de seguimiento facebook
    |redsocial|facebook|
    Then el podra ver el perfil de la pagina Advantage Demo en facebook 
		
		|	urlperfil|https://www.facebook.com/pages/HP-Application-Lifecycle-Management/142893435778219?fref=ts|
		
		@tag2
  Scenario: Validar red twitter
    Given que el usuario se encuentra en la pagina principal de Advantage Demo
    When el selecciona la opcion de seguimiento twitter
    |redsocial|twitter|
    Then el podra ver el perfil de la pagina Advantage Demo en twitter
		
		|	urlperfil|https://twitter.com/search?q=HPE_ALM|
		
		@tag3
  Scenario: Validar red linkedin
    Given que el usuario se encuentra en la pagina principal de Advantage Demo
    When el selecciona la opcion de seguimiento linkedin
    |redsocial|linkedin|
    Then el podra ver el perfil de la pagina Advantage Demo en linkedin
		
		|	urlperfil|https://www.linkedin.com/showcase/micro-focus-software|
