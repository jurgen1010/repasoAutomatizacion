Feature: Validacion Calculadores crossplatform
As a crossplatform user
I want to una calculadora web, mobile y desktop
To realizar operaciones arimeticas de dos digitos desde donde me encuentre

Scenario: Operaciones aritmeticas de dos digitos
Given que abro la calculadora Web, Mobile y Desktop
When realizo la operacion + con el numero 2 y el numero 3 en la web
When realizo la operacion + con el numero 2 y el numero 3 en el movil
When realizo la operacion + con el numero 2 y el numero 3 en el escritorio
Then los tres resultados deberian ser 5
And deberian ser iguales en todas las plataformas