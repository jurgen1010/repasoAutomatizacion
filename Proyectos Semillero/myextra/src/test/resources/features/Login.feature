
Feature: Login
  I want to use this template for my feature file

  Scenario: Login exitoso
    Given que el usuario se encuentra en la pagina de logueo
    When el ingresa las credenciales 
    |usuario|contrasena|
    |jurgen |1234      |
    Then el podra ver el mensaje You are now logged

   