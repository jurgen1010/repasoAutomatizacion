Feature: Calculadora windows
As a usuario so
I want to realizar operaciones aritmeticas
To aprender matematicas

Scenario Outline: operaciones
Given julian este en la calculadora de windows
When realice la operacion <numero>,<operador>,<numero2>
Then podra ver el resultado<resultado>
Examples:
|numero|operador|numero2|resultado|
|1|Más|2|3|
|2|×|3|6|