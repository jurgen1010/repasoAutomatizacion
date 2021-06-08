Feature: traductor Google
  Yo como usuario web 
  quiero poder traducir una palabra en el traductor de google 
  para aprender otros idiomas

  Scenario Outline: traducir una palabra
    Given que Alejandro esta en la pagina de Traductor de google
    When el traduce con los datos
      | palabra    | idioma origen | idioma destino |
      | <palabra a Traducir>| <idiomaOrigen>       |  <idiomaDestino>        |
    Then el podra ver la palabra <Palabra traducida>
    
    Examples:
    | palabra a Traducir | idiomaOrigen | idiomaDestino |Palabra traducida|
    |Lefatše la bobeli|Sesotho|Yidis|צווייטע וועלט|
    |Hola|Español|Inglés|Hello|