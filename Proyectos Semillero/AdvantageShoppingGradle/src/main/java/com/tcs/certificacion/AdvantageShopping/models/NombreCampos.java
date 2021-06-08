package com.tcs.certificacion.AdvantageShopping.models;

public class NombreCampos {

	public static String nombreCampo(String nombrecampo) {

		switch (nombrecampo) {
		case "username":
			return "usernameRegisterPage";

		case "password":
			return "passwordRegisterPage";

		case "firstname":
			return "first_nameRegisterPage";

		case "lastname":
			return "last_nameRegisterPage";

		case "email":
			return "emailRegisterPage";

		case "confirmpassword":
			return "confirm_passwordRegisterPage";

		case "phonenumber":
			return "phone_numberRegisterPage";
		case "city":
			return "cityRegisterPage";
			
		case "address":
			return "addressRegisterPage";
			
		case "state_province_region":
			return "state_/_province_/_regionRegisterPage";
			
		case "postalcode":
			return "postal_codeRegisterPage";
			
		default:
			return "";

		}

	}
}
