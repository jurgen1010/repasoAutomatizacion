

Feature: Modulo Usuarios
  Yo como administrador de la pagina Orange
  quiero tener un modulo para crear usuarios
  con el fin de registrar un nuevo personal.

 
  Scenario Outline: Iniciar sesion
    Given que el <usuario> está en la pagina Orangehrm
    When el ingresa un usuario <usuario> y una contraseña <contraseña>
    Then el usuario visualiza el nombre <nombre>

    Examples: 
      | usuario  | contraseña | nombre          |
      | admin    | admin123   | Jacqueline White|
 			| Jadine     | user12345   | Jadine Jackie | 
 
  