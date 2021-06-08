Feature: Buscar en Google 
  Yo como usuario web quiero utilizar las expresiones
  de busqueda de google para encontrar la mejor manera de investigar

  
 
	Scenario: Busqueda Simple
    
		Given que Jurgen esta en la pagina google    
		When el busca la expresion screenplay bdd
		Then el podra ver la url serenity-bdd.info/docs/articles/screenplay-tutorial.html
    
 