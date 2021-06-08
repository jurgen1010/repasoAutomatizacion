@tag
Feature: Calculadora multiplataforma
Yo como usuario multiplataforma
Necesito una calculadora web, movil y desktop
Para realizar operaciones aritmeticas de dos digitos

  @tag1
  Scenario: suma
    Given que el usuario abre la calculadora web, movil y desktop
    When el usuario realiza una suma con el numero 5 y el numero 7 en la calculadora web
    And el usuario realiza una suma con el numero 5 y el numero 7 en la calculadora movil
    And el usuario realiza una suma con el numero 5 y el numero 7 en la calculadora desktop
    Then los tres resultados deberian ser 12
    And deberian ser iguales en todas las plataformas


