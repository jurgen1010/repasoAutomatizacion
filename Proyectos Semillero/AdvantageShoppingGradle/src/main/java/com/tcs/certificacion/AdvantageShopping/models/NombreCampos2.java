package com.tcs.certificacion.AdvantageShopping.models;

public  class NombreCampos2 {

	private static String username,password,firstname,lastname,email,confirmpassword,phonenumber,city,address,state_province_region,postalcode;

	public static  String getUsername() {
		return username="usernameRegisterPage";
	}

	public static  String getPassword() {
		return password="passwordRegisterPage";
	}

	public static  String getFirstname() {
		return firstname="first_nameRegisterPage";
	}

	public static  String getLastname() {
		return lastname="last_nameRegisterPage";
	}

	public static  String getEmail() {
		return email="emailRegisterPage";
	}

	public static  String getConfirmpassword() {
		return confirmpassword="confirm_passwordRegisterPage";
	}

	public static  String getPhonenumber() {
		return phonenumber="phone_numberRegisterPage";
	}
	
	public static  String getCity() {
		return city="cityRegisterPage";
	}

	public static  String getAddress() {
		return address="addressRegisterPage";
	}

	public static  String getState_province_region() {
		return state_province_region="state_/_province_/_regionRegisterPage";
	}

	public static  String getPostalcode() {
		return postalcode="postal_codeRegisterPage";
	}
	
}
