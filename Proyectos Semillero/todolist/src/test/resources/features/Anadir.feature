

Feature: Añadir Tarea
  Yo como usuario de todo list quiero añadir una nueva tarea

  
  Scenario Outline: Añadir 
    Given que Jurgen se encuentra en la pagina de Todolist
    When el ingresa la <tarea>.
    Then el podra ver la tarea <tareaenlista> en la lista.

    Examples: 
      |tarea  |tareaenlista|
      | comer | comer|
      | nadar | nadar|
