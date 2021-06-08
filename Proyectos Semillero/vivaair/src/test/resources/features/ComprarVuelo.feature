
Feature: Comprar tiquete de vuelo
  Yo como usuario de viva air
  Deseo comprar un vuelo de ida 
  Con el fin de viajar

  
  Scenario Outline: Reservar tiquete de ida
    Given que el usuario se encuentra en la pagina de viva air
    When ingresa los datos de la reserva 
    
    |origen|destino|nroadultos|fechaida|moneda|paqueteviva|nombres|apellidos|genero|nrodocumento|asistencia|correoelectronico|celular|tiposilla|
    |<origen>|<destino>|<nroadultos>|<fechaida>|<moneda>|<paqueteviva>|<nombres>|<apellidos>|<genero>|<nrodocumento>|<asistencia>|<correoelectronico>|<celular>|<tiposilla>|
    
    
    Then el podra reservar el tiquete 
    

    Examples: 
      |origen|destino|nroadultos|fechaida|moneda|paqueteviva|nombres|apellidos|genero|nrodocumento|asistencia|correoelectronico|celular|palabraesperada|tiposilla|
   		|Bogotá (BOG)|Cartagena (CTG)|1|20/10/2018|COP|full|Daniel|Garcia|Femenino|1037345132|No|n@nada.com|3107780945|Asientos|Preferred|
