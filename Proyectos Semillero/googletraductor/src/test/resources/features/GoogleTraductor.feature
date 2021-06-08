	Feature: Traducir palabra
  Yo como usuario quiero traducir una palabra en google translate

  Scenario Outline: traducir
    Given que Jhoan esta en el traductor de Google.
    When el escribe la palabra <palabra> del idioma <origen> al idioma <destino>
    Then el podra ver la palabra <traducida>

  Examples:
  |palabra|origen|destino|traducida|
  |hola|Español|Inglés|Hello|
