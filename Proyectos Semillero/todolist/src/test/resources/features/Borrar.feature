

Feature: Eliminar tarea
  Yo como usuario de todo list quiero eliminar una nueva tarea

  
  Scenario Outline: Elminar 
    Given que Jurgen se encuentra en la pagina de Todolist con la tarea <tarea> agregada.
    When el selecciona la tarea <tarea>.
    Then el no podra ver la tarea <tareaeliminada> en la lista.

  

    Examples: 
      |tarea  |tareaeliminada|
      | comer | comer        |
      | nadar | nadar        |
