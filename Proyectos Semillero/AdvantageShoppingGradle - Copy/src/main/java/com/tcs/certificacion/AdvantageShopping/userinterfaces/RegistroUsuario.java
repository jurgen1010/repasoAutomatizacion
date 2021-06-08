package com.tcs.certificacion.AdvantageShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistroUsuario {

	public static final Target USERNAME  = Target.the("nombre usuario").locatedBy("//input[@name='usernameRegisterPage']");
	public static final Target EMAIL  = Target.the("email").locatedBy("//input[@name='emailRegisterPage']");
	public static final Target PASSWORD  = Target.the("password").locatedBy("//input[@name='passwordRegisterPage']");
	public static final Target CONFIRMPASSWORD  = Target.the("confirmar password").locatedBy("//input[@name='confirm_passwordRegisterPage']");
	public static final Target FIRSTNAME  = Target.the("nombre").locatedBy("//input[@name='first_nameRegisterPage']");
	public static final Target LASTNAME  = Target.the("apellido").locatedBy("//input[@name='last_nameRegisterPage']");
	public static final Target PHONENUMBER  = Target.the("numero celular").locatedBy("//input[@name='phone_numberRegisterPage']");
	public static final Target COUNTRY  = Target.the("combo pais").locatedBy("//select[@name='countryListboxRegisterPage']");
	public static final Target OPCION_COUNTRY  = Target.the("pais").locatedBy("//select[@name='countryListboxRegisterPage']/option[.='{0}']");
	public static final Target CITY  = Target.the("ciudad").locatedBy("//input[@name='cityRegisterPage']");
	public static final Target ADDRESS  = Target.the("direccion").locatedBy("//input[@name='addressRegisterPage']");
	public static final Target STATE_PROVINCE_REGION  = Target.the("provincia/barrio").locatedBy("//input[@name='state_/_province_/_regionRegisterPage']");
	public static final Target POSTAL_CODE  = Target.the("codigo postal").locatedBy("//input[@name='postal_codeRegisterPage']");
	public static final Target OFFERS_PROMOTIONS  = Target.the("ofertas y promociones").locatedBy("//input[@name='allowOffersPromotion']");
	public static final Target CONDITIONS_OF_USE  = Target.the("condiciones de uso y privacidad").locatedBy("//input[@name='i_agree']");
	public static final Target BOTON_REGISTRAR  = Target.the("boton registrar").locatedBy("//button[@id='register_btnundefined']");
	public static final Target USER_LOGUEADO  = Target.the("usuario resultado").locatedBy("//span[@class='hi-user containMiniTitle ng-binding']");
	public static final Target CAMPO  = Target.the("campo de texto").locatedBy("//div[@id='formCover']//input[not(contains(@data-ng-model,'secModelCompareTo')) and not(contains(@type,'checkbox')) and @name='{0}']");
	public static final Target MENSAJE_LONGITUD_ACCOUNT_DETAILS = Target.the("longitud mensaje").locatedBy("//label[@class='animated invalid']");
	public static final Target MENSAJE_LONGITUD_PERSONAL_DETAILS = Target.the("longitud mensaje").locatedBy("//label[@class='animated invalid']");
	public static final Target PALABRA_ACOUNT_DETAIL = Target.the("palabra acount detail").locatedBy("//*[@id=\"formCover\"]/div/h3[.='ACCOUNT DETAILS']");
	public static final Target PALABRA_PERSONAL_DETAIL= Target.the("palabra personal detail").locatedBy("//*[@id=\"formCover\"]/div/h3[.='PERSONAL DETAILS']");
	public static final Target PALABRA_ADDRESS= Target.the("palabra personal detail").locatedBy("//*[@id=\"formCover\"]/div/h3[.='ADDRESS']");
}
