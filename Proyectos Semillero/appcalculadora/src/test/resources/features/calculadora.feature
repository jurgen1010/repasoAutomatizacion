Feature: realizar operaciones
As a usuario de celular
I want to realizar una opreacion matematica
To obtener un resultado

Scenario Outline:opreaciones
Given julian se encuentra en la calculadora del celular
When realizao la operacion <numero>,<operador>,<numero2>
Then puedo visualizar el resultado <resultado>
Examples:
|numero|operador|numero2|resultado|
|1|+|2|3|
|2|×|3|6|
|4|%|2|1|