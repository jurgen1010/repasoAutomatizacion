
Feature: transferencias a cuentas
  Yo como usuario de banistmo
  quiero realizar transferencias entre cuentas propias
	para gestionar mi dinero
  
  Scenario: transferencia a cuents propias
    Given que Jurgen esta en la pagina de transferencias cuentas propias
    When el realiza la transferencia 
    Then el vera los saldos de sus cuentas actualizados

   
