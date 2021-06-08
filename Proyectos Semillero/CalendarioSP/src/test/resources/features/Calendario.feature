Feature: Calendario Movil
  Yo como usuario Android
  quiero agregar eventos en mi calendario 
  para recordarlos 

  @Agregarcumpleaños
  Scenario: Agregar cumpleaños 
    Given que el usuario se encuentra en el calendario Android
    When el agrega una fecha de cumpleaños
    |Dia|sábado, 16 de noviembre de 2019|
    |Mes|NOV.|
    |Año|2019|
    |Titulo|Cumpleanos mama|
    |Nota|Feliz cumpleanos|
    Then el podra ver el evento creado en su calendario
    |Evento|Cumpleanos mama|
    

