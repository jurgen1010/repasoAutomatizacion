@compra_de_productos
Feature: Compra en linea de productos tecnologicos
  Yo como Usuario  del portal Demo
  necesito realizar la compra en línea de productos de tecnología
  para seleccionar artículos de tecnología de la página, realizando el pago en línea.

  @Informacion_Producto_Canasto
  Scenario Outline: Verificar informacion de productos agregados al canasto
    Given que el usuario ha seleccionado un producto
      | nombrecategoria   | nombreproducto   | color   | cantidad   |
      | <nombrecategoria> | <nombreproducto> | <color> | <cantidad> |
    When el agrega el producto al carro de compras
    Then el podra ver la informacion del producto agregado
      | cantidad   | precio   | imagen   | color   | nombreproducto   |
      | <cantidad> | <precio> | <imagen> | <color> | <nombreproducto> |

    Examples: 
      | nombrecategoria | nombreproducto          | color | precio | cantidad | imagen |
      | headphones      | HP H2310 In-ear Headset | BLACK | $27.98 |        2 | true   |

  @Editar_Shipping_Details
  Scenario: Editar informacion de Shiping Details
    Given que el usuario se ha logueado en la pagina Advantage Demo con credenciales
      | username | password |
      | Jurgen   | Roka5555 |
    When el agrega un producto al canasto de compra
      | nombrecategoria | nombreproducto          | color | precio | cantidad |
      | headphones      | HP H2310 In-ear Headset | BLACK | $27.98 |        2 |
    And edita la informacion en la seccion Shipping Details
      | firstname | lastname | phonenumber | city | address  | postalcode | state_province_region |
      | Yuyo      | Londoño  |  1234564532 | Cali | Calle 25 |      54321 | Pance                 |
    Then el podra ver la seccion de Payment Method
      | esperado | Choose payment method below |

  @Compra_con_SafePay
  Scenario: Compra de producto con metodo SafePay
    Given que el usuario ha seleccionado un producto tecnologico
      | username | password | nombrecategoria | nombreproducto          | color | cantidad |
      | Jurgen   | Roka5555 | headphones      | HP H2310 In-ear Headset | BLACK |        2 |
    When el reliza el pago por medio de SafePay
      | usernamesafepay | passwordsafepay |
      | Jurgen          | Roka5555        |
    Then el podra ver un mensaje de agradecimiento
      | visibilidadmensaje | true |

  @Compra_con_MasterCredit
  Scenario: Compra de producto con metodo MasterCredit
    Given que el usuario ha seleccionado un producto tecnologico
      | username | password | nombrecategoria | nombreproducto          | color | cantidad |
      | Jurgen   | Roka5555 | headphones      | HP H2310 In-ear Headset | BLACK |        2 |
    When el reliza el pago por medio de MasterCredit
      | cardnumber | cvv | Mes | Año  | cardholdername |
      | 098734567893     | 123 |  06 | 2020 | Jurgen         |
    Then el podra ver un mensaje de agradecimiento
      | visibilidadmensaje | true |
