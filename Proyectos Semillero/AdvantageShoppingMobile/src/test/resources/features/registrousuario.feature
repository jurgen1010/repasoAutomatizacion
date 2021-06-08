
Feature: Registro de nuevos usuarios
  Yo como Administrador del portal DEMO
  necesito la creación de la cuenta de  nuevos usuarios.
  para la fidelización de los clientes y que estos puedan hacer sus compras online

  @registro_exitoso
  Scenario: regitro usuario exitoso
    Given que el administrador se encuentra en la pagina de registro
    When el registra un usuario
      | username | email      | password | confirmpassword | firstname | lastname | phonenumber | country  | city     | address  | state_province_region | postalcode | conditionsofUse | receiveoffers |
      | Jurgen31 | n@nada.com | Roka5555 | Roka5555        | Jurgen    | Perez    |   123456789 | Colombia | Medellín | calle 16 | San Pablo             |      12345 | si              | no            |
    Then el podra ver su nombre de usuario en pantalla
      | usernameEsperado |
      | Jurgen31         |
