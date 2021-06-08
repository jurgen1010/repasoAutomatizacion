package com.tcs.certificacion.AdvantageShopping.tasks;

import javax.crypto.spec.RC2ParameterSpec;

import com.tcs.certificacion.AdvantageShopping.interactions.AceptarConditionsOfUse;
import com.tcs.certificacion.AdvantageShopping.interactions.ClickBotonRegistrar;
import com.tcs.certificacion.AdvantageShopping.interactions.RecibirOfertas;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.RegistroUsuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegistrarUsuario implements Task{

	private String username,email,password,confirmpassword,firstname,lastname,
	phonenumber,country,city,address,state_province_region,postalcode,ConditionsofUse,receiveoffers;
	
	public RegistrarUsuario (String username) {
		this.username=username;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(username).into(RegistroUsuario.USERNAME),
						Enter.theValue(email).into(RegistroUsuario.EMAIL),
						Enter.theValue(password).into(RegistroUsuario.PASSWORD),
						Enter.theValue(confirmpassword).into(RegistroUsuario.CONFIRMPASSWORD),
						Enter.theValue(firstname).into(RegistroUsuario.FIRSTNAME),
						Enter.theValue(lastname).into(RegistroUsuario.LASTNAME),
						Enter.theValue(phonenumber).into(RegistroUsuario.PHONENUMBER),
						Click.on(RegistroUsuario.COUNTRY),
						Click.on(RegistroUsuario.OPCION_COUNTRY.of(country)),
						Enter.theValue(city).into(RegistroUsuario.CITY),
						Enter.theValue(address).into(RegistroUsuario.ADDRESS),
						Enter.theValue(state_province_region).into(RegistroUsuario.STATE_PROVINCE_REGION),
						Enter.theValue(postalcode).into(RegistroUsuario.POSTAL_CODE),
						RecibirOfertas.deLaPagina(RegistroUsuario.OFFERS_PROMOTIONS, receiveoffers),
						AceptarConditionsOfUse.deLaPagina(RegistroUsuario.CONDITIONS_OF_USE, ConditionsofUse),
						ClickBotonRegistrar.enEstadoHabilitado(RegistroUsuario.BOTON_REGISTRAR)
						//Click.on(RegistroUsuario.CONDITIONS_OF_USE),
						//Click.on(RegistroUsuario.BOTON_REGISTRAR)
						);
	
		
	}
	public static RegistrarUsuario conUsername(String username) {
	return Tasks.instrumented(RegistrarUsuario.class, username);
		
	}
	public RegistrarUsuario conEmail(String email) {
		this.email = email;
		return this;
	}
	public RegistrarUsuario conPassword(String password) {
		this.password = password;
		return this;
	}
	public RegistrarUsuario conConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
		return this;
	}
	public RegistrarUsuario conFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}
	public RegistrarUsuario conLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}
	public RegistrarUsuario conPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
		return this;
	}
	public RegistrarUsuario conCountry(String country) {
		this.country = country;
		return this;
	}
	public RegistrarUsuario conCity(String city) {
		this.city = city;
		return this;
	}
	public RegistrarUsuario conAddress(String address) {
		this.address = address;
		return this;
	}
	public RegistrarUsuario conState_province_region(String state_province_region) {
		this.state_province_region = state_province_region;
		return this;
	}
	public RegistrarUsuario conPostalcode(String postalcode) {
		this.postalcode = postalcode;
		return this;
	}
	public RegistrarUsuario conConditionsofUse(String conditionsofUse) {
		this.ConditionsofUse = conditionsofUse;
		return this;
	}
	public RegistrarUsuario conReceiveOffers(String receiveoffers) {
		this.receiveoffers = receiveoffers;
		return this;
	}
}
