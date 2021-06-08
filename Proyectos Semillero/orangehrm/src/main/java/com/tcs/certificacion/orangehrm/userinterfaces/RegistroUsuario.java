package com.tcs.certificacion.orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuario {

	public static final Target COMBOADMIN = Target.the("opcion administrador")
			.locatedBy("//li[@id='menu_admin_viewAdminModule']");
	public static final Target USER_MANAGEMENT = Target.the("opcion user management").
			locatedBy("//li[@id='menu_admin_UserManagement']");
	public static final Target USER = Target.the("opcion user").
			locatedBy("//li[@class='level3']//a[@ui-sref='admin.systemUsers']");
	public static final Target ADDUSER = Target.the("opcion add-user").
			locatedBy("//a[@class='btn-floating btn-large waves-effect waves-light']//i[@class='material-icons']");
	public static final Target EMPLOYENAME = Target.the("opcion add-user").
			locatedBy("//input[@id='selectedEmployee_value']");
	public static final Target USERNAME = Target.the("opcion add-user").
			locatedBy("//input[@id='user_name']");
	public static final Target ADMINROLE = Target.the("opcion adminrole").
			locatedBy("//div[@id='adminrole_inputfileddiv']");
	public static final Target OPCIONADMINROLE = Target.the("seleccion adminrole").
			locatedBy("//li//span[contains(text(),'Global Salary Admin')]");
	
}
