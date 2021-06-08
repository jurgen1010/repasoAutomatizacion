

Feature: Solicitar Credito
  Yo como usuario de Bancolombia 
  deseo realizar la simulacion de un credito
	con el fin de conocer capacidad de credito que puedo adquirir
  
  Scenario Outline: Simular Credito
    Given que el usuario se encuantra en la pagina de simulador tu credito de Bancolombia
    When el diligencia la solicitud del credito con los datos
    |simular  |fechanacimiento   |tasa  |tipocredito   |plazomeses   |valorprestamo   |
    |<simula>|<Fecha Nacimiento>|<Tasa>|<Tipo Credito>|<Plazo Meses>|<Valor Prestamo>|
    Then el podra ver el resultado de la simulacion 17.46%
    

    Examples: 
      | simula          | Fecha Nacimiento | Tasa       |Tipo Credito               | Plazo Meses| Valor Prestamo |
      | Simula tu Cuota |  1990-10-11      | Tasa Fija  |Crédito de Libre Inversión |37          |2000000         |
     
