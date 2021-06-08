Feature: Selecion de productos tecnologicos
  Yo Administrador del portal Demo
  necesito realizar la selección en línea de productos de tecnología
  para seleccionar artículos de tecnología en línea para adicionar al canasto y luego realizar el pago.

  @tag1
  Scenario: Verificar existencia del boton buy now dentro de speakers
    Given que el Administrador se encuentra en la pagina  de Advantage Demo
    When el selecciona la categoria speakers
      | categoria | speakers |
    Then el podra ver el boton buy now dentro de la categoria
      | visibildadboton | true |

  @tag1
  Scenario: Verificar existencia del boton buy now dentro de mices
    Given que el Administrador se encuentra en la pagina  de Advantage Demo
    When el selecciona la categoria mices
      | categoria | mices |
    Then el podra ver el boton buy now dentro de la categoria
      | visibildadboton | true |

  @tag1
  Scenario: Verificar existencia del boton buy now dentro de tablets
    Given que el Administrador se encuentra en la pagina  de Advantage Demo
    When el selecciona la categoria tablets
      | categoria | tablets |
    Then el podra ver el boton buy now dentro de la categoria
      | visibildadboton | true |

  @tag1
  Scenario: Verificar existencia del boton buy now dentro de laptops
    Given que el Administrador se encuentra en la pagina  de Advantage Demo
    When el selecciona la categoria laptops
      | categoria | laptops |
    Then el podra ver el boton buy now dentro de la categoria
      | visibildadboton | true |

  @tag1
  Scenario: Verificar existencia del boton buy now dentro de headphones
    Given que el Administrador se encuentra en la pagina  de Advantage Demo
    When el selecciona la categoria headphones
      | categoria | headphones |
    Then el podra ver el boton buy now dentro de la categoria
      | visibildadboton | true |

  @tag2
  Scenario Outline: Visualizar diferentes vistas de producto de Categoria 
    Given que el Administrador selecciona una categoria
      | categoria   |
      | <categoria> |
    When el selecciona un producto dentro de la categoria
      | nombreProducto   |
      | <nombreProducto> |
    Then el podra ver las diferentes vistas del producto
      | visibildadVistas   |
      | <visibildadVistas> |

    Examples: 
      | categoria  | nombreProducto                                 | visibildadVistas |
      | headphones | Beats Studio 2 Over-Ear Matte Black Headphones | true             |
      | tablets    | HP ElitePad 1000 G2 Tablet                     | true             |

  @tag3
  Scenario Outline: Seleccion de color
    Given que el Administrador selecciona un producto dentro de la categoria
      | categoria   | nombreProducto   |
      | <categoria> | <nombreProducto> |
    When el selecciona el color del producto
      | colorproducto   |
      | <colorproducto> |
    Then el podra ver el color seleccionado
      | resultado   |
      | <resultado> |

    Examples: 
      | categoria  | nombreProducto             | colorproducto | resultado |
      | headphones | HP H2310 In-ear Headset    | TURQUOISE     | TURQUOISE |
      | tablets    | HP ElitePad 1000 G2 Tablet | GRAY          | GRAY      |

  @tag4
  Scenario Outline: Seleccion la cantidad de producto
    Given que el Administrador selecciona un producto dentro de la categoria
      | categoria   | nombreProducto   |
      | <categoria> | <nombreProducto> |
    When el selecciona la cantidad del producto
      | cantidad   |
      | <cantidad> |
    Then el podra ver la cantidad seleccionada
      | resultado   |
      | <resultado> |

    Examples: 
      | categoria  | nombreProducto             | cantidad | resultado |
      | headphones | HP H2310 In-ear Headset    |        5 |         5 |
      | tablets    | HP ElitePad 1000 G2 Tablet |        4 |         4 |

  @tag5
  Scenario Outline: Visualizar espicifaciones de producto
    Given que el Administrador selecciona una categoria
      | categoria   |
      | <categoria> |
    When el selecciona un producto dentro de la categoria
      | nombreProducto   |
      | <nombreProducto> |
    Then el podra ver las especificaciones del producto
      | visibildadEspecificaciones   |
      | <visibildadEspecificaciones> |

    Examples: 
      | categoria  | nombreProducto                                 | visibildadEspecificaciones |
      | headphones | Beats Studio 2 Over-Ear Matte Black Headphones | true                       |
      | tablets    | HP ElitePad 1000 G2 Tablet                     | true                       |
