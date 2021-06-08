
Feature: Modulo Usuarios
  Yo como administrador de la pagina Orange
  quiero tener un modulo para crear usuarios
  con el fin de registrar un nuevo personal

  
  Scenario Outline: Registrar usuario exitoso
    Given que el adminsitrador esta en la pagina de registro
    			#|username|contrasena|
    			#|<username>|<contrasena>|
    			|username  |admin   |
    			|contrasena|admin123|
    When el registra un usuario
    			|EmployedName|<EmployedName>|
    			|Username|<Username>        |
    			|ESSRole|<ESSRole>          |
    			|SupervisorRole|<SupervisorRole>|
    			|AdminRole|<AdminRole>|
    			|Status|<Status>|
    			|Password|<Password>|
    Then el podra ver un mensaje de exito   
    
    Examples:
      |username|contrasena| EmployedName  | Username | ESSRole  |SupervisorRole|AdminRole|Status|Password|
      |admin|admin123| Jasmine Morgan|Jasmine   | Default ESS|Default Supervisor|GlobalAdmin|Enabled| user12345|
      
