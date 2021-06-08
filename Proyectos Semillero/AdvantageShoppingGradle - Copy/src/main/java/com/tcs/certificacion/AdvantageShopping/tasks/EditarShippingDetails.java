package com.tcs.certificacion.AdvantageShopping.tasks;

import com.openhtmltopdf.swing.SelectionHighlighter;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.CarroDeCompras;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.ShippingDetails;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EditarShippingDetails implements Task{

	private String firstname,lastname,phonenumber,city,address,postalcode,state_province_region;
	public EditarShippingDetails(String firstname) {
		this.firstname=firstname;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CarroDeCompras.BOTON_CHECKOUT));
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(
						Click.on(ShippingDetails.EDITAR_SHIPPING_DETAILS),
						Enter.theValue(firstname).into(ShippingDetails.FIRSTNAME),
						Enter.theValue(lastname).into(ShippingDetails.LASTNAME),
						Enter.theValue(phonenumber).into(ShippingDetails.PHONENUMBER),
						Enter.theValue(city).into(ShippingDetails.CITY),
						Enter.theValue(address).into(ShippingDetails.ADDRESS),
						Enter.theValue(postalcode).into(ShippingDetails.POSTALCODE),
						Enter.theValue(state_province_region).into(ShippingDetails.STATE_PROVINCE_REGION),
						Click.on(ShippingDetails.BOTON_NEXT)
						);
		
	}
	public static EditarShippingDetails conFirstName(String firstname) {
		return Tasks.instrumented(EditarShippingDetails.class, firstname);
	
	}
	public EditarShippingDetails conLastName(String lastname) {
		this.lastname=lastname;
		return this;
	}
	public EditarShippingDetails conPhoneNumber(String phonenumber) {
		this.phonenumber=phonenumber;
	return this;
	}
	public EditarShippingDetails conCity(String city) {
		this.city=city;
	return this;
	}
	public EditarShippingDetails conAddress(String address) {
		this.address=address;
	return this;
	}
	public EditarShippingDetails conPostalcode(String postalcode) {
		this.postalcode=postalcode;
	return this;
	}
	public EditarShippingDetails conState_province_region(String state_province_region) {
		this.state_province_region=state_province_region;
	return this;
	}
	
}
