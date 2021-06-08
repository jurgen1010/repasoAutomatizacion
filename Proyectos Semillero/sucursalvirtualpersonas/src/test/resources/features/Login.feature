#language: es
Característica: Login
  yo como usuario de bancolombia
  quiero un portal que me ayude a iniciar sesión
  para consultar mi estado de cuenta.


  Escenario: Login fallido
    Dado que Jurgen está en la página Bancolombia Sucursal Virtual Personas
    Cuando él ingresa sus credenciales 
    |usuario |clave|
		|ElsaPito|1234 |
		|ElsaPote|5678 |
		Entonces él debe visualizar el mensaje Usuario o clave inválida. Por favor intente de nuevo.