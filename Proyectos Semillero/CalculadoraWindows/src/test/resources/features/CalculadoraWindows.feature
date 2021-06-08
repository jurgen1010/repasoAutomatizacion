Feature: Calculadora Windows
  Yo como usuario de Windows
  necesito abrir la calculadora de windows
  para realizar operaciones aritmeticas

  @tag1
  Scenario: Suma
    Given que el usuario se encuentra en la calculadora de Windows
    When el realiza una suma
      | numero1 | numero2 |
      |       3 |       6 |
    Then el podra ver el resultado: 9

  @tag2
  Scenario: Multiplicar
    Given que el usuario se encuentra en la calculadora de Windows
    When el realiza una multiplicar
      | numero1 | numero2 |
      |       3 |       6 |
    Then el podra ver el resultado: 18

  @tag3
  Scenario: Dividir
    Given que el usuario se encuentra en la calculadora de Windows
    When el realiza una division
      | numero1 | numero2 |
      |       6 |       3 |
    Then el podra ver el resultado: 2

  @tag4
  Scenario: Restar
    Given que el usuario se encuentra en la calculadora de Windows
    When el realiza una resta
      | numero1 | numero2 |
      |       5 |       4 |
    Then el podra ver el resultado: 1

  @tag5
  Scenario: Operaciones
    Given que el usuario se encuentra en la calculadora de Windows
    When el realiza una resta
      | numero1 | numero2 |
      |      9 |      0 |
    And realiza una division sobre la operacion anterior 3
    Then el podra ver el resultado: 3
