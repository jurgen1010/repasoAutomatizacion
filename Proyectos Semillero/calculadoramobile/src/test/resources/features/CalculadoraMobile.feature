Feature: Calculadora android
  Yo como usuario de Windows
  necesito abrir la calculadora del movil android
  para realizar operaciones aritmeticas

  @tag1
  Scenario: Sumar
    Given que el usuario se encuentra en la calculadora del movil android
    When el realiza una suma
      | numero1 | numero2 |
      |       3 |       6 |
    Then el podra ver el resultado: 9
