package com.tcs.certificacion.AdvantageShopping.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentMethod {

	public static final Target TEXTO_PAYMENT_METHOD = Target.the("texto payment method").locatedBy("//label[@class='Choose_payment roboto-medium ng-scope']");
	public static final Target USERNAME_SAFEPAY = Target.the("username safepay").locatedBy("//input[@name='safepay_username']");
	public static final Target PASSWORD_SAFEPAY = Target.the("password safepay").locatedBy("//input[@name='safepay_password']");
	public static final Target BOTON_PAY_NOW = Target.the("boton pay now").locatedBy("//button[@id='pay_now_btn_SAFEPAY']");
	public static final Target OPCION_MASTERCREDIR = Target.the("mastercredit").locatedBy("//input[@name='masterCredit']");
	public static final Target EDIT_MASTERCREDIT = Target.the("edit mastercredit").locatedBy("//label[@class='edit  ng-scope']");
	public static final Target CARDNUMBER = Target.the("cardnumber").locatedBy("//input[@name='card_number']");
	public static final Target CVVNUMBER = Target.the("cvvnumber").locatedBy("//input[@name='cvv_number']");
	public static final Target LISTAMES = Target.the("lista mes").locatedBy("//select[@name='mmListbox']");
	public static final Target OPCIONMES = Target.the("opcion mes").locatedBy("//select[@name='mmListbox']//option[@label='{0}']");
	public static final Target LISTAAÑO = Target.the("lista año").locatedBy("//select[@name='yyyyListbox']");
	public static final Target OPCIONAÑO = Target.the("opcion año").locatedBy("//select[@name='yyyyListbox']//option[@label='{0}']");
	public static final Target CARDHOLDER_NAME = Target.the("card holder name").locatedBy("//input[@name='cardholder_name']");
	public static final Target BOTON_PAYMENT_MASTERCREDIT = Target.the("boton pay now mastercredit").locatedBy("//button[@id='pay_now_btn_ManualPayment']");
	
	
	
	
	
	
}
