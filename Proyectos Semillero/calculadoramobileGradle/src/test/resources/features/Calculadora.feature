
Feature: Calculadora android
  Yo como usuario de android
  necesito abrir la calculadora del movil android
  para realizar operaciones aritmeticas

  @Sumar
  Scenario: Sumar
    Given que el usuario se encuentra en la calculadora del movil android
    When el realiza una suma
      | numero1 | numero2 |
      |       3 |       6 |
    Then el podra ver el resultado: 9
