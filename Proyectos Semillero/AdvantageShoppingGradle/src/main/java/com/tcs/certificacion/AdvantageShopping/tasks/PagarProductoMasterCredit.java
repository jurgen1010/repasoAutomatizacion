package com.tcs.certificacion.AdvantageShopping.tasks;

import com.tcs.certificacion.AdvantageShopping.userinterfaces.CarroDeCompras;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.PaymentMethod;
import com.tcs.certificacion.AdvantageShopping.userinterfaces.ShippingDetails;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PagarProductoMasterCredit implements Task{

	private String cardnumber,cvv,Mes,Año,cardholdername;
	public PagarProductoMasterCredit(String cardnumber) {
		this.cardnumber=cardnumber;
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
		actor.attemptsTo(Click.on(ShippingDetails.BOTON_NEXT_DOS));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(PaymentMethod.OPCION_MASTERCREDIR),
							Click.on(PaymentMethod.EDIT_MASTERCREDIT),
							Enter.theValue(cardnumber).into(PaymentMethod.CARDNUMBER),
							Enter.theValue(cvv).into(PaymentMethod.CVVNUMBER),
							Click.on(PaymentMethod.LISTAMES),
							Click.on(PaymentMethod.OPCIONMES.of(Mes)),
							Click.on(PaymentMethod.LISTAAÑO),
							Click.on(PaymentMethod.OPCIONAÑO.of(Año)),
							Enter.theValue(cardholdername).into(PaymentMethod.CARDHOLDER_NAME),
							Click.on(PaymentMethod.BOTON_PAYMENT_MASTERCREDIT));
		
	}
	public static PagarProductoMasterCredit conNumeroTargeta(String cardnumber) {
		return Tasks.instrumented(PagarProductoMasterCredit.class, cardnumber);
	}
	public PagarProductoMasterCredit conCvv(String cvv) {
		this.cvv=cvv;
		return this;
	}
	public PagarProductoMasterCredit conMes(String Mes) {
		this.Mes=Mes;
		return this;
	}
	
	public PagarProductoMasterCredit conAño(String Año) {
		this.Año=Año;
		return this;
	}
	public PagarProductoMasterCredit conCardHolderName(String cardholdername) {
		this.cardholdername=cardholdername;
		return this;
	}
	
}
