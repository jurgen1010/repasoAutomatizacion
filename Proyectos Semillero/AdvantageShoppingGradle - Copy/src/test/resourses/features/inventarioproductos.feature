

Feature: Title of your feature
  Yo como product Owner de DEMO
  necesito visualizar el estado de un articulo según su inventario
  para que el usuario no tenga opcion de comprar lo que no está disponible

  @tag1
  Scenario: Calcular precio segun la cantidad del producto
    Given que el usuario ha selecciona un producto
    |nombrecategoria|nombreproducto|
    |headphones|HP H2310 In-ear Headset|
    When el agrega al canasto cierta cantidad del producto
    |cantidad|2|
    Then el podra ver el precio acorde a la cantidad agregada
		|precioesperado|$27.98|
	
	 @tag2
  Scenario: Agregar cantidad de producto al canasto disponible en stock
    Given que el usuario ha selecciona un producto
    |nombrecategoria|nombreproducto|
    |headphones|HP H2310 In-ear Headset|
    When el agrega al canasto cierta cantidad del producto no disponible en stock
    |cantidad|15|
    #And el agrega nuevamente mas cantidad del producto anterior
    Then el podra ver un mensaje de advertencia
		|visibilidadmensaje| Oops! We only have 10 in stock. We updated your order accordingly|	
		And solo la cantidad de producto disponible agregada al canasto
		|cantidadagregada|10|
		
   
