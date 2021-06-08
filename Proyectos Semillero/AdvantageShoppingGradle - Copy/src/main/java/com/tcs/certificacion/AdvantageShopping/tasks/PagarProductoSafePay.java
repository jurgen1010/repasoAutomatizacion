package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.CarroDeCompras;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.PaymentMethod;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.ShippingDetails;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PagarProductoSafePay implements Task{

	private String username,password;
	public PagarProductoSafePay (String username) {
		this.username=username;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(CarroDeCompras.BOTON_CHECKOUT));
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		actor.attemptsTo(Click.on(ShippingDetails.BOTON_NEXT));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		actor.attemptsTo(Enter.theValue(username).into(PaymentMethod.USERNAME_SAFEPAY),
						Enter.theValue(password).into(PaymentMethod.PASSWORD_SAFEPAY),
						Click.on(PaymentMethod.BOTON_PAY_NOW));
		
		
	}
	public static PagarProductoSafePay conUsername(String username) {
		return Tasks.instrumented(PagarProductoSafePay.class, username);
	}
	public PagarProductoSafePay conPassword( String password) {
		this.password=password;
		return this;
	}

}
