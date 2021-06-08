@crecion_usuario
Feature: Registro de nuevos usuarios
  Yo como Administrador del portal DEMO
  necesito la creación de la cuenta de  nuevos usuarios.
  para la fidelización de los clientes y que estos puedan hacer sus compras online

  @registro_exitoso
  Scenario: regitro usuario exitoso
    Given que el administrador se encuentra en la pagina de registro
    When el registra un usuario
      | username | email      | password | confirmpassword | firstname | lastname | phonenumber | country  | city     | address  | state_province_region | postalcode | conditionsofUse | receiveoffers |
      | Jurgen7 | n@nada.com | Roka5555 | Roka5555        | Jurgen    | Perez    |   123456789 | Colombia | Medellín | calle 16 | San Pablo             |      12345 | si              | no            |
    Then el podra ver su nombre de usuario en pantalla
      | usernameEsperado |
      | Jurgen7         |

  @registro_fallido
  Scenario: regitro usuario fallido
    Given que el administrador se encuentra en la pagina de registro
    When el registra un usuario
      | username | email      | password | confirmpassword | firstname | lastname | phonenumber | country  | city     | address  | state_province_region | postalcode | conditionsofUse | receiveoffers |
      | Jurgen   | n@nada.com | Roka5555 | Roka5555        | Jurgen    | Perez    |   123456789 | Colombia | Medellín | calle 16 | San Pablo             |      12345 | no              | no            |
    Then el boton de registro debera estar deshabilitado
      | estadoBoton |
      | false       |

  @logitud_minima_maxima_username
  Scenario Outline: validar longitud minima y maxima de campo usuario
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo username
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor                          | mensaje                   |
      | username    | JurgenJurgensdadadasdadadasdas | Use maximum 15 character  |
      | username    | papa                           | Use 5 character or longer |

  @logitud_minima_maxima_password
  Scenario Outline: validar longitud minima y maxima de campo password
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo password
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor         | mensaje                   |
      | password    | Roka123456789 | Use maximum 12 character  |
      | password    | Rok           | Use 4 character or longer |

  @logitud_minima_maxima_firstname
  Scenario Outline: validar longitud minima y maxima de campo firstname
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo fisrtname
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor                                                   | mensaje                   |
      | firstname   | doakdspoakdpaókdapodkapdoakdpaoksdpaokdapodkapodkapsodk | Use maximum 30 character  |
      | firstname   | a                                                       | Use 2 character or longer |

  @logitud_minima_maxima_lastname
  Scenario Outline: validar longitud maxima y minina de campo lastname
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo lastname
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor                                    | mensaje                   |
      | lastname    | sdoakdpoakdpaodkapodkaspodkapdokapsokdap | Use maximum 30 character  |
      | lastname    | l                                        | Use 2 character or longer |

  @logitud_minima_maxima_phonenumber
  Scenario Outline: validar longitud maxima y minima de campo phonenumber
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo phonenumber
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor                   | mensaje                  |
      | phonenumber | 48237498274928374297429 | Use maximum 20 character |

  @logitud_minima_maxima_city
  Scenario Outline: validar longitud maxima y minima de campo city
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo city
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor                       | mensaje                  |
      | city        | dasdadasdadadasdadadadadada | Use maximum 25 character |

  @logitud_minima_maxima_address
  Scenario Outline: validar longitud maxima de campo address
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo address
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor                                                       | mensaje                  |
      | address     | dlakdaldkañdlkañdlaskdñalkdñaldkañldkasñdlaskdñaslksañldkañ | Use maximum 50 character |

  @logitud_minima_maxima_region
  Scenario Outline: validar longitud maxima de campo state_province_region
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo state_province_region
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo           | valor          | mensaje                  |
      | state_province_region | dadadadadasads | Use maximum 10 character |

  @logitud_minima_maxima_postalcode
  Scenario Outline: validar longitud maxima de campo postalcode
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo postalcode
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor          | mensaje                  |
      | postalcode  | 34242433545343 | Use maximum 10 character |

  @logitud_minima_maxima_email
  Scenario Outline: validar longitud maxima de campo email
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo email
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor                         | mensaje                  |
      | email       | nsdaksdakdoakdaosdka@nada.com | Use maximum 15 character |

  @formato_incorrecto_email
  Scenario Outline: validar formato de campo email incorrecto
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo email con formato
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor     | mensaje                                      |
      | email       | anada.com | Your email address isn't formatted correctly |

  @formato_incorrecto_password
  Scenario Outline: validar formato de campo password incorrecto
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo passwrod con formato
      | nombrecampo   | valor   |
      | <nombrecampo> | <valor> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | nombrecampo | valor | mensaje                         |
      | password    | yuyo  | One upper letter required       |
      | password    | Yuyo  | One number required             |
      | password    | YUYO  | One lower letter required       |
      | password    | Yuyo2 | A special character is required |

  @coincidencia_contraseñas
  Scenario Outline: validar coincidencia de contraseñas faliidos
    Given que el administrador se encuentra en la pagina de registro
    When el diligencia el campo password y confirmpassword
      | password   | confirmpassword   |
      | <password> | <confirmpassword> |
    Then el podra ver el mensaje de advertencia
      | mensaje   |
      | <mensaje> |

    Examples: 
      | password | confirmpassword | mensaje                |
      | Yuyo2    | Yuyo            | Passwords do not match |

  @Obligatoriedad_username
  Scenario: Obligatoriedad de campo username
    Given que el administrador se encuentra en la pagina de registro
    When el registra un usuario sin el campo username
      | username | email      | password | confirmpassword | firstname | lastname | phonenumber | country  | city     | address  | state_province_region | postalcode | conditionsofUse | receiveoffers |
      |          | n@nada.com | Roka5555 | Roka5555        | Jurgen    | Perez    |   123456789 | Colombia | Medellín | calle 16 | San Pablo             |      12345 | si              | no            |
    Then el boton de registro debera estar deshabilitado
      | estadoBoton |
      | false       |

  @Obligatoriedad_email
  Scenario: Obligatoriedad de campo email
    Given que el administrador se encuentra en la pagina de registro
    When el registra un usuario sin el campo email
      | username | email | password | confirmpassword | firstname | lastname | phonenumber | country  | city     | address  | state_province_region | postalcode | conditionsofUse | receiveoffers |
      | Jurgen   |       | Roka5555 | Roka5555        | Jurgen    | Perez    |   123456789 | Colombia | Medellín | calle 16 | San Pablo             |      12345 | si              | no            |
    Then el boton de registro debera estar deshabilitado
      | estadoBoton |
      | false       |

  @Obligatoriedad_password
  Scenario: Obligatoriedad de campo password
    Given que el administrador se encuentra en la pagina de registro
    When el registra un usuario sin el campo password
      | username | email      | password | confirmpassword | firstname | lastname | phonenumber | country  | city     | address  | state_province_region | postalcode | conditionsofUse | receiveoffers |
      | Jurgen   | n@nada.com |          | Roka5555        | Jurgen    | Perez    |   123456789 | Colombia | Medellín | calle 16 | San Pablo             |      12345 | si              | no            |
    Then el boton de registro debera estar deshabilitado
      | estadoBoton |
      | false       |

  @Obligatoriedad_confirmpassword
  Scenario: Obligatoriedad de campo confirmpassword
    Given que el administrador se encuentra en la pagina de registro
    When el registra un usuario sin el campo confirmpassword
      | username | email      | password | confirmpassword | firstname | lastname | phonenumber | country  | city     | address  | state_province_region | postalcode | conditionsofUse | receiveoffers |
      | Jurgen   | n@nada.com | Roka5555 |                 | Jurgen    | Perez    |   123456789 | Colombia | Medellín | calle 16 | San Pablo             |      12345 | si              | no            |
    Then el boton de registro debera estar deshabilitado
      | estadoBoton |
      | false       |

  @Seccion_registro_usuario
  Scenario: Secciones de registro de usuario
    Given que el administrador se encuentra en la pagina de registro
    Then el podra ver el nombre de las tres secciones
      | account_details  | ACCOUNT DETAILS  |
      | personal_details | PERSONAL DETAILS |
      | address          | ADDRESS          |
